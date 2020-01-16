package programmers_stack_queue;
import java.util.*;
public class prgmers_42583 {
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<int[]> bridge = new LinkedList<>(); // �ٸ��� �ö��ִ� Ʈ������ ������ ť
        int idx = 0;
        int wSum = 0; // �ٸ��� �ö����ִ� Ʈ���� ���� ��
        while(idx < truck_weights.length) { // ������� Ʈ���� ��� �ٸ��� �ö� �� ����
        	if(wSum + truck_weights[idx] <= weight) { // �ٸ��� ���԰� ��ƿ �� �ִٸ�
        		wSum += truck_weights[idx]; // ���� ���� �տ� Ʈ���� ���Ը� �����ְ�
        		bridge.add(new int [] {truck_weights[idx++], 0}); // ť�� Ʈ���� �߰����ش�.
        	}
        	bridge.stream().forEach(arr -> arr[1]++); // �ö��ִ� Ʈ������ �ð��� 1�� ����
        	if(bridge.peek()[1] == bridge_length) { // �� ���� Ʈ���� �ٸ��� �� �ǳ��� ���
        		wSum -= bridge.poll()[0]; // ť���� �ش� Ʈ���� ���鼭, Ʈ���� ���� ���Ը�ŭ �ٸ� ���� �տ��� ���ش�.
        	}
        	answer++; // 1�� �����ߴٴ� �ǹ��� ++
        }
        while(bridge.size() != 1) bridge.poll(); // ������� Ʈ���� ��� �ö󰬴ٸ� ���� �������� ���� Ʈ���� �����ϰ� ��� ��������.
        return answer + bridge_length; // ������� �ҿ� �� �ð� + ���� ������ Ʈ���� ������ ���� �ݺ����� �������Ƿ� �ٸ� ���� ��ŭ�� �ð��� �� �ʿ���. ���� �ٸ� ���� ��ŭ �ð��� ������.
    }
	public static void main(String[] args) {
		System.out.println(solution(2, 10, new int [] {7, 4, 5, 6}));
		System.out.println(solution(100, 100, new int [] {10}));
		System.out.println(solution(100, 100, new int [] {10,10,10,10,10,10,10,10,10,10}));
		
	}
}
/*
�ٸ��� ������ Ʈ��
���� ����
Ʈ�� ���� �밡 ���� ���������� �� ���� �ٸ��� ������ ������ �ǳʷ� �մϴ�. ��� Ʈ���� �ٸ��� �ǳʷ��� �ּ� �� �ʰ� �ɸ����� �˾Ƴ��� �մϴ�. Ʈ���� 1�ʿ� 1��ŭ �����̸�, �ٸ� ���̴� bridge_length�̰� �ٸ��� ���� weight���� �ߵ��ϴ�.
�� Ʈ���� �ٸ��� ������ ������ ���� ���, �� Ʈ���� ���Դ� ������� �ʽ��ϴ�.

���� ���, ���̰� 2�̰� 10kg ���Ը� �ߵ�� �ٸ��� �ֽ��ϴ�. ���԰� [7, 4, 5, 6]kg�� Ʈ���� ������� �ִ� �ð� �ȿ� �ٸ��� �ǳʷ��� ������ ���� �ǳʾ� �մϴ�.

��� �ð�	�ٸ��� ���� Ʈ��	�ٸ��� �ǳʴ� Ʈ��	��� Ʈ��
0	[]	[]	[7,4,5,6]
1~2	[]	[7]	[4,5,6]
3	[7]	[4]	[5,6]
4	[7]	[4,5]	[6]
5	[7,4]	[5]	[6]
6~7	[7,4,5]	[6]	[]
8	[7,4,5,6]	[]	[]
����, ��� Ʈ���� �ٸ��� �������� �ּ� 8�ʰ� �ɸ��ϴ�.

solution �Լ��� �Ű������� �ٸ� ���� bridge_length, �ٸ��� �ߵ� �� �ִ� ���� weight, Ʈ���� ���� truck_weights�� �־����ϴ�. �̶� ��� Ʈ���� �ٸ��� �ǳʷ��� �ּ� �� �ʰ� �ɸ����� return �ϵ��� solution �Լ��� �ϼ��ϼ���.

���� ����
bridge_length�� 1 �̻� 10,000 �����Դϴ�.
weight�� 1 �̻� 10,000 �����Դϴ�.
truck_weights�� ���̴� 1 �̻� 10,000 �����Դϴ�.
��� Ʈ���� ���Դ� 1 �̻� weight �����Դϴ�.
����� ��
bridge_length	weight	truck_weights	return
2	10	[7,4,5,6]	8
100	100	[10]	101
100	100	[10,10,10,10,10,10,10,10,10,10]	110
*/