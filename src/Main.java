import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void NO1(String[] args){
        //정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
        int[] arr = {1,2,3,4};
        IntStream intStream = Arrays.stream(arr);
        OptionalDouble OD = intStream.average();
        Double aa =OD.getAsDouble();
    }
    public static void NO2(String[] args){
        //str이 "1234"이면 1234를 반환하고, "-1234"이면 -1234를 반환하면
        String str1= "1234";
        String str2= "-1234";
        int aa = Integer.parseInt(str2);
        System.out.println(aa);
    }

    public static void NO3(String[] args){
        //num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수
        int a =3 ;
        int b =4 ;
        String bbb = (a%2 == 0) ? "Even" : "Odd";
        System.out.println(bbb);
    }

    public static void NO4(String[] args){
        // N = 123이면 1 + 2 + 3 = 6을
        int a =123 ;
        int b =4556 ;
        String stringb = String.valueOf(a); // 문자열 바꾸고
        String[] split=stringb.split(""); //문자열을 분리해서
        IntStream intStream = Arrays.stream(split).mapToInt(x -> Integer.parseInt(x));
        int result=intStream.sum();
        System.out.println(result);
//        System.out.println(split[3]);
    }

    public static void NO5(String[] args){
//        12의 약수는 1, 2, 3, 4, 6, 12입니다. 이를 모두 더하면 28
        int a =12;
        int b = 5;
        int result =0;
        for (int i=1; i<=b; i++ ){
            if(b%i == 0){
                System.out.println(i);
                result= result+i;
            }
        }
        System.out.println(result);
    }
    public static void NO6(String[] args){
//      정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트
        int x = -4;
        int n = 2;
        long[] array = new long[n];

        for(int i=0; i<n; i++) {
            array[i] = (long)x*(i+1);
        }
        System.out.println(array[0]);
    }




}