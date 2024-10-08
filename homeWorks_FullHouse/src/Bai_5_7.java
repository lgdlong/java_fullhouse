import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bai_5_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer;

        tokenizer = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        long[] arr = new long[n];

        tokenizer = new StringTokenizer(br.readLine());

        long sum = 0;
        long MAX = Integer.MIN_VALUE;
        long MIN = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(tokenizer.nextToken());

            sum += arr[i];

            // Find max
            if (arr[i] > MAX) MAX = arr[i];

            // Find min
            if (arr[i] < MIN) MIN = arr[i];
        }

        long avg = sum / arr.length;

        System.out.printf("%d\n%d\n%d\n%d", sum, avg, MAX, MIN);

        br.close();
    }
}