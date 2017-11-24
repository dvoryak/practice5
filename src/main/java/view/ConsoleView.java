package view;

import service.ResourceManager;

import java.util.Locale;
import java.util.Scanner;


public class ConsoleView {
    public ResourceManager manager = ResourceManager.INSTANCE;

    public void askAndChangeLocale() {
        System.out.println("Enter a locale {en,ua,ru}");
        manager.changeResources(new Locale(new Scanner(System.in).nextLine()));
    }

    public int showMenuAndGetChoice() {
        System.out.println(manager.getValue(Constants.SHOW_MENU_1));
        System.out.println(manager.getValue(Constants.SHOW_MENU_2));
        System.out.println(manager.getValue(Constants.SHOW_MENU_3));
        System.out.println(manager.getValue(Constants.SHOW_MENU_4));
        return new Scanner(System.in).nextInt();
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}
