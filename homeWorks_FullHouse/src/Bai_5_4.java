import java.util.ArrayList;
import java.util.Scanner;

public class Bai_5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Long> arr = new ArrayList<>();

        long temp;
        for (int i = 0; i < n; i++) {
            temp = sc.nextLong();
            arr.add(temp);
        }

        System.out.print(Maximum(arr));

    }
    public static int Maximum(ArrayList<Long> arr) {
        int count = 0;
        int posLast = arr.size() - 1;
        if (arr.get(0) > arr.get(1)) count++; // Check arr[0]
        if (arr.get(posLast) > arr.get(posLast - 1)) count++; // Check arr[n-1]
        for (int i = 1; i <= posLast - 1; i++) {
            if (arr.get(i-1) < arr.get(i) && arr.get(i) > arr.get(i+1)) count++;
        }
        return count;
    }
}
