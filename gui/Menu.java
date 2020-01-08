package pl.bci.g73.itcamp.phonebook.gui;

import pl.bci.g73.itcamp.phonebook.classes.Company;
import pl.bci.g73.itcamp.phonebook.classes.Person;
import pl.bci.g73.itcamp.phonebook.classes.Record;
import pl.bci.g73.itcamp.phonebook.database.AddRecord;
import pl.bci.g73.itcamp.phonebook.database.DeleteRecord;
import pl.bci.g73.itcamp.phonebook.database.PhoneBookDataBase;
import pl.bci.g73.itcamp.phonebook.errors.BadMenuPositionException;
import pl.bci.g73.itcamp.phonebook.methods.Find;
import pl.bci.g73.itcamp.phonebook.methods.IO;
import pl.bci.g73.itcamp.phonebook.methods.ShowData;

import java.util.InputMismatchException;
import java.util.Scanner;

import static pl.bci.g73.itcamp.phonebook.gui.ShowMenuAutomat.MenuPozShowMenu;

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
            MenuPozShowMenu();
            menuPositionAction();
        }
    }

    public static void menuPositionAction() {

        MenuPoz menuPoz = null;
        boolean error = true;
        while (error) {
            try {
                menuPoz = MenuPoz.searchByKey(sc.nextInt());
                if (menuPoz == null) throw new BadMenuPositionException("Nie ma takiej pozycji.\nWybierz jeszcze raz.");
                error = false;
            } catch (BadMenuPositionException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Tylko cyfry!!\nWybierz jeszcze raz.");
                sc.nextLine();//czyszczenie bufora z [entera]
            }
        }
        switch (menuPoz) {
            case EXIT:
                System.exit(0);
                break;// nie trzeba

            case SHOW_ALL://Wyświetl całą książkę telefoniczną
            {
                int counter = 0;
                for (Record record : PhoneBookDataBase.getPhoneBookDataBase().getRecordsArray()) {
                    if (record != null) {
                        System.out.println(record);
                        counter++;
                    }
                }
                if (counter == 0) System.out.println("Brak pozycji");
            }
            break;

            case SHOW_COMP: {
                int counter = 0;
                for (Record record : PhoneBookDataBase.getPhoneBookDataBase().getRecordsArray()) {
                    if (record != null && record instanceof Company) {
                        System.out.println(record);
                        counter++;
                    }
                }
                if (counter == 0) System.out.println("Brak pozycji");
            }
            break;

            case SHOW_PERSON: {
                int counter = 0;
                for (Record record : PhoneBookDataBase.getPhoneBookDataBase().getRecordsArray()) {
                    if (record != null && record instanceof Person) {
                        System.out.println(record);
                        counter++;
                    }
                }
                if (counter == 0) System.out.println("Brak pozycji");
            }
            break;

            case SEARCH_COMP:
                ShowData.showData(Find.find("Company"));
                break;

            case SEARCH_PERS:
                ShowData.showData(Find.find("Person"));
                break;

            case ADD_COMP:
                AddRecord.addRecord("Company");
                break;

            case ADD_PERS:
                AddRecord.addRecord("Person");
                break;

            case DEL: //kasowanie rekordu
                DeleteRecord.deleteRecord();
                break;

            case SAVE: //zapis
                IO.saveFile(PhoneBookDataBase.getPhoneBookDataBase().getRecordsArray(), "Baza.txt");
                break;

            case OPEN: //odczyt
                PhoneBookDataBase.getPhoneBookDataBase().setRecordsArray(IO.openFile("Baza.txt"));
                break;

            default:
                break;
        }
    }


}
