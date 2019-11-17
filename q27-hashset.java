import java.util.*;
class Solution{
    public static char getFirstRepeatingCharater(String inputString, int iterator){
        char firstRepeating;
        char[] storeCharacters=new char[inputString.length()];
        HashSet<Character> charset=new HashSet<>();
        int j=0;
        for (int i=0;i<inputString.length();i++){
            char ch=inputString.charAt(i);
            if (charset.contains(ch)){
                storeCharacters[j]=ch;
                j++;
            }
            else{
                charset.add(ch);
            }
        }
        return storeCharacters[iterator];
        // return '\0';
    }
    public static void main(String args[]){
        String inputString="rahulgorai";
        int repeating=0;
        // repeating =0 this is first repeating
        // repeating =1 this is second repeating
        // repeating =2 this is third repeating and so on
        System.out.println(getFirstRepeatingCharater(inputString,repeating));
    }
}