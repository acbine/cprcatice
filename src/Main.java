import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static void NO1(String[] args){
        //정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
        int[] arr = {1,2,3,4};
        IntStream intStream = Arrays.stream(arr);
        OptionalDouble OD = intStream.average();
        Double aa =OD.getAsDouble();
    }
}