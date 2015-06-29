import java.io.IOException;

/**
 * Created by brianhoehne on 6/29/15.
 */
public class HiddenDigits {

    private static char[] hiddenDigits = {'a','b','c','d','e','f','g','h','i','j'};
    private static char[] digits = {'0','1','2','3','4','5','6','7','8','9'};

    private static String[] testCases =
            {"abcdefghik",
            "Xa,}A#5N}{xOBwYBHIlH,#W",
            "(ABW>'yy^'M{X-K}q,",
            "6240488"};



    public static void main (String[] args) throws IOException {
        for (int i = 0; i < testCases.length; i++){
            String test_case = testCases[i];
            String ans = "";

            for(int j = 0; j < test_case.length(); j++){
                ans += convertToDigit(test_case.charAt(j));
            }

            if (ans.length() == 0) {
                System.out.println("None");
            }else {
                System.out.println(ans);
            }
        }

    }

    public static String convertToDigit (char c) {
        // Returns a digit if char is a digit or in the hiddenDigits array or ""



        for (int i = 0; i < 10; i++){
            if (c == hiddenDigits[i] || c == digits[i]) {
                return "" + i;
            }
        }
        return "";
    }



}
