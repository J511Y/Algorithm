package baekjoon_�⺻;
// https://www.acmicpc.net/problem/10178
// �ҷ����� ����
import java.util.*;
class baekjoon_10178{
    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println("You get " + (a / b) + " piece(s) and your dad gets " + (a % b) + " piece(s).");
        }
    }
}