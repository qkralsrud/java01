import java.util.LinkedList;
import java.util.Scanner;

public class Ex01_04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();

        for (int i = 0; i < 5; i++) {
            list.add(s.nextInt()); //add 링크드리스트에 값을 추가하기
        }
        for (int i = 0; i < 5; i++) {
            for (int k = i; k < 5; k++) {
                if (list.get(i) < list.get(k)) {
                    int temp = list.get(i); //get 은 i 번째에 있는걸 가져오는거
                    list.set(i, list.get(k)); //set 은 값을 변경하는것
                    list.set(k, temp);
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int k= i+1; k< list.size();k++){
                if (list.get(i)==list.get(k)){ //만약 중복이 됬다면
                    list.remove(k); //제거
                }
            }
        }
        list.forEach(sort -> System.out.print(sort + " ")); //출력하기
    }
}
