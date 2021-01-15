import java.util.*;
import java.util.regex.Pattern;
import java.io.*;
import java.text.SimpleDateFormat;
enum Site{
	NONE, BAEKJOON, PROGRAMMERS
}
class Main {
	static private String dir = System.getProperty("user.dir");
	static StringBuilder console = new StringBuilder();
	static StringBuilder output = new StringBuilder();
	SortedMap<String, String> map = new TreeMap<String, String>();
	
	public static void main (String[] args) {
		Main main = new Main();
		main.CreateReadMe();
	}
	
	void Output(String str) {
		Print(str, output);
	}
	
	void Print(String str) {
		Print(str, console);
	}
	
	void Print(String str, StringBuilder builder) {
		builder.append(str).append("\n");
	}
	
	void CreateReadMe() {
		try {
			Print("Readme.md 파일 생성 시작");
			File[] dir = FileDir();
			FileSearch(dir, 0);
		    
		} catch (Exception e) {
			e.printStackTrace();
			Print("Readme.md 파일 생성 중 오류 발생");
		} finally {
			// 콘솔 내용 출력
			Print("Readme.md 파일 생성...");
			WriteReadMe();
			Print("Readme.md 파일 생성완료!");
			System.out.print(console);
		}
	}
	
	void WriteReadMe() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		Output("# 알고리즘 문제 목록 (AC 여부 추후 개발)");
		Output("## 업데이트 : " + sdf.format(new Date()));
		String lastKey = "";
		for(String key : map.keySet()) {
			if(key.startsWith(lastKey) == false) {
				Output("***");
			}
			Output("[" + key + "](" + map.get(key) + ")");
		}
		FileSave(output.toString());
	}
	
	void FileSearch(File[] dir, int depth) {
		// 출력 공백
		String tab = "\t".repeat(depth);
		
		for(File folder : dir) {
			// 파일일 경우
			if (folder.isFile()) {
				try {
					// 확장자 제거
					String withOutExtension = folder.getName().split("[.]")[0];
					
					// 문제 고유 번호
					String problemCode = withOutExtension.split("_")[1];
					
					// 화이트리스트 체크
					Site site = WhiteList(withOutExtension);
					boolean pass = Site.NONE != site;
					
					Print(tab + "ㄴ" + folder.getName() + "\t(WhiteList Check Result = " + pass + ")");
					
					if (pass) {
						map.put(site.name() + problemCode, withOutExtension);
					}
				} catch(Exception e) {
					continue;
				}
			}
			// 하위 폴더가 존재할 경우 재귀
			else {
				Print(tab + "ㄴ" + folder.getName());
				File[] child = FileDir(folder.getAbsolutePath());
				FileSearch(child, depth + 1);
			}
	    }
	}

	// 화이트리스트
	Site WhiteList(String name) {
		if (name.indexOf("_") == -1) return Site.NONE;
		String split_zero = name.split("_")[0];
		switch(split_zero) {
			case "baekjoon":
				return Site.BAEKJOON;
			case "programmers":
				return Site.PROGRAMMERS;
			default:
				return Site.NONE;
		}
	}

	// 파일 저장
	void FileSave(String file_content) {
		try {
			FileOutputStream output = new FileOutputStream(dir + "/Readme.md");
			BufferedOutputStream buffer = new BufferedOutputStream(output);
			buffer.write(file_content.getBytes());
			buffer.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// 파일 목록 출력
	File[] FileDir() {
		return FileDir(dir);
	}
	
	File[] FileDir(String path) {
		File folder = new File(path);
		File files[] = folder.listFiles();
		return files;
	}
}