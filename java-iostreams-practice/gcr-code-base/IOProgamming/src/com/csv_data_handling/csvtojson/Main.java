package com.csv_data_handling.csvtojson;


import java.io.*;
//import org.json.JSONArray;
//import org.json.JSONObject;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new FileReader("DataFiles/students.csv"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("DataFiles/students_new.json"));

        //JSONArray array = new JSONArray();

        reader.readLine(); // skip header

        String line;
       /* while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");

            JSONObject obj = new JSONObject();
            obj.put("id", Integer.parseInt(data[0].trim()));
            obj.put("name", data[1].trim());
            obj.put("email", data[2].trim());
            obj.put("salary", Integer.parseInt(data[3].trim()));

            array.put(obj);
        }

        writer.write(array.toString(4)); // pretty print
		*/
        reader.close();
        writer.close();

        System.out.println("CSV → JSON Done");
    }
}
