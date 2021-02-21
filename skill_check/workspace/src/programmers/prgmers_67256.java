package programmers;

public class prgmers_67256 {
	StringBuffer sb = new StringBuffer();
    int[][] keypad = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {-1, 0, -2}};
    int[] left = new int[]{3, 0}, right = new int[] {3, 2};
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[] loc = new int[2];
        for(int num : numbers){
            for(int i = 0; i < 4; i++){
                for(int j = 0; j < 3; j++){
                    if(keypad[i][j] == num) loc = new int[] {i, j};
                }
            }
            if(num == 1 || num == 4 || num == 7){
                sb.append("L");
                left = new int[]{loc[0], loc[1]};
            } else if (num == 3 || num == 6 || num== 9){
                sb.append("R");
                right = new int[]{loc[0], loc[1]};
            } else {
                int leftDis = Math.abs(loc[0] - left[0]) + Math.abs(loc[1] - left[1]);
                int rightDis = Math.abs(loc[0] - right[0]) + Math.abs(loc[1] - right[1]);
                if(leftDis == rightDis){
                    if(hand.equals("right")){
                        right = new int[] {loc[0], loc[1]};
                        sb.append("R");
                    }else {
                        left = new int[] {loc[0], loc[1]};
                        sb.append("L");
                    }
                } else {
                    if(leftDis < rightDis){
                        left = new int[] {loc[0], loc[1]};
                        sb.append("L");
                    } else {
                        right = new int[] {loc[0], loc[1]};
                        sb.append("R");
                    }
                }
            }
        }
        return sb.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
