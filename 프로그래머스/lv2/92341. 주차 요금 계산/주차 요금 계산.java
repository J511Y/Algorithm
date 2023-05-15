import java.util.*;
class Solution {
    public String[][] carRecords;

    public int calcTime(String t1, String t2) {
        int startH = Integer.parseInt(t1.substring(0, 2));
        int startM = Integer.parseInt(t1.substring(3, 5));
        int endH = Integer.parseInt(t2.substring(0, 2));
        int endM = Integer.parseInt(t2.substring(3, 5));

        return 60 * (endH - startH) + (endM - startM);
    }

    public int calcPark(int time, int[] fees) { // 기본시간, 기본요금, 단위시간, 단위요금
        if(time <= fees[0]) return fees[1];

        time -= fees[0];
        int t = time / fees[2] + (time % fees[2] == 0 ? 0 : 1);

        return fees[1] + t * fees[3];
    }

    public int[] solve(int[] fees) {
        List<Integer> parkTime = new ArrayList<>();

        String carNum = carRecords[0][1];
        int time = 0;
        for(int i = 0; i < carRecords.length; i++) {
            if(!carNum.equals(carRecords[i][1])) {
                parkTime.add(time);
                carNum = carRecords[i][1];
                time = 0;
            }

            if(i < carRecords.length - 1 && carNum.equals(carRecords[i + 1][1])) {
                time += calcTime(carRecords[i][0], carRecords[i + 1][0]);
                i += 1;
            }
            else time += calcTime(carRecords[i][0], "23:59");
        }

        parkTime.add(time);

        int[] res = new int[parkTime.size()];
        for(int i = 0; i < res.length; i++) {
            res[i] = calcPark(parkTime.get(i), fees);
        }

        return res;
    }

    public int[] solution(int[] fees, String[] records) {
        carRecords = new String[records.length][3];
        for(int i = 0; i < records.length; i++) {
            carRecords[i] = records[i].split(" ");
        }

        Arrays.sort(carRecords, new Comparator<String[]>() {
            @Override
            public int compare(String[] c1, String[] c2) {
                return c1[1].compareTo(c2[1]);
            }
        });

        return solve(fees);
    }
}