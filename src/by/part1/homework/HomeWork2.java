package by.part1.homework;

public class HomeWork2 {

  //  Write a program which takes two integers N and M and produces last samples of N of the integers from N-1 to N-M.
// example:
// 1) if user inputs N = 10 M = 4 output will be 9 8 7 6 means it produces last 4 samples from 0 to 10.
// 2) if user inputs N = 5 M = 2 output will be 4 3
  public static void main(String[] args) {
    int n = 10, m=4;

    for(int x = 1; x <= m; x++){
      System.out.print(n-x);
      System.out.print(' ');
    }
    System.out.println(' ');
    n = 5;
    m = 2;
    for(int x = 1; x <= m; x++){
      System.out.print(n-x);
      System.out.print(' ');
    }
  }
}
