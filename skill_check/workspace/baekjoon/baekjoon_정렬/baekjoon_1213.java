package baekjoon_Á¤·Ä;
class baekjoon_1213{
	public static void main(String[] args){
		String s = new java.util.Scanner(System.in).next();
		int[] chars = new int[26];
		for(int i = 0; i < s.length(); i++) chars[s.charAt(i) - 'A']++;
		int odd = s.length() % 2 == 0 ? 1 : 0;
		for(int i : chars) odd += i % 2 == 1 ? 1 : 0;
		if(odd > 1) System.out.print("I'm Sorry Hansoo");
		else{
			s = "";
			for(int i = 0; i < 26; i++){
				while(chars[i] > 1){
					s += (char)(i + 'A');
					chars[i] -= 2;
				}
			}
			String reverse = new StringBuffer(s).reverse().toString();
			for(int i = 0; i < 26; i++) s += chars[i] > 0 ? (char)(i + 'A') : "";
			s += reverse;
			System.out.print(s);
		}
	}
}
