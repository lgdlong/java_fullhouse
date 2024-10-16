import java.util.ArrayList;

public class Bai_6_5 {
    public static void main(String[] args) {
        String S = "869357495356872";
        int lengthOfS = S.length();
        int K = 9;

        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i <= lengthOfS - K; i++) {
            arr.add(S.substring(i, i + K));
        }

        // find the min number string
        String MIN = findMinNumStr(arr);



        System.out.println(arr);
    }

    public static String findMinNumStr(ArrayList<String> arr) {
        // linear search
        String min = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i).compareTo(min) < 0) {
                min = arr.get(i);
            }
        }

        return min;
    }
}
