package pl.bci.g73.itcamp.phonebook;

import java.util.Scanner;

/**
 * @description:
 * @author: Gerard
 * @date: 03-01-2000:13
 * @version: 1.00
 */
public class Menu {
    static Scanner sc = new Scanner(System.in);

    public static void petla() {
        while (true) {
            showMenu();
            menuPositionAction();
        }
    }

    public static void showMenu() {
        System.out.println("\n***************** M E N U ****************");
        System.out.println(MiniCSS.kolor20+"WYSWIETLANIE"+MiniCSS.stop);
        System.out.println("\t1-Wyświetl całą książkę telefoniczną");
        System.out.println("\t2-Wyświetl firmy");
        System.out.println("\t3-Wyświetl osoby fizyczne");
        System.out.println(MiniCSS.kolor20+"WYSZUKIWANIE"+MiniCSS.stop);
        System.out.println("\t4-Wyszukaj firmę");
        System.out.println("\t5-Wyszukaj osobę fizyczną");
        System.out.println(MiniCSS.kolor20+"DODAWANIE NOWYCH REKORDÓW"+MiniCSS.stop);
        System.out.println("\t6-Dodaj firmę");
        System.out.println("\t7-Dodaj osobę fizyczną");
        System.out.println(MiniCSS.kolor20+"OPERACJE SYSTEMOWE"+MiniCSS.stop);
        System.out.println("\t8-(SAVE) Zapisz bazę do pliku (Baza.txt)");
        System.out.println("\t9-(OPEN) Wczytaj bazę z pliku (Baza.txt)");
        System.out.println("\t0-Exit");
        System.out.println("******************************************");
        System.out.println("Wybierz pozycję i naciśnij [ENTER]");
    }

    public static void menuPositionAction() {
        switch (sc.nextInt()) {
            case 0:
                System.exit(0);
                break;// nie trzeba

            case 1://Wyświetl całą książkę telefoniczną
                for (DBRecord dbRecord : PhoneBookDataBase.getPhoneBookDataBase().getPhoneBookArray()) {
                    if (dbRecord != null) {
                        System.out.println(dbRecord);
                    }
                }
                break;

            case 2:
                for (DBRecord dbRecord : PhoneBookDataBase.getPhoneBookDataBase().getPhoneBookArray()) {
                    if (dbRecord != null && dbRecord.getType().equals("Company")) {
                        System.out.println(dbRecord);
                    }
                }
                break;

            case 3:
                for (DBRecord dbRecord : PhoneBookDataBase.getPhoneBookDataBase().getPhoneBookArray()) {
                    if (dbRecord != null && dbRecord.getType().equals("Person")) {
                        System.out.println(dbRecord);
                    }
                }
                break;

            case 4:
                FindAndShow.findAndShow("Company");
                break;

            case 5:
                FindAndShow.findAndShow("Personal");
                break;

            case 6:
                AddRecord.addRecord("Company");
                break;

            case 7:
                AddRecord.addRecord("Person");
                break;

            case 8: //zapis
                IO.saveFile(PhoneBookDataBase.getPhoneBookDataBase().getPhoneBookArray(), "Baza.txt");
                break;

            case 9: //odczyt
                PhoneBookDataBase.getPhoneBookDataBase().setPhoneBookArray(IO.openFile("Baza.txt"));
                break;

            default:
                break;
        }
    }


}
