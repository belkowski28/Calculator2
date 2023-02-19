package com.example.calculator.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CsvReader {

    BufferedReader reader = null;
    String line ="";
    private ArrayList <Stamp> stamp = new ArrayList<>();

    String file = "src/main/resources/CSV/płyta.csv";

    public CsvReader(){

        try {
            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine())!=null){
                String [] row = line.split(",");
                stamp.add(new Stamp(Double.parseDouble(row[0]), Double.parseDouble(row[1]),
                        Double.parseDouble(row[2]), Double.parseDouble(row[3]), Double.parseDouble(row[4])));
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }

    public ArrayList<Stamp> getStamp() {
        return stamp;
    }
}
