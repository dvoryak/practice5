package model;

import java.util.ArrayList;
import java.util.Collections;

public enum DataBase {
    INSTANCE;

    private static ArrayList<Record> data = new ArrayList<Record>();

    static {
        data.add(new Record().buildFirstName("John").buildLastName("Conor").buildDateOfBirth("1989-08-19").
                buildAddress("California").buildPhoneNumber("+459992229810"));
        data.add(new Record().buildFirstName("Lionel").buildLastName("Messi").buildDateOfBirth("1988-03-21").
                buildAddress("Barcelona").buildPhoneNumber("+409019233888"));
    }

    public ArrayList<Record> getAllRecords() {
        return data;
    }

    public void addRecord(Record record) {
        if(record != null) {
            data.add(record);
        }
    }

    DataBase() {
    }
}
