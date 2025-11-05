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

        int count = 0;
        for(char c : arr){
            if("aeiouAEIOU".indexOf(c) != -1){
                count++;
                }
            }
        System.out.println("Vowels Count = " + count);

    }
}
