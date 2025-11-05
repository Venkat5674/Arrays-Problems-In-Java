import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        char arr[] = new char[n];

        System.out.println("Enter characters:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.next().charAt(0);
        }

        for(int i = 0, j = arr.length - 1; i < j; i++, j--){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        System.out.println("Reversed: " + Arrays.toString(arr));


    }
}
