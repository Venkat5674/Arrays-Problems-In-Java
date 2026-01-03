import java.util.*;

public class ElementSearch {
    public static void main(String[] args) {
        // Declare and initialize the array
        int[] arr = {10, 20, 30, 40};

        // Element to search for
        int target = 30;

        // Variable to track if element is found
        boolean found = false;

        // Loop through array elements
        for (int num : arr) {
            if (num == target) {
                found = true;
                break;
            }
        }

        // Display result
        System.out.println(found ? "Element is Found" : "Not Found");
    }
}
