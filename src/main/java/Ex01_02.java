import java.util.Scanner;

public class Ex01_02 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int hap = 0;
        float average;

        Scanner s = new Scanner(System.in);
        System.out.printf("배열에 넣을 입력 값 : ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.printf("최대값 : %d\n", max);
        System.out.printf("최소값 : %d\n", min);

        for (int i = 0; i < arr.length; i++) {
            hap += arr[i];
        }
        average = hap / (float) 5;
        System.out.printf("평균값 : %f", average);


    }
}
