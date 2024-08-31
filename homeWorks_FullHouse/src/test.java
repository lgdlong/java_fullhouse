import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int SUM = Arrays.stream(arr).sum();
        System.out.println(SUM);
    }

}
