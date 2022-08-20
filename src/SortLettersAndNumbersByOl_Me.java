import java.util.ArrayList;
import java.util.Arrays;

    /*
    Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
    sort the individual string and append them back together

        Ex:
            Input: "DC501GCCCA098911"
            Output: "CD015ACCCG011899"

     */


public class SortLettersAndNumbersByOl_Me {
    public static void main(String[] args) {
        String given = "CDB098dbc90ba";
        System.out.println(given);
        System.out.println(sortParts(given));
    }

    private static String sortParts(String given) {

        ArrayList<String> parts = new ArrayList<>();

        while (given.length() > 0) {
            boolean isLetter = Character.isLetter(given.charAt(0));
            String result = "";
            if (isLetter) {
                for (char ch : given.toCharArray()) {
                    if (!Character.isLetter(ch)) break;
                    result += "" + ch;
                }
                parts.add(result);
            } else {
                for (char ch : given.toCharArray()) {
                    if (Character.isLetter(ch)) break;
                    result += "" + ch;
                }
                parts.add(result);
            }
            given = given.substring(result.length());
        }

        for (String eachPart : parts) {
            char[] arr = eachPart.toCharArray();
            Arrays.sort(arr);
            for (char ch : arr) {
                given += ch;
            }
        }

        return given;
    }

}
