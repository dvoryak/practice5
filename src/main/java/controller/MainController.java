package controller;

import model.DataBase;
import model.Record;
import view.ConsoleView;
import view.Constants;

import java.util.Scanner;

public class MainController {

    private ConsoleView view;
    private DataBase dataBase = DataBase.INSTANCE;
    private Scanner scanner = new Scanner(System.in);

    public MainController(ConsoleView view) {
        this.view = view;
    }

    public void run() {
        view.askAndChangeLocale();
        while (true) {
            switch (view.showMenuAndGetChoice()) {
                case 1:
                    RecordCreator recordCreator = new RecordCreator(view, scanner);
                    dataBase.addRecord(recordCreator.createRecord());
                    view.printMessage(view.manager.getValue(Constants.RECORD_ADDED));
                    break;
                case 2:
                    for (Record record : dataBase.getAllRecords()) {
                        view.printMessage(record.toString());
                    }
                    view.printMessage("\n");
                    break;
                case 3:
                    view.askAndChangeLocale();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}