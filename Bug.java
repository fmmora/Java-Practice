package practice;

import java.util.stream.IntStream;

public class Bug {
    public static void main(String[] args) {
        int[] inputArray = {1000, 1, -2,-1000};
        System.out.println(smollestValue(inputArray));
    }

    private static int smollestValue(int[] inputArray) {
        return IntStream.range(0,inputArray.length).map(i-> inputArray[i]).min().getAsInt();

    }
}
