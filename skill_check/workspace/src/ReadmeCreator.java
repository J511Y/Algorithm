import java.util.*;
import java.util.regex.Pattern;
import java.io.*;
import java.text.SimpleDateFormat;
class ReadmeCreator {
	enum Site{
		NONE, BAEKJOON, PROGRAMMERS
	}
	static private String dir = System.getProperty("user.dir");
	static StringBuilder console = new StringBuilder();
	static StringBuilder output = new StringBuilder();
	SortedMap<String, String> map = new TreeMap<String, String>((a, b) -> {
		String[] as = a.split(" ");
		String[] bs = b.split(" ");
		int siteName = as[0].compareTo(bs[0]);
		return siteName == 0 ? Integer.parseInt(as[1]) - Integer.parseInt(bs[1]) : siteName;
	});
	
	public static void main (String[] args) {
		ReadmeCreator creator = new ReadmeCreator();
		creator.CreateReadMe();
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
			Print("Readme.md ���� ���� ����");
			File[] dir = FileDir();
			FileSearch(dir, 0);
		    
			Print("Readme.md ���� ����...");
			WriteReadMe();
			Print("Readme.md ���� �����Ϸ�!");
		} catch (Exception e) {
			e.printStackTrace();
			Print("Readme.md ���� ���� �� ���� �߻�");
		} finally {
			// �ܼ� ���� ���
			System.out.print(console);
		}
	}
	
	void WriteReadMe() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		Output("# �˰��� ���� ��� (AC ���� ���� ����)");
		Output("\n\tREADME.md ������Ʈ : " + sdf.format(new Date()) + "   \n   ");
		String lastKey = "";
		for(String key : map.keySet()) {
			String[] keySplit = key.split(" ");
			String site = keySplit[0], code = keySplit[1];
			if(site.equals(lastKey) == false) {
				long count = map.keySet().stream().filter((str) -> str.startsWith(site)).count();
				Output("\n");
				Output("## " + site + " (�� " + count + "����)");
				lastKey = site;
			}
			Output("* [" + code + "��](" + map.get(key) + ")");
		}
		FileSave(output.toString());
	}
	
	void FileSearch(File[] dir, int depth) {
		// ��� ����
		String tab = "\t".repeat(depth);
		
		for(File folder : dir) {
			// ������ ���
			if (folder.isFile()) {
				try {
					// Ȯ���� ����
					String withOutExtension = folder.getName().split("[.]")[0];
					
					// ���� ���� ��ȣ
					String problemCode = withOutExtension.split("_")[1];
					
					// ȭ��Ʈ����Ʈ üũ
					Site site = WhiteList(withOutExtension);
					boolean pass = Site.NONE != site;
					
					Print(tab + "��" + folder.getName() + "\t(WhiteList Check Result = " + pass + ")");
					
					if (pass) {
						String key = SiteToString(site) + problemCode;
						if (map.containsKey(key)) continue;
						map.putIfAbsent(key, withOutExtension);
					}
				} catch(Exception e) {
					continue;
				}
			}
			// ���� ������ ������ ��� ���
			else {
				// ���� ������Ʈ ����
				//if(BlackList(folder.getName())) return;
				
				Print(tab + "��" + folder.getName());
				File[] child = FileDir(folder.getAbsolutePath());
				FileSearch(child, depth + 1);
			}
	    }
	}

	String SiteToString(Site site) {
		String rtn = "-";
		switch(site.ordinal()) {
			case 1 : rtn = "���� "; break;
			case 2 : rtn = "���α׷��ӽ� "; break;
		}
		return rtn;
	}
	
	// ȭ��Ʈ����Ʈ
	Site WhiteList(String name) {
		if (name.indexOf("_") == -1) return Site.NONE;
		String split_zero = name.split("_")[0];
		switch(split_zero) {
			case "baekjoon":
				return Site.BAEKJOON;
			case "prgmers":
				return Site.PROGRAMMERS;
			default:
				return Site.NONE;
		}
	}
	
	boolean BlackList(String name) {
		switch(name) {
			case "bin":
				return true;
			default :
				return false;
		}
	}

	// ���� ����
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
	
	// ���� ���
	File[] FileDir() {
		return FileDir(dir);
	}
	
	File[] FileDir(String path) {
		File folder = new File(path);
		File files[] = folder.listFiles();
		return files;
	}
}