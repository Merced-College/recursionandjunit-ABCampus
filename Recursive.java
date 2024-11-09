
import java.util.*;

public class Recursive {

    public static void main(String[] args) {
        System.out.println(countHi2("hihix"));
    }

    public static int count8(int n) {//counts numbers 8s in an int, double if an 8 is following
        if (n == 0) {
            return 0;//base case, 0 = no 8s
        }

        int lastDigit = n % 10; //gets the last digit
        if (lastDigit == 8) {//checking if theres another 8
            if (n >= 88 && (n/10) % 10 == 8) {
                return 2+count8(n/10);//double if there is
            } else {
                return 1+count8(n/10);//single otherwise
            }
        }else {
            return count8(n/10);//onto the next digit
        }

    }

    public static int countHi(String str) {//counts the "hi"s in a string
        if (str.length() < 2) {
            return 0;//base case, hi is of length 2
        }

        if (str.startsWith("hi")) {
            return 1 + countHi(str.substring(2));//counts hi then skips 2 chars
        } else {
            return countHi(str.substring(1));  //moves up 1

        }
    }

    
    public static int countHi2(String str) {//counts "hi"s without 'x' before it
        if(str.length() < 2) {
            return 0;//base case, hi = 2 chars
        }
        if(str.startsWith("hi")) {
            return 1+countHi2(str.substring(2));//counts a "hi" and skips 2 chars for next
        }
        if(str.startsWith("xhi")) {
            return countHi2(str.substring(3));//skips if its "xhi" instead of hi, +3 chars up
        }
        return countHi2(str.substring(1));//index 1 if no matches
    }


    public static int strCount(String str, String sub) {//counts substring occcurances
        if (str.length() < sub.length()) {
            return 0;//base case, sub must be shorter than the string
        }
    
        if (str.startsWith(sub)) {
            return 1 + strCount(str.substring(sub.length()), sub);//counts the sub and moves its length forward
        } else {
            return strCount(str.substring(1), sub);//if not found, moves up 1
        }
    }

    public static String stringClean(String str) {//removes consecutive duplicate chars from a string
        if (str.length() <= 1) {
            return str;//base case, string must have a length over 1
        }
    
        if (str.charAt(0) == str.charAt(1)) {
            return stringClean(str.substring(1));//skips dupe chars
        } else {
            return str.charAt(0) + stringClean(str.substring(1));//keeps first char
        }
    }
//commit 2x
}

