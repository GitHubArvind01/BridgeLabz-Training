package com.questions.travellog;
import java.util.*;
import java.io.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static Set<String> country = new HashSet<>();
	static Map<String,Integer> cityFreq = new HashMap<>();
	static List<Travel> list = new ArrayList<>();
	
	public static void main(String[] args) {

		Travel day1 = new Travel("India","Bhopal",20);
		Travel day2 = new Travel("USA","New York",5);
		Travel day3 = new Travel("USA","California",12);
		Travel day4 = new Travel("India","Patna",32);
		Travel day5 = new Travel("India","Bhoapl",44);
		list.add(day1);
		list.add(day2);
		list.add(day3);
		list.add(day4);
		list.add(day5);
		insertData(list);
		
		extractdata();
		
		countryVisited();
	}
	
	//insert travel data
	public static void insertData(List<Travel> t) {
		try {
			
			
			FileOutputStream file = new FileOutputStream("FilesData/trave.txt");
			ObjectOutputStream obj = new ObjectOutputStream(file);
			
			obj.writeObject(t);
			System.out.println("Travel data added");
			
			obj.close();
		}
		catch(IOException e) {
			System.out.println("File not found");
		}
	}
	
	//extract travel data
	@SuppressWarnings("unchecked")
	public static void extractdata() {
		try (ObjectInputStream obj = new ObjectInputStream(new FileInputStream("FilesData/trave.txt"))){
			
			List<Travel> readList;
			try {
				readList = (List<Travel>) obj.readObject();

				for(Travel t : readList) {
					cityFreq.put(t.getCityName(), cityFreq.getOrDefault(t.getCityName(), 0)+1);
					country.add(t.getCountry());
				}
			} catch (ClassNotFoundException e) {
				System.out.println("Class Not found!");
			}
		}
		catch(IOException e) {
			System.out.println("File not found");
		}
	}
	
	
	//top three visited city
	public static void topThreeCity() {
		
	}
	
	//country visited
	public static void countryVisited() {
		System.out.println("---------Top Country Visited---------");
		for(String s : country) {
			System.out.println(s);
		}
		System.out.println("-------------------------------------");
	}
}
