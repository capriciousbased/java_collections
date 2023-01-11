import java.util.ArrayList;

public class Arraylist {

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(3034);
    numbers.add(745);
    numbers.add(145);
    numbers.add(92);
    numbers.add(132);

    int max = findMax(numbers);
    System.out.println("The maximum value is: " + max);
    printEvenNumbers(numbers);
  }

  public static int findMax(ArrayList<Integer> numbers) {
    int max = Integer.MIN_VALUE;
    for (int num : numbers) {
      if (num > max) {
        max = num;
      }
    }
    return max;
  }

  public static void printEvenNumbers(ArrayList<Integer> numbers) {
    for (int num : numbers) {
      if (num % 2 == 0) {
        System.out.println(num);
      }
    }
  }
}
