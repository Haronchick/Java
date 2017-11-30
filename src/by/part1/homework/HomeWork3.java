package by.part1.homework;

public class HomeWork3 {

  //  Write a program which takes input as string and check if it is palindrome or not.
// If the string and the reverse of string are same then we say string is palindrome.
  public static void main(String[] args) {
      String[] arr = {"Доход","точка","казак"} ;


      for(String name : arr){
        String namerevers = "";
        for(int i = name.length() - 1; i >= 0; i--){
          namerevers += name.charAt(i);
        }
       if (name.compareToIgnoreCase(namerevers) == 0) {
          System.out.println("Palindrome");
        } else {
          System.out.println("Common word");
       }
      }
      System.out.println(' ');

      String[] arr2 = {"Кулак","Коток","пончик"} ;
      for (String name2 : arr2){
        StringBuffer buffer = new StringBuffer(name2);
        if (name2.compareToIgnoreCase( buffer.reverse().toString()) == 0){
          System.out.println("Palindrome");
        } else {
          System.out.println("Common word");
        }
      }



  }
}
