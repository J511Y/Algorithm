package programmers;

import java.util.*;

class Match {
	String title;
	int time;
	int idx;

	public Match(String t, int time, int idx) {
		this.title = t;
		this.time = time;
		this.idx = idx;
	}
}

public class prgmers_17683 {
	public String solution(String m, String[] musicinfos) {
		List<Match> list = new ArrayList<>();
		for (int i = 0; i < musicinfos.length; i++) {
			String[] arr = musicinfos[i].split(",");
			String[] t1 = arr[0].split(":");
			String[] t2 = arr[1].split(":");
			int time1 = Integer.parseInt(t1[0]) * 60 + Integer.parseInt(t1[1]);
			int time2 = Integer.parseInt(t2[0]) * 60 + Integer.parseInt(t2[1]);
			int time = time2 - time1;
			StringBuffer sb = new StringBuffer();

			List<String> note = new ArrayList<>();
			int len = arr[3].length();
			for (int j = 0; j < len; j++) {
				if (j < len - 1 && arr[3].charAt(j + 1) == '#') {
					note.add(arr[3].charAt(j) + "#");
					j++;
				} else {
					note.add(arr[3].charAt(j) + "");
				}
			}
			int size = note.size();
			for (int j = 0; j < time; j++)
				sb.append(note.get(j % size));
			String play = sb.toString();
			play = play.replace(m + "#", "R".repeat(m.length() + 1));
			if (play.indexOf(m) != -1) {
				list.add(new Match(arr[2], time, i));
			}
		}

		if (list.size() == 0)
			return "(None)";

		list.sort((m1, m2) -> {
			int i1 = m2.time - m1.time;
			int i2 = m1.idx - m2.idx;
			if (i1 != 0)
				return i1;
			return i2;
		});

		return list.get(0).title;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
