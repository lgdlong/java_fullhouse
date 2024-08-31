import java.util.Scanner;

/* TÍNH TỔNG CÁC PHẦN TỬ TRONG MẢNG SỐ NGUYÊN */
public class Program_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n <= 0) { // Check input n >= 0
            System.out.println("Invalid number of elements");
        }
        else {
            int[] arr = new int[n];  // Create array
            for (int i = 0; i < n; i++) {
                System.out.print("arr[" + i + "] = ");
                arr[i] = sc.nextInt();
            }

            System.out.println(sum(arr));
        }
        sc.close();
    }
    public static long sum(int[] arr) {
        long sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
}
