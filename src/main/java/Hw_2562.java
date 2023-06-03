import java.util.Scanner;

public class Hw_2562 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = new int[9];
        int max = 0;
        int count= 0;

        for (int i = 1; i < arr.length; i++) {
            arr[i]=s.nextInt();
            if (arr[i] > max){
                max = arr[i];
                count = i;
            }
        }

        System.out.printf("%d\n%d",max,count);
    }
}
