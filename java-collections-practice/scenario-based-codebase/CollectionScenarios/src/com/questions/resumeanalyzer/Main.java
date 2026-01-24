package com.questions.resumeanalyzer;
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	private static final Pattern emailRegex = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}", Pattern.CASE_INSENSITIVE);
	private static final Pattern phoneRegex = Pattern.compile("/(\\+\\d{1,3}[- ]?)?\\(?\\d{3}\\)?[- ]?\\d{3}[- ]?\\d{4}/g", Pattern.CASE_INSENSITIVE);
	static Map<String,ResumeData> candidateData = new HashMap<>();
	
	private static String emails;
	private static String phones;
	private static final String keywords[] = {"Java","Python","Spring"};
	private static List<String> keywordsFind = new ArrayList<>();
	
	public static void main(String[] args) {
		emails = null;
		phones = null;
		try {
			
			BufferedReader reader1 = new BufferedReader(new InputStreamReader(new FileInputStream("FilesData/rahulresume.txt")));
			BufferedReader reader2 = new BufferedReader(new InputStreamReader(new FileInputStream("FilesData/kaliresume.txt")));
			
			extractResume(reader1);
			extractResume(reader2);
			
			view();
		}
		catch (IOException e1) {
			System.out.println("File Not found!");
		}
	}
	public static void extractResume(BufferedReader reader) throws IOException{
		String line;
		while((line=reader.readLine())!=null) {
			matchEmail(line);
			matchPhone(line);
			findKeywords(line);
		}
		
		candidateData.put(emails,new ResumeData(emails, phones, keywordsFind));
	}
	
	public static void matchEmail(String line) {
		Matcher m = emailRegex.matcher(line);
		if(m.find()) {
			emails = m.group();
		}
	}
	public static void matchPhone(String line) {
		Matcher m = phoneRegex.matcher(line);
		if(m.find()) {
			phones = m.group();
		}
	}
	
	public static void findKeywords(String line) {
		String temp[] = line.split("\\s+");
		for(String t : keywords) {
			for(String key : temp) {
				if(t.equalsIgnoreCase(key)) {
					if(!keywordsFind.contains(key)) {
						keywordsFind.add(key);
					}
				}
			}
		}
	}
	
	public static void view() {
		candidateData.values().stream().sorted((a,b)-> Integer.compare(a.getKeywords().size(), b.getKeywords().size())).forEach(System.out::println);
	}
}
