import java.util.*;

public class Main {
	public static final Scanner scanner = new Scanner(System.in);

	/**
	* ������ ��Ģ�� ���� ������ �¸��� �� �ִ� ����� ���� �����ϴ��� �˻��ϴ� �Լ�  
	*
	* @param data 
	* @param n 
	* @param k 
	* @return true   ������ �¸��� �� �ִ� ����� ���� �ϳ� �̻� �����Ѵٸ�
	* @return false  else
	*/
	public static boolean isWinnable(int[] data, int n, int k) {

		int winCount = 0;
		long sum = 0;
		for(int i=0; i<k; i++){
				if(i<n-1 && (data[i]+data[i+1]) % 2 == 0)
						winCount++;
				k++;
		}
//		System.out.println("k=" + k);
		if(winCount > 0)
		{
				return true;
		}else{
				return false;
		}
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		int last = arr[0], cnt = 1;
		for(int i = 1; i < n; i++){
			if(last < 0 && arr[i] < 0) continue;
			if(last > 0 && arr[i] > 0) continue;
			cnt++;
			last = arr[i];
		}
		System.out.print(cnt);
	}

}