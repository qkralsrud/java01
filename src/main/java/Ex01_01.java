import java.util.Scanner;

public class Ex01_01 { //배열의 최소 최대 평균 구하기
    public static void main(String[] args) {
        int arr[] = new int[5];
        int hap = 0;
        float average;


        Scanner s = new Scanner(System.in);
        System.out.printf("배열에 들어갈 수 입력: ");

        for (int i = 0; i < 5; i++) { //배열의 5칸을 입력 하는 반복
            arr[i] = s.nextInt();
        }

        int max = arr[0];   //비교하려고 초기값 설정
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) { //arr[i]번째가 max (arr[0]번째 )보다 커지면 if 실행 max = arr[i]
                max = arr[i];
            }
            if (arr[i] < min) { //arr[i]번째가 min (arr[0]번째 )보다 작으면 if 실행 min = arr[i]
                min = arr[i];
            }
        }
        System.out.printf("최대값: %d\n", max);
        System.out.printf("최소값: %d\n", min);
        for (int i = 0; i < arr.length; i++) { //배열의 합을 구하는 반복 for
            hap += arr[i];
        }
        average = hap / (float) 5;
        System.out.printf("평균값 : %f", average);
    }
}

