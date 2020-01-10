package phonebook;

import phonebook.gui.Menu;
import phonebook.gui.Title;

/**
 * @description:
 * @author: Gerard
 * @date: 02-01-2020:13
 * @version: 1.00
 */
public class AppPhoneBook {
    public static final String VERSION = "ver.1.05";

    public static void main(String[] args) throws InterruptedException {

        Title.castBajer();  //pamiętaj by zaremować(zakomentować), bo potem może wkurzać :-)
        Title.castTitle();
        Menu.petla();

    }
}
