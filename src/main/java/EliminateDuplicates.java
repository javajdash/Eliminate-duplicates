/* 7.15 (Eliminate duplicates) Write a method that returns a new array by eliminating the duplicate values in the array using the following method header:

public static int[] eliminateDuplicates(int[] list)

Write a test program that reads in ten integers, invokes the method, and displays the result. Here is the sample run of the program:

Enter ten numbers: 1 2 3 2 1 6 3 4 5 2
The distinct numbers are: 1 2 3 6 4 5
*/
import java.util.Scanner;
import java.util.Arrays;

public class EliminateDuplicates {
  public static void main(String[] args) {
    //Prompt user to enter 10 integers
    Scanner input = new Scanner(System.in);
    System.out.print("Enter ten numbers: ");

    //Store the 10 integers in an array
    int[] list = new int[10];
    for (int i = 0; i < list.length; i++){
      list[i] = input.nextInt();
    }
    //Display the distinct numbers
    int[] distinct = eliminateDuplicates(list);
    System.out.print("The distinct numbers are: ");
    for (int num : distinct){
      if (num != 0);
        System.out.print(num + " ");
    }
  }

  public static int[] eliminateDuplicates(int[] list){
    //Create a new array to store the distinct numbers
    int[] distinct = new int[list.length];
    int count = 0;
    //Check if the number is already in the array
    for (int i = 0; i < list.length; i++){
      boolean duplicate = false;
      
      //Check if the number is a duplicate
      for (int j = 0; j < i; j++){
        if (list[i] == list[j]){
          duplicate = true;
          break;
        }
      }
      //If the number is not a duplicate, add it to the distinct array
      if (!duplicate){
        distinct[count] = list[i];
        count++;
      }
    }
    //Create a new array with the size of the distinct numbers
    int[] result = Arrays.copyOf(distinct, count);
    return result;
  }
}