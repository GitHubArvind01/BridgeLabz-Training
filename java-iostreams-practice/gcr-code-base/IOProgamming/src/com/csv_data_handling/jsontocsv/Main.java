package com.csv_data_handling.jsontocsv;


import java.io.*;
//import org.json.JSONArray;
//import org.json.JSONObject;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new FileReader("DataFiles/students.json"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("DataFiles/students.csv"));

        StringBuilder jsonText = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            jsonText.append(line);
        }

        //JSONArray students = new JSONArray(jsonText.toString());

        // CSV header
        writer.write("ID,Name,Email,Salary");
        writer.newLine();
        /*
        for (int i = 0; i < students.length(); i++) {
           // JSONObject obj = students.getJSONObject(i);

            writer.write(
                    obj.getInt("id") + "," +
                    obj.getString("name") + "," +
                    obj.getString("email") + "," +
                    obj.getInt("salary")
            );
            writer.newLine();
        }
*/
        reader.close();
        writer.close();

        System.out.println("JSON → CSV Done");
    }
}
