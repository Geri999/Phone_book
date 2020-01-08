package pl.bci.g73.itcamp.phonebook;

import pl.bci.g73.itcamp.phonebook.gui.Menu;
import pl.bci.g73.itcamp.phonebook.gui.Title;

/**
 * @description:
 * @author: Gerard
 * @date: 02-01-2020:13
 * @version: 1.00
 */
public class AppPhoneBook {
    public static void main(String[] args) throws InterruptedException {

        //Title.castBajer();  //pamiętaj by zaremować(zakomentować), bo potem może wkurzać :-)
        Title.castTitle();
        Menu.petla();

    }
}
