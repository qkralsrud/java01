public class Ex01_03 { //구구단
    public static void main(String[] args){
        int i,k;

        for (i = 2,k=1; i<10 ; k++){
            System.out.printf("%d X %d =%d\n",i,k,i*k);
            if(k>8){
                k=0;
                i++;
            }
        }
    }
}
