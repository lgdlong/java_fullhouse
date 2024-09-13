import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer;

        tokenizer = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        long[] arr = new long[n];

        tokenizer = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(tokenizer.nextToken());
        }

        System.out.print(Maximum(arr));

        br.close();
    }
    public static long Maximum(long[] arr) {
        int count = 0;
        int posLast = arr.length - 1;
        if (arr[0] > arr[1]) count++; // Check arr[0]
        if (arr[posLast] > arr[posLast - 1]) count++; // Check arr[n-1]
        for (int i = 1; i <= posLast - 1; i++) {
            if (arr[i-1] < arr[i] && arr[i] > arr[i+1]) count++;
        }
        return count;
    }
}
