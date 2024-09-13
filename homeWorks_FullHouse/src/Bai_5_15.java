import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bai_5_15 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer tokenizer;

        tokenizer = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        long[] arr = new long[n*2];

        tokenizer = new StringTokenizer(br.readLine());

        for (int i = 0; i < n * 2; i++) {
            arr[i] = Long.parseLong(tokenizer.nextToken());
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("%d %d ", arr[i], arr[i + n]);
        }

        br.close();
    }
}
