package phonebook.methods;

import phonebook.classes.Company;
import phonebook.classes.Person;
import phonebook.classes.Record;
import phonebook.database.PhoneBookDataBase;
import phonebook.gui.MiniCSS;

import java.util.Scanner;

/**
 * @description:
 * @author: Gerard
 * @date: 03-01-2018:22
 * @version: 1.00
 */
public class Find {

    public static Record[] find(String typeRecord) {
        System.out.println(typeRecord.equals("Company") ? "Podaj NIP lub nazwę firmy" : "Podaj imie lub nazwisko");

        Scanner sc = new Scanner(System.in);
        String klucz = sc.nextLine();
        Record[] temp = new Record[15];
        int i = 0;

        for (Record record : PhoneBookDataBase.getPhoneBookDataBase().getRecordsArray()) {

            if (typeRecord.equals("Company") && record != null && record instanceof Company &&
                    (((Company) record).getCompanyName().equals(klucz)
                            || ((Company) record).getNip().equals(klucz))) {
                temp[i++] = record;
            }

            if (typeRecord.equals("Person") && record != null && record instanceof Person &&
                    (((Person) record).getName().equals(klucz)
                            || ((Person) record).getSurname().equals(klucz))) {
                temp[i++] = record;
            }
        }


        if (i == 0) {
            System.out.println(MiniCSS.kolor1 + "brak rekordów" + MiniCSS.stop);
            return null;
        } else {
            return temp;
        }
    }
}

