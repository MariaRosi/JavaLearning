package codingpractice.readfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ReadFileAndCreateReport {

	static List<File> listFile = new ArrayList<>();
	static Map<String, String> mTemp = new HashMap<>();

	public static void main(String[] args) {

		Map<String, String> mFileContent = new HashMap<>();

		System.out.println("Enter the directory");
		Scanner sc = new Scanner(System.in);

		String sDir = sc.nextLine();

		List<File> listFiles = getFilenameList(sDir);

		System.out.println(listFiles);

		for (File eachFile : listFiles) {

			mFileContent = readFileAndCreateMap(eachFile);

		}

		System.out.println(mFileContent);
		
		Set<Map.Entry<String,String>> entries = mFileContent.entrySet();
		
		for(Map.Entry<String,String> entry : entries) {
			
			System.out.println(entry.getKey()+entry.getValue());
		}
		sc.close();
	}

	private static Map<String, String> readFileAndCreateMap(File eachFile) {

		String sLine = null;
		String[] arryLine;
		String sPersonName = null;
		String sSkill = null;
		String sKey = null;
		String sValue = null;
		FileInputStream fis = null;
		BufferedReader br = null;

		try {
			fis = new FileInputStream(eachFile);
			br = new BufferedReader(new InputStreamReader(fis));

			while ((sLine = br.readLine()) != null) {

				arryLine = sLine.split(",");
				sPersonName = arryLine[0];
				sSkill = arryLine[1];

				sKey = sPersonName + ":";

				if (mTemp.containsKey(sKey)) {
					sValue = mTemp.get(sKey);

					if (!(sValue.equals(sSkill))) {
						sValue = sValue + "," + sSkill;
						mTemp.put(sKey, sValue);
					}
				} else {
					mTemp.put(sKey, sSkill);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return mTemp;
	}

	private static List<File> getFilenameList(String sDir) {

		File folder = new File(sDir);

		File list[] = folder.listFiles();

		if (list == null) {
			return null;
		}

		for (File each : list) {

			if (each.isFile()) {
				listFile.add(each);
			} else if (each.isDirectory()) {
				getFilenameList(each.getAbsolutePath());
			}

		}

		return listFile;
	}

}
