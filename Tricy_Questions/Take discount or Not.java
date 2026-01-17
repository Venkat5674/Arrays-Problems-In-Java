import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();

            int[] A = new int[N];
            int sumWithout = 0;
            int sumWith = 0;

            // Read prices and calculate sum without coupon
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                sumWithout += A[i];
            }

            // Apply discount
            for (int i = 0; i < N; i++) {
                int discountedPrice = A[i] - Y;
                if (discountedPrice < 0) {
                    discountedPrice = 0;
                }
                sumWith += discountedPrice;
            }

            // Add coupon cost
            sumWith += X;

            // Decision
            if (sumWith < sumWithout) {
                System.out.println("COUPON");
            } else {
                System.out.println("NO COUPON");
            }
        }

        sc.close();
    }
}
