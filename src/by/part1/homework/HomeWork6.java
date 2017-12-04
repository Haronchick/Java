package by.part1.homework;

public class HomeWork6 {

  //  Write a program which takes input integer array which contains positive and negative numbers
// and find out the average of positive and average of negative numbers.
// Example :
// 1.If user gives input 9,-1,-1,-4,1,5,-4,2,-3,1 then output will be :
//      Average of positive numbers: 3.6
//      Average of negative numbers: -2.6
// 2.If user gives input 12,4,-5,4,-7,-2,6,14,-8,10 then output will be
//      Average of positive numbers: 8.33
//      Average of negative numbers: -5.5
  public static void main(String[] args) {
  int[] arr1 = {9,-1,-1,-4,1,5,-4,2,-3,1};
  int[] arr2 = {12,4,-5,4,-7,-2,6,14,-8,10};
  double result1 = 0, result2 = 0;
  int  i1 = 0, i2 =0;

  for (int number : arr2){
    if (number < 0){
       result1 += Math.abs(number);
       i1++;
    } else {
       result2 += number;
       i2++;
    }
  }

  System.out.print("Average of positive numbers: ");
  System.out.printf("%.2f", result2 / i2);
  System.out.println(" ");
  System.out.print("Average of negative numbers: -");
  System.out.printf("%.2f", result1 / i1);
  }
}
