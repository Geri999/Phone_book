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
    public static final String VERSION = "ver.1.04";

    public static void main(String[] args) throws InterruptedException {

       // Title.castBajer();  //pami�taj by zaremowa�(zakomentowa�), bo potem mo�e wkurza� :-)
        Title.castTitle();
        Menu.petla();

    }
}
