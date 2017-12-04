package by.part1.homework;

public class HomeWork8 {

  //  Write a program to read English text and print a count of word lengths,
// Example:
// the total number of words of length 1 which occurred, the number of length 2, and so on.
  public static void main(String[] args) {
    String str = "keep calm and carry on";
    int w1=0, w2=0, w3=0, w4=0, w5=0, w6=0, w7 = 0;
    int[] arr = {0,0,0,0,0,0,0,0};

    for (String word : str.split(" ")){
      switch (word.length()){
        case 1:
          arr[1]++;
          break;
        case 2:
          arr[2]++;
          break;
        case 3:
          arr[3]++;
          break;
        case 4:
          arr[4]++;
          break;
        case 5:
          arr[5]++;
          break;
        case 6:
          arr[6]++;
          break;
        case 7:
          arr[7]++;
          break;
        default:
          System.out.println("Empty");
      }
    }

    for (int i=1;i<=7;i++) {
      System.out.println("the total number of words of length" + i + ": -" + arr[i]);
    }
  }
}
