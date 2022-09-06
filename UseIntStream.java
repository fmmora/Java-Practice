package practice;

import java.util.stream.IntStream;

public class UseIntStream {

    static int largestNumer(int[] inputArray){
        return IntStream.range(1,inputArray.length).map(i-> inputArray[i]*inputArray[i-1]).max().getAsInt();
        //return IntStream.range(0,inputArray.length).map(i ->inputArray[i]).min().getAsInt();

    }

    public static void main(String[] args) {
        int[] inputArray ={-1,-12,-6,5,-10};
        System.out.println(largestNumer(inputArray));
    }
}
