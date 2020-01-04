package pl.bci.g73.itcamp.phonebook;

import java.io.Serializable;

/**
 * @description:
 * @author: Gerard
 * @date: 02-01-2019:18
 * @version: 1.00
 */
public class ID implements Serializable {

    //pola
    static int idmax = 0;
    private int idDBPhoneBook;

    //konstruktor
    public ID() {
        this.idDBPhoneBook = ++idmax;  //dodaj +1 do poprzedniego i przypisz
    }

    //gettery i settery
    public int getIdDBPhoneBook() {
        return idDBPhoneBook;
    }

}
