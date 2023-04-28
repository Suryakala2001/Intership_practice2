//Write a program that creates an ArrayList of Book objects. Each Book object should have a title (String), an author (String), and a price (double). The program should allow the user to add and remove books from the list, and also allow the user to print out all the books in the list.


import java.util.*;
class Book{
  private String title;
  private String author;
  private double price;

  public Book(String title,String author,double price){
    this.title=title;
    this.author=author;
    this.price=price;
  }
  public String getTitle(){
    return title;
  }
  public void setTitle(String title){
    this.title=title;
  }
  public String getAuthor(){
    return author;
  }
  public void setAuthor(String author){
    this.author=author;
  }
  public Double getPrice(){
    return price;
  }
  public void setPrice(double price){
    this.price=price;
  }

  public String toString(){
    return"Title"+title+"Author"+author+"Price"+price;
    
  }
}

public class BookManagementSystem{
   void insert(ArrayList<Book> bk){
     Scanner sc=new Scanner(System.in);
     for(int i=0;i<5;i++){
       bk.add(new Book(sc.next(),sc.next(),sc.nextDouble()));
     }
   }
  void remove(ArrayList<Book> bk){
    bk.remove(0);
  }
  void display(ArrayList<Book>bk){
    for(Book b:bk){
      System.out.println(b);
    }
  }
  public static void main(String args[]){
    ArrayList<Book> bk=new ArrayList<Book>();
    BookManagementSystem  b=new BookManagementSystem();
    
    Scanner sc=new Scanner(System.in);
      int choice ;
      do{
        System.out.println("1. Add Book");
        System.out.println("2. Remove Book");
        System.out.println("3. Display");
        System.out.println("Enter the choice:");
            choice=sc.nextInt();
        switch(choice){
        case 1:
          b.insert(bk);
          break;
        
        case 2:
          b.remove(bk);
          break;
        
        case 3:
          b.display(bk);
          break;
        
        case 4:
          System.out.println("Thank you");
          break;
          default:
                System.out.println("Invalid choice. Please try again.");
                  break;
        
      }
        
    }while(choice!=4);
    
  }
  }
   
 
  
