import java.util.*;
class Solution{
    public static String getSimplifiedString(String inputString){
        String simplifiedString="";
        HashMap<Character,Integer> characterCount=new HashMap<Character,Integer>();
        int count=1;
        for (int i=1;i<inputString.length();i++){
            if (inputString.charAt(i)!=inputString.charAt(i-1)){
                characterCount.put(inputString.charAt(i-1), count);
                count=1;
            }
            else{
                count++;
            }
        }
        characterCount.put(inputString.charAt(inputString.length()-1), count);
        for (char i:characterCount.keySet()){
            simplifiedString=simplifiedString+i+characterCount.get(i);
        }
        return simplifiedString;
    }
    public static void main(String args[]){
        String input="aaaabbbbbbcccddddd";
        System.out.println(getSimplifiedString(input));
    }
}