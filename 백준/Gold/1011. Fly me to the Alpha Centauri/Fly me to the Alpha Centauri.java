import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int round = sc.nextInt();
        int arr[] = new int[round];
        for(int i = 0 ; i < round ; i ++) {
            arr[i] = (sc.nextInt()-sc.nextInt())*-1;
        }
        for(int i=0; i<arr.length; i++){
            int num = arr[i];
            if(num == 1){
                System.out.println(1);
                continue;
            }
            int cnt = 0;
            int n = 1;
            while(true) {
                cnt++;
                if(num - n <= 0)break;
                else num -= n;
                cnt++;
                if(num - n <= 0) break;
                else num -= n;
                n++;
            }
            System.out.println(cnt);
        }
    }
}