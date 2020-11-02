package kakao;

public class kakao_2020_1 {
	public String solution(String new_id) {
        new_id = new_id.toLowerCase();
		new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
		new_id = new_id.replaceAll("[..]{2,1000}", ".");
		new_id = new_id.replaceAll("^[.]", "");
		new_id = new_id.replaceAll("[.]$", "");
		if(new_id.equals("")) new_id = "a";
		if(new_id.length() > 15) new_id = new_id.substring(0, 15);
		new_id = new_id.replaceAll("[.]$", "");
		while(new_id.length() < 3) {
			new_id += new_id.charAt(new_id.length() - 1);
		}
		return new_id;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
