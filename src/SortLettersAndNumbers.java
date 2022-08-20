/*Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.*/

public class SortLettersAndNumbers {

    public static void main(String[] args) {
        String given = "CDB098dbc90ba";
        System.out.println(given);
        System.out.println(sortPartsByOl_Me(given));
    }

    private static String sortPartsByOl_Me(String given) {

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
