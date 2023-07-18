package org.example;

public class Main {
    public static void main(String[]args){
        int value1=5;
        int value2=8;
        int value3=2;
        int value4=7;

        int sum1=value1+value2;
        int sum2=value3+value4;

        boolean equalSums=sum1==sum2;
        System.out.println("порівняннясум:"+equalSums);

        sum1+=1;
        sum2-=2;

        boolean firstSumIsGreater=sum1>sum2;
        System.out.println("якщопершасумабільша:"+firstSumIsGreater);

        boolean isMultipleOfTwo;

        if(sum1%2==0||sum2%2==0){
            isMultipleOfTwo=true;
        }else{
            isMultipleOfTwo=false;
        }

        System.out.println("якщохочабоднасумакратна2:"+isMultipleOfTwo);

        boolean result=firstSumIsGreater&&isMultipleOfTwo&&equalSums;
        System.out.println("Результат:"+result);
    }
}
