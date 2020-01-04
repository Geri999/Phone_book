package pl.bci.g73.itcamp.phonebook;

import java.util.Scanner;

/**
 * @description:
 * @author: Gerard
 * @date: 03-01-2018:22
 * @version: 1.00
 */
public class FindAndShow {

    public static void findAndShow(String type) {
        System.out.println(type.equals("Company") ? "Podaj NIP lub nazwę firmy" : "Podaj imie lub nazwisko");

        Scanner sc = new Scanner(System.in);
        String klucz = sc.nextLine();

        DBRecord[] temp = new DBRecord[15];
        int i = 0;

        for (DBRecord dbRecord : PhoneBookDataBase.getPhoneBookDataBase().getPhoneBookArray()) {

            if (type.equals("Company")) {
                if (dbRecord != null && dbRecord.getType().equals("Company") &&
                        (dbRecord.getCompanyName().equals(klucz) || dbRecord.getNip().equals(klucz)))
                    temp[i++] = dbRecord;
            } else {
                if (dbRecord != null && dbRecord.getType().equals("Person") &&
                        (dbRecord.getName().equals(klucz) || dbRecord.getSurname().equals(klucz)))
                    temp[i++] = dbRecord;
            }
        }

        if (i == 0) {
            System.out.println(MiniCSS.kolor1+"brak rekordów"+MiniCSS.stop);
        } else {
            for (DBRecord dbRecord : temp) {
                if (dbRecord != null) {
                    System.out.println(dbRecord);
                }
            }
        }
    }
}

