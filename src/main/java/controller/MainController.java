package controller;

import view.exception.WrongInputException;
import model.DataBase;
import model.Record;
import view.ConsoleView;

import java.util.Scanner;
import static view.constants.Constant.InputConstants.*;

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
            try {
                switch (view.showMenuAndGetChoice()) {
                    case 1:
                        RecordCreator recordCreator = new RecordCreator(view, scanner);
                        dataBase.addRecord(recordCreator.createRecord());
                        view.printMessage(view.manager.getValue(RECORD_ADDED));
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
            } catch (WrongInputException e) {
                e.printStackTrace();
            }
        }
    }
}
