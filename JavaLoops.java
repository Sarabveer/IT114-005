public class JavaLoops {
  public static void main(String[] args) {
    // 1. Create an array/collection of numbers
    int[] array = { 6, 8, 11,	19,	34,	41,	50, 84, 87, 96 };

    // 2. Create a loop that loops over each number and shows their value.
    System.out.print("Array: ");
    for(int i = 0; i < array.length; i += 1) {
      System.out.print(array[i] + " ");
    }
    System.out.print("\n");

    // 3. Have the loop output only even numbers regardless of how long the array/collection is.
    System.out.print("Even Numbers: ");
    for(int i = 0; i < array.length; i += 1) {
      if(array[i] % 2 == 0) {
        System.out.print(array[i] + " ");
      }
    }
    System.out.print("\n");
  }
}
