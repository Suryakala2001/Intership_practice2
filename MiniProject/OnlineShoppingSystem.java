
 
//Create an interface called "Product" that defines the basic properties of a product such as the name, description, price, and quantity.
//Create two classes that implement the "Product" interface: "ElectronicProduct" and "ClothingProduct". "ElectronicProduct" should have additional properties such as brand and warranty while "ClothingProduct" should have additional properties such as size and color.
//Create a class called "ShoppingCart" that stores the products selected by the user.
//Create a class called "Checkout" that handles the payment and shipping of the products in the shopping cart.
//Use custom exceptions to handle cases such as insufficient stock or invalid payment information.
//Implement additional features such as search,


import java.util.*;

interface Product {
  String getName();
  String getDescription();
  double getPrice();
  int getQuantity();
}

class ElectronicProduct implements Product {
  private String name;
  private String description;
  private double price;
  private int quantity;
  private String brand;
  private String warranty;
  public ElectronicProduct(String name, String description, double price, int quantity, String brand, String warranty) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantity = quantity;
    this.brand = brand;
    this.warranty = warranty;
  }
  
  public String getName() {
    return name;
  }
  
  public String getDescription() {
    return description;
  }
  
  public double getPrice() {
    return price;
  }
  
  public int getQuantity() {
    return quantity;
  }
  
  public String getBrand() {
    return brand;
  }
  
  public String getWarranty() {
    return warranty;
  }
  
  public String toString() {
    return String.format("%5s %10s %10f %8d %20s %17s", 
 name,description,price,quantity,brand,warranty);
  }
}

class ClothingProduct implements Product {
    private String name;
    private String description;
    private double price;
    private int quantity;
    private String size;
    private String color;

    public ClothingProduct(String name, String description, double price, int quantity, String size, String color) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.size = size;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

   public String toString() {
    return String.format("%5s %10s %10f %8d %20s %17s", name, description, price, quantity, size, color);
   }
}
class ShoppingCart {
    private ArrayList<Product> items = new ArrayList<Product>();
    private ArrayList<ElectronicProduct> electronicProducts = new ArrayList<ElectronicProduct>();
    private ArrayList<ClothingProduct> clothingProducts = new ArrayList<ClothingProduct>();

    void addItem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product type (1 for ElectronicProduct, 2 for ClothingProduct): ");
        int productType = sc.nextInt();
        if (productType == 1) {
            System.out.print("Enter product name: ");
            String name = sc.next();
            System.out.print("Enter product description: ");
            String description = sc.next();
            System.out.print("Enter product price: ");
            double price = sc.nextDouble();
            System.out.print("Enter product quantity: ");
            int quantity = sc.nextInt();
            System.out.print("Enter product brand: ");
            String brand = sc.next();
            System.out.print("Enter product warranty (in years): ");
            String warranty = sc.next();
            ElectronicProduct electronicProduct = new ElectronicProduct(name, description, price, quantity, brand, warranty);
            items.add(electronicProduct);
            electronicProducts.add(electronicProduct);
        } else if (productType == 2) {
            System.out.print("Enter product name: ");
            String name = sc.next();
            System.out.print("Enter product description: ");
            String description = sc.next();
            System.out.print("Enter product price: ");
            double price = sc.nextDouble();
            System.out.print("Enter product quantity: ");
            int quantity = sc.nextInt();
            System.out.print("Enter product size: ");
            String size = sc.next();
            System.out.print("Enter product color: ");
            String color = sc.next();
            ClothingProduct clothingProduct = new ClothingProduct(name, description, price, quantity, size, color);
            items.add(clothingProduct);
            clothingProducts.add(clothingProduct);
        } else {
            System.out.println("Invalid product type. Please try again.");
        }
    }

    void removeItem(int index) {
        if (index >= 0 && index < items.size()) {
            items.remove(index);
            System.out.println("Item removed.");
        } else {
            System.out.println("Invalid index. Please try again.");
        }
    }

    void displayCart() {
        if (electronicProducts.isEmpty()) {
            System.out.println("No electronic products in cart.");
        } else {
            System.out.println("Electronic Products:");
            System.out.printf("%5s %10s %10s %8s %20s %17s", "Name", "Description", "Price", "Quantity", "Brand", "Warranty");
            for (ElectronicProduct product : electronicProducts) {
                System.out.println(product);
            }
        }
    
        if (clothingProducts.isEmpty()) {
            System.out.println("No clothing products in cart.");
        } else {
            System.out.println("\nClothing Products:");
            System.out.printf("%5s %10s %10s %8s %20s %17s","Name","Description","Price","Quantity","Size","Color");
          for(ClothingProduct product:clothingProducts){
            System.out.println(product);
          }
        }
    }
  public void searchCart(String name) {
    boolean found = false;
    for (Product item : items) {
        if (item.getName().equals(name)) {
            System.out.println("Product found:");
            System.out.println(item.toString());
            found = true;
        }
    }
    if (!found) {
        System.out.println("Product not found.");
    }
  }
   double calculateTotalPrice() { 
    double totalPrice = 0;
    for (int i = 0; i < items.size(); i++) {
      totalPrice += items.get(i).getPrice() * items.get(i).getQuantity();
    }
    return totalPrice;
  }
  Boolean ISEmpty() {
    return items.isEmpty();
}
 public void clearCart() {
    items.clear();
 }

}

