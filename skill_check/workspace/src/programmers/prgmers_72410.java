package programmers;

public class prgmers_72410 {
	public String solution(String new_id) {
        String rst = new_id.toLowerCase()
            .replaceAll("[^a-z0-9-_.]", "")
            .replaceAll("[.]+", ".")
            .replaceAll("^[.]|[.]$", "");
        
		if(rst.isEmpty()) rst = "a";
		if(rst.length() > 15) rst = rst.substring(0, 15).replaceAll("[.]$", "");
		while(rst.length() <= 2) rst += rst.charAt(rst.length() - 1);
        return rst;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
