import java.io.*;
class Solution{
    static int gcd(int a, int b){
        if (a==0)
            return b;
        return gcd(b%a,a);
    }
    static void lowerFraction(int denomintaor3,int numerator3){
        int commondivisor=gcd(denomintaor3,numerator3);
        int simplifiedDenominator3=denomintaor3/commondivisor;
        int simplifiedNumerator3=numerator3/commondivisor;
        System.out.println(simplifiedNumerator3+"/"+simplifiedDenominator3);
    }
    static void addFractions(int numerator1,int denomintaor1, int numerator2,int denomintaor2){
        if (denomintaor1==0 || denomintaor2==0){
            throw new ArithmeticException("Denominator cannot be 0");
        }
        int gcdDenominatiors=gcd(denomintaor1,denomintaor2);
        // GCD*LCM=a*b
        int lcmDenominators=(denomintaor1*denomintaor2)/gcdDenominatiors;
        int numerator3=(numerator1)*(lcmDenominators/denomintaor1)+(numerator2)*(lcmDenominators/denomintaor2);
        lowerFraction(lcmDenominators, numerator3);
    }
    public static void main(String args[]){
        int num1=1, den1=0, num2=2, den2=1500;  
        addFractions(num1, den1, num2, den2); 
    }
}