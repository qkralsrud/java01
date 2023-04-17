import java.util.Scanner;

public class Hw12_01 {
    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner s = new Scanner(System.in);

        System.out.printf("입력 값 : ");
        for ( int i=0; i<5;i++){
            arr[i]=s.nextInt();
        }

        for(int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i=0; i< 4; i++){
            if(arr[i] == arr[i+1]){ //배열의 중복 확인
                continue; //컨티뉴로 중복일때 건너뜀
            }
            System.out.printf(" %d ",arr[i]);
        }
        System.out.printf(" %d ",arr[4]); //중복 검사를 할 6번째 배열이 없기때문에 5번째만 따로 출력
    }
}
