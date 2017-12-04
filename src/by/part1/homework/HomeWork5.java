package by.part1.homework;

public class HomeWork5 {

  //  Complete the following program which takes input as a number and converts it into string format.
// Initially arrays of string are given just use it for your logic.
// example: Enter the number: 54 Entered number is: fifty four
  public static void main(String[] args) {
    int input = 69;
    String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    String[] arr11 = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    String[] arr10 = {"","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};

    String strinput = String.valueOf(input);
    int qnt1 = Integer.valueOf(strinput.substring(0,1));
    int qnt2 = Integer.valueOf(strinput.substring(1,2));

    if (input>10 && input<20){
      System.out.println(arr11[qnt2]);
    } else if (strinput.length()<2){
      System.out.println(arr[qnt1]);
    }else {
      System.out.println(arr10[qnt1]+" "+arr[qnt2]);
    }
  }
}
