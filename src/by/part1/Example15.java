package by.part1; //необязательно

//в файле может быть только один public класс
//Названия классов начинаются с большой буквы
public class Example15 {

  public static void main(String args[]) {
    int[] numbers = {10, 20, 30, 40, 50};

    for (int x : numbers) {
      System.out.print(x);
      System.out.print(",");
    }
    System.out.print("\n");
    String[] names = {"Олег", "Иван", "Дима", "Юля"};
    for (String name : names) {
      System.out.print(name);
      System.out.print(",");
    }
  }

}
