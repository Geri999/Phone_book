package phonebook.database;

import phonebook.gui.MiniCSS;
import phonebook.model.Company;
import phonebook.model.Person;

import java.util.Scanner;

/**
 * @description:
 * @author: Gerard
 * @date: 03-01-2018:49
 * @version: 1.00
 */
public class AddRecord {

    public static void addRecord(String type) {
        Scanner sc = new Scanner(System.in);

        //String type, String address, String landlinePhone, String companyName, String nip
        if (type.equals("Company")) {
            System.out.println("Address:");
            String address = sc.nextLine();
            System.out.println("Landline phone:");
            String landlinePhone = sc.nextLine();
            System.out.println("Company name:");
            String companyName = sc.nextLine();
            System.out.println("Nip");
            String nip = sc.nextLine();

            //IdMax jest zwiększony wcześnie o +1, a gdy baza pusta to ma wartość domyślną "0"
            PhoneBookDataBase.getPhoneBookDataBase().getRecordsArray()
                    .add(new Company(type, address, landlinePhone, companyName, nip));
            System.out.println(MiniCSS.printOK("Rekord dodany "));

        }
        //String type, String address, String landlinePhone, String name, String surname, int mobile
        if (type.equals("Person")) {
            System.out.println("Address:");
            String address = sc.nextLine();
            System.out.println("Landline phone:");
            String landlinePhone = sc.nextLine();
            System.out.println("Name:");
            String name = sc.nextLine();
            System.out.println("Surname:");
            String surname = sc.nextLine();
            System.out.println("Mobile (int!!):");
            int mobile = sc.nextInt();

            PhoneBookDataBase.getPhoneBookDataBase().getRecordsArray()
                    .add(new Person(type, address,landlinePhone, name, surname, mobile));
            System.out.println(MiniCSS.printOK("Rekord dodany "));
        }
    }
}