class Checkout {
    private ShoppingCart cart;

    public Checkout(ShoppingCart cart) {
        this.cart = cart;
    }
  public void processPayment() {
   if (cart.ISEmpty()) {
        System.out.println("Your cart is empty.");
        return;
    }
    double totalPrice = cart.calculateTotalPrice();
    System.out.println("\nYour total price is: $" + totalPrice);
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your account number: ");
    String accountNumber = sc.next();
    System.out.println("Thank you for your purchase!");
    cart.clearCart();
  }
}

class OnlineShopping{
  public static void main(String[] args) {
    ShoppingCart cart = new ShoppingCart();
    Checkout pay=new Checkout(cart);
    Scanner sc = new Scanner(System.in);
    int choice;
    do {
      System.out.println("\nWelcome to the shopping cart application!");
      System.out.println("1. Add item to cart");
      System.out.println("2. Remove item from cart");
      System.out.println("3. Display cart");
      System.out.println("4. Checkout");
      System.out.println("5. Search");
      System.out.println("0. Exit");
      System.out.print("Enter your choice: ");
      choice = sc.nextInt();

        switch (choice) {
          case 1:
            cart.addItem();
            break;
          case 2:
            System.out.print("Enter the index of the item to remove: ");
            int index = sc.nextInt();
            cart.removeItem(index);
            break;
          case 3:
            cart.displayCart();
            break;
          case 4:
            pay.processPayment();
            break;
          case 5:
            System.out.print("Enter product name: ");
            String name = sc.next();
            cart.searchCart(name);
            break;
          case 0:
            System.out.println("Goodbye!");
            break;
          default:
            System.out.println("Invalid choice. Please try again.");
            break;
        }
    } while (choice != 0);
  }
}


//A book management system is a software application designed to help users manage their books and related information, such as author names, publishers, book categories, and book availability. The system can be used by individuals or institutions, such as libraries, bookstores, and schools.

//The key features of a book management system typically include:

//Book inventory management: The system should allow users to add, update, and delete books from the inventory. It should also keep track of the number of copies available, the location of each book, and any other relevant information.

//Cataloging: The system should provide an efficient way to organize books by author, title, category, and other relevant criteria. This will help users quickly find the book they need.

//Borrowing and lending management: The system should allow users to track the borrowing and lending of books. It should also keep track of due dates and any overdue fines.

//Reporting: The system should provide reports on book availability, overdue books, and other relevant information. This will help users make informed decisions about book management.

//User management: The system should allow users to create and manage accounts, and control access to books and other resources.

//Overall, a book management system can help individuals and institutions to efficiently manage their book inventory, save time, and reduce errors. It can also provide valuable insights into book usage patterns, which can inform purchasing decisions and other strategic decisions.






