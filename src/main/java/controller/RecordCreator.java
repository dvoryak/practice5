package controller;

import model.Record;
import service.ResourceManager;
import view.ConsoleView;
import view.Constants;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

import static view.Constants.*;


public class RecordCreator {

    private ConsoleView view;
    private Scanner scanner;
    private ResourceManager manager;

    public RecordCreator(ConsoleView view, Scanner scanner) {
        this.view = view;
        this.manager = view.manager;
        this.scanner = scanner;
    }

    public Record createRecord() {
        Record record = new Record();
        String firstName = inputString(manager.getValue(INPUT_FIRST_NAME), manager.getValue(FIRST_NAME_REGEXP));
        String lastName = inputString(manager.getValue(INPUT_LAST_NAME), manager.getValue(LAST_NAME_REGEXP));
        String address = inputString(manager.getValue(INPUT_ADDRESS_NAME), manager.getValue(ADDRESS_REGEXP));
        String phone = inputString(manager.getValue(INPUT_PHONE), manager.getValue(PHONE_REGEXP));
        String data = inputString(manager.getValue(INPUT_BIRTH_DAY), manager.getValue(BIRTH_DAY_REGEXP));

        record.buildFirstName(firstName).buildLastName(lastName).buildAddress(address).
                buildPhoneNumber(phone).buildDateOfBirth(data);

        return record;
    }

    private String inputString(String field, String regex) {
        while (true) {
            view.printMessage(field + " [" + regex + "]");
            String string = scanner.nextLine();
            if (isRightInputString(string, regex)) {
                return string;
            }
            view.printMessage(view.manager.getValue(Constants.INPUT_WRONG) + " [" + regex + " ]");
        }
    }

    private boolean isRightInputString(String string, String regex) {
        return string.trim().matches(regex);
    }

}
