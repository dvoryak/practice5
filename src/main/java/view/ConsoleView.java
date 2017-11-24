package view;

import view.exception.WrongInputException;
import service.ResourceManager;

import java.util.Locale;
import java.util.Scanner;

import static view.constants.InputConstants.*;
import static view.constants.MenuConstants.*;


public class ConsoleView {
    public ResourceManager manager = ResourceManager.INSTANCE;

    public void askAndChangeLocale() {
        System.out.println(manager.getValue(SET_LOCALE));
        manager.changeResources(new Locale(new Scanner(System.in).nextLine()));
    }

    public int showMenuAndGetChoice() throws WrongInputException {
        System.out.println(manager.getValue(SHOW_MENU_1));
        System.out.println(manager.getValue(SHOW_MENU_2));
        System.out.println(manager.getValue(SHOW_MENU_3));
        System.out.println(manager.getValue(SHOW_MENU_4));

        int i = new Scanner(System.in).nextInt();

        if(i > 4 || i < 1) {
            throw new WrongInputException();
        }
        return i;
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}
