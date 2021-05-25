import java.util.*;

/**
 * Main class for bubble sort demo.
 */
class Main {
  /**
   * Application entry point.
   *
   * @param args Command-line arguments; ignored bye 
   * this app.
   */
  public static void main(String[] args) {
    // create and display initial random array
    Random prng = new Random();
    int[] arr = new int[16];
    for(int i = 0; i < arr.length; i++) {
      arr[i] = prng.nextInt(100);
    }
    System.out.println("Initial array:");
    System.out.println(Arrays.toString(arr));

    // sort w/ bubble sort, display results
    BubbleSort bs = new BubbleSort();
    bs.bubbleSort(arr);
    System.out.println("Sorted array:");
    System.out.println(Arrays.toString(arr));

  }
}