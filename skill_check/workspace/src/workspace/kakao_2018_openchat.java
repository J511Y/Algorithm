package workspace;
import java.util.*;
/*
 * ���� ����
����ä�ù�
īī���� ����ä�ù濡���� ģ���� �ƴ� ������ ��ȭ�� �� �� �ִµ�, ���� �г����� �ƴ� ������ �г����� ����Ͽ� ä�ù濡 �� �� �ִ�.

���Ի���� ��ũ��� īī���� ���� ä�ù��� ������ ����� ����, �پ��� ������� ������, ������ ���� ���Ѻ� �� �ִ� ������â�� ������ �ߴ�. ä�ù濡 ������ ������ ���� �޽����� ��µȴ�.

[�г���]���� ���Խ��ϴ�.

ä�ù濡�� ������ ������ ���� �޽����� ��µȴ�.

[�г���]���� �������ϴ�.

ä�ù濡�� �г����� �����ϴ� ����� ������ ���� �� �����̴�.

ä�ù��� ���� ��, ���ο� �г������� �ٽ� ����.
ä�ù濡�� �г����� �����Ѵ�.
�г����� ������ ���� ������ ä�ù濡 ��µǾ� �ִ� �޽����� �г��ӵ� ���� ����ȴ�.

���� ���, ä�ù濡 Muzi�� Prodo��� �г����� ����ϴ� ����� ������� ������ ä�ù濡�� ������ ���� �޽����� ��µȴ�.

Muzi���� ���Խ��ϴ�.
Prodo���� ���Խ��ϴ�.

ä�ù濡 �ִ� ����� ������ ä�ù濡�� ������ ���� �޽����� ���´�.

Muzi���� ���Խ��ϴ�.
Prodo���� ���Խ��ϴ�.
Muzi���� �������ϴ�.

Muzi�� ������ �ٽ� ���� ��, Prodo ��� �г������� ���� ��� ������ ä�ù濡 �����ִ� Muzi�� Prodo�� ������ ���� ����ȴ�.

Prodo���� ���Խ��ϴ�.
Prodo���� ���Խ��ϴ�.
Prodo���� �������ϴ�.
Prodo���� ���Խ��ϴ�.

ä�ù��� �ߺ� �г����� ����ϱ� ������, ���� ä�ù濡�� Prodo��� �г����� ����ϴ� ����� �� ���� �ִ�. ����, ä�ù濡 �� ��°�� ���Դ� Prodo�� Ryan���� �г����� �����ϸ� ä�ù� �޽����� ������ ���� ����ȴ�.

Prodo���� ���Խ��ϴ�.
Ryan���� ���Խ��ϴ�.
Prodo���� �������ϴ�.
Prodo���� ���Խ��ϴ�.

ä�ù濡 ������ �����ų�, �г����� ������ ����� ��� ���ڿ� �迭 record�� �Ű������� �־��� ��, ��� ����� ó���� ��, ���������� ���� ������ ����� ���� �Ǵ� �޽����� ���ڿ� �迭 ���·� return �ϵ��� solution �Լ��� �ϼ��϶�.

���ѻ���
record�� ������ ���� ���ڿ��� ��� �迭�̸�, ���̴� 1 �̻� 100,000 �����̴�.
������ record�� ��� ���ڿ��� ���� �����̴�.
��� ������ [���� ���̵�]�� �����Ѵ�.
[���� ���̵�] ����ڰ� [�г���]���� ä�ù濡 ���� - Enter [���� ���̵�] [�г���] (ex. Enter uid1234 Muzi)
[���� ���̵�] ����ڰ� ä�ù濡�� ���� - Leave [���� ���̵�] (ex. Leave uid1234)
[���� ���̵�] ����ڰ� �г����� [�г���]���� ���� - Change [���� ���̵�] [�г���] (ex. Change uid1234 Muzi)
ù �ܾ�� Enter, Leave, Change �� �ϳ��̴�.
�� �ܾ�� �������� ���еǾ� ������, ���ĺ� �빮��, �ҹ���, ���ڷθ� �̷�����ִ�.
���� ���̵�� �г����� ���ĺ� �빮��, �ҹ��ڸ� �����Ѵ�.
���� ���̵�� �г����� ���̴� 1 �̻� 10 �����̴�.
ä�ù濡�� ���� ������ �г����� �����ϴ� �� �߸� �� �Է��� �־����� �ʴ´�.
����� ��
record	result
["Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"]	["Prodo���� ���Խ��ϴ�.", "Ryan���� ���Խ��ϴ�.", "Prodo���� �������ϴ�.", "Prodo���� ���Խ��ϴ�."]
����� �� ����
����� �� #1
������ ����� ����.
 */
public class kakao_2018_openchat {
	public static String[] solution(String[] record) {
        
        List<String> chatlist = new ArrayList<String>();
        Map<String,String> nickname = new HashMap<String,String>();
        for(String s : record) {
        	String [] arr = s.split(" ");
        	if(arr.length>2)nickname.put(arr[1], arr[2]);
        	if(s.startsWith("Enter"))chatlist.add(arr[1]+" ���� ���Խ��ϴ�.");
        	if(s.startsWith("Leave"))chatlist.add(arr[1]+" ���� �������ϴ�.");
        }
        List<String> result = new ArrayList<>();
        for(int i=0; i<chatlist.size();i++) {
        	String s = chatlist.get(i); 
        	result.add(s.replace(s.split(" ")[0]+" ",nickname.get(s.split(" ")[0])));
        }
        
        String[] answer = result.toArray(new String[result.size()]);
        
        return answer;
    }
	public static void main(String[] args) {
		for(String s : solution(new String [] {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"})) {
			System.out.println(s);
		}
	}

}
