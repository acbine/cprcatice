import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
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

    public static void NO7(String[] args){
//      자연수 n이 매개변수로 주어집니다. n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x
        int n = 12;
        for(int i=1; i<=n; i++){
            if(n%i == 1){
                System.out.println(i);
                break;
            }
        }

    }

    public static void NO8(String[] args){
//      대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False
//        모두 하나도 없는 경우는 항상 True
        String s="pyY";
        int pcount = 0;
        int ycount = 0;
        boolean answer = true;
        String ls=s.toLowerCase();
        String[] split=ls.split(""); // 문자열을 각각의 배열러나누고
        for(int i=0; i<split.length; i++){
            if(split[i].equals("p")){
                pcount=pcount+1;
            }else if(split[i].equals("y")){
                ycount=ycount+1;
            }
        }
        answer=(pcount==ycount) ? true : false;
    }

    public static void NO9(String[] args){
//      자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열
        long n=12345;
        String sn = Long.toString(n);
        String[] array = sn.split(""); // 문자열 5개 존재{1,2,3,4,5}
////      문제발생 -> 문제 파악을 잘못 -> 역순정렬이 아님  -> 문제 해결
        int[] intarray = new int[array.length]; //int 배열 만들고
////        for(int i=0; i< array.length; i++){
//        Stream stream = Arrays.stream(array).sorted(Comparator.reverseOrder()); //스트림 형태로 변형해서 역순으로 정령
//        Object[] array1 = stream.toArray();
//        String[] stringArray = Arrays.stream(array1).map(x->x.toString()).toArray(String[]::new); // 각 객체를 문자열로 변환
//        System.out.println(stringArray[0]);
////        IntStream intStream= stream.mapToInt(x->Integer.parseInt(x.toString())); //정렬된 스트림을 long 타입으로 변경
////        int[] longarray2 = intStream.toArray();
////        }
        for(int i=0; i< array.length; i++){ //5-0
            intarray[i] =  Integer.parseInt(array[array.length-(i+1)]);
//            [0] = array[0]
        }
    }

    public static void NO10(String[] args){
//      n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1
        long n=3;
        int x = (int) Math.sqrt(n); //
        if(x * x == n){
            System.out.println((x + 1) * (x + 1));
        }else {
            System.out.println("-1");
        }
    }

    public static void main(String[] args){
//      양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
        int x=10; // x가 몇자리수인지 파악 ->10 100 1000 단위로 나누었을 떄
        int origin = x; // 원본값
        int sum=0;
//        System.out.println(123/10);
        while (x != 0) {
            sum =sum+ x % 10; // 일의 자리 숫자를 추출하여 합에 더함
            x=x/10; // 다음 자릿수로 이동
//            System.out.println(x);
//            System.out.println(sum);
        }
        boolean cc= (origin%sum==0) ? true : false ;

//        boolean a = (x%sum==0) ? true : false ;

    }




    }



