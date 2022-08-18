/*Mumbling
        This time no story, no theory.
        The examples below show you how to write function accum:

        Examples:accum("abcd") -> "A-Bb-Ccc-Dddd“
        accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy“
        accum("cwAt") -> "C-Ww-Aaa-Tttt“
        The parameter of accum is a string which includes only letters from a..z and A..Z.*/


public class Accumul {
    //please copy paste your code
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(accumulateChars(str));
    }

    public static String accumulateChars(String str){
        String result = "";
        for(int i = 0; i < str.length(); i++){
            result += str.substring(i, i + 1).toUpperCase() + str.substring(i, i + 1).repeat(i).toLowerCase();
            if(i != str.length() - 1) result += "-";
        }
        return result;
    }
}
