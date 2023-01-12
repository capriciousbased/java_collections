import java.util.ArrayList;

public class wholeNumbers {

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(3454);
    numbers.add(7343);
    numbers.add(1232);
    numbers.add(93);
    numbers.add(5542);

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
    /*     for(int i=0; i<numbers.size(); i++) {
      if (numbers.get(i) % 2 == 0) {
          System.out.println(numbers.get(i));
      }
  } */
  }
}
