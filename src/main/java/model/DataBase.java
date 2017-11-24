package model;

import java.util.ArrayList;
import java.util.Collections;

public enum DataBase {
    INSTANCE;

    private ArrayList<Record> data = new ArrayList<Record>();

    {
        data.add(new Record().buildFirstName("John").buildLastName("Conor").buildDateOfBirth("1989-08-19").
                buildAddress("California,Street,25").buildPhoneNumber("+459992229810"));
        data.add(new Record().buildFirstName("Lionel").buildLastName("Messi").buildDateOfBirth("1988-03-21").
                buildAddress("Barcelona,Street,17").buildPhoneNumber("+409019233888"));
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
