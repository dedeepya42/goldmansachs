class Soluton{
    public static boolean isEven(int length){
        if (length%2==0)
            return true;
        else
            return false;
    }
    public static String findFirstEvenString(String inputString){
        int maxEvenLength=0;
        int currentLength=0;
        int startingIndex=-1;
        int i=0;
        while(i<inputString.length()){
            if (inputString.charAt(i)==' '){
                if (currentLength>maxEvenLength && isEven(currentLength)){
                    maxEvenLength=currentLength;
                    startingIndex=i-currentLength;
                }
               currentLength=0;     
            }
            else{
                currentLength++;
            }
            i++;
        }
        if (isEven(currentLength)){
            if(maxEvenLength<currentLength){
                maxEvenLength=currentLength;
                startingIndex=i-currentLength;
            }
        }
        return inputString.substring(startingIndex, startingIndex+maxEvenLength);
    }
    public static void main(String args[]){
        String input="this is a test string";
        System.out.println(findFirstEvenString(input));
    }
}