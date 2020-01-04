package pl.bci.g73.itcamp.phonebook;

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

        if (type.equals("Company")) {
            System.out.println("Address:");
            String address = sc.nextLine();
            System.out.println("Landline phone:");
            String landlinePhone = sc.nextLine();
            System.out.println("Company name:");
            String companyName = sc.nextLine();
            System.out.println("Nip");
            String nip = sc.nextLine();

            PhoneBookDataBase.getPhoneBookDataBase().getPhoneBookArray()[ID.idmax] =
                    new DBRecord(address, landlinePhone, "", "",
                            0, companyName, nip, type);
        }

        if (type.equals("Person")) {
            System.out.println("Address:");
            String address= sc.nextLine();
            System.out.println("Name:");
            String name= sc.nextLine();
            System.out.println("Surname:");
            String surname= sc.nextLine();
            System.out.println("Mobile:");
            int mobile= sc.nextInt();

            PhoneBookDataBase.getPhoneBookDataBase().getPhoneBookArray()[ID.idmax] =
                    new DBRecord(address, "", name, surname,
                            mobile,"" ,"" , type);
        }
    }
}
