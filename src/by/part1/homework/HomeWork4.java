package by.part1.homework;

public class HomeWork4 {

  //  Complete the program which takes date in number format and then makes its addition of the digits until
// the last digit remains single and the print the number as lucky number.
// example if input is 777 then 7+7+7 =21 = 2+1 =3 so the answer is 3.
  public static void main(String[] args) {
    int input = 7777, sum = 0, buffer = 0;

    System.out.println(input);
    while ((input+"").length()>1) {
      while(input>0) {
              buffer = input;
              buffer %= 10;
              sum += buffer;
              input /= 10;
              }
              input = sum;
              sum = 0;
    }

    System.out.println(input);
  }
}



