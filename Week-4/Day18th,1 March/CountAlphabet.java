import java.util.Scanner;
class StringVowel{
  static void convert(String str1){
    char a[]=str1.toCharArray();
    int count=0;
    for(int i=0;i<a.length;i++){
        if (a[i]=='a'|| a[i]=='e'||a[i]=='i'|| 
         a[i]=='o'||a[i]=='u')
          {
            count++;
         
          }
          
      }
    System.out.println(count);
    
      
    }
  
  public static void main(String args[]){
    convert("Sirisurya13@gmail.com");
  }
}