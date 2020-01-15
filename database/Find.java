package phonebook.database;

import phonebook.gui.MiniCSS;
import phonebook.model.Company;
import phonebook.model.Person;
import phonebook.model.Record;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Find {

    public static List<Record> find(String typeRecord) {
        System.out.println(typeRecord.equals("Company") ? "Podaj NIP lub nazwę firmy" : "Podaj imie lub nazwisko");

        Scanner sc = new Scanner(System.in);
        String klucz = sc.nextLine();
        List<Record> temp = new ArrayList<>();

        for (Record record : PhoneBookDataBase.getPhoneBookDataBase().getRecordsArray()) {

            if (typeRecord.equals("Company") && record != null && record instanceof Company &&
                    (((Company) record).getCompanyName().equals(klucz)
                            || ((Company) record).getNip().equals(klucz))) {
                temp.add(record);
            }

            if (typeRecord.equals("Person") && record != null && record instanceof Person &&
                    (((Person) record).getName().equals(klucz)
                            || ((Person) record).getSurname().equals(klucz))) {
                temp.add(record);
            }
        }


        if (temp.size() == 0) {
            System.out.println(MiniCSS.printERROR("Brak rekordów"));
            return null;
        } else {
            return temp;
        }
    }
}

