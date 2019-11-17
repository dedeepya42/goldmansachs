//O(n) time and 0(n) space complexity
import java.util.*;
class Solution{
    public static int getMedian(int[] array1, int[] array2){
        int lenArray1=array1.length;
        int lenArray2=array2.length;
        int lenMergedArray=lenArray1+lenArray2;
        int[] mergedArray=new int[lenMergedArray];
        int i=0,j=0,k=0;
        for (int l=0;l<lenMergedArray-2;l++){
            if (array1[i]>array2[j]){
                mergedArray[k]=array2[j];
                j++;
                k++;
            }
            else if(array1[i]<array2[j]){
                mergedArray[k]=array1[i];
                i++;
                k++;
            }
            else{
                mergedArray[k]=array1[i];
                i++;
                j++;
                k++;
            }
        }
        //To compare last element of both the Arrays
        if (array1[i]>array2[j]){
            mergedArray[k]=array2[j];
            mergedArray[k+1]=array1[j];
        }    
        else{
            mergedArray[k]=array1[j];
            mergedArray[k+1]=array2[j];
        }
        if ((mergedArray.length%2)==0)
            return (mergedArray[(mergedArray.length)/2]+mergedArray[((mergedArray.length)/2)-1])/2;
        else
            return mergedArray[mergedArray.length/2];
    }
    public static void main(String args[]){
        int[] array1={1, 12, 15, 26, 38};
        int[] array2={2, 13, 17, 30, 45}; 
        System.out.println(getMedian(array1, array2));
    }
}