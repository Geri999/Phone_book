package pl.bci.g73.itcamp.phonebook.database;

import pl.bci.g73.itcamp.phonebook.classes.Company;
import pl.bci.g73.itcamp.phonebook.classes.Person;
import pl.bci.g73.itcamp.phonebook.classes.Record;

/**
 * @description:
 * @author: Gerard
 * @date: 02-01-2019:15
 * @version: 1.00
 */
public class PhoneBookDataBase {
    //singleton
    private static final PhoneBookDataBase phoneBookDataBase = new PhoneBookDataBase();

    //książka tel. z 15 rekordami
    private Record[] recordsArray = new Record[15];

    //konstruktor
    //tworzy zalążek bazy, pare rekordów, po testach usuń i trzeba wczytać bazę az dysku)
    public PhoneBookDataBase() {
        recordsArray[0] = new Company("Company","31-142 Kraków, ul. Mickiewicza 54",
                "501-100-200", "Comarch", "111");

        recordsArray[1] = new Company("Company","31-142 Kraków, ul. Słowackiego 54",
                "506-100-200", "Prokom", "222");

        recordsArray[2] = new Company("Company","31-142 Kraków, ul. Miłosza 54",
                "505-500-500", "Optimus", "333");

        recordsArray[3] = new Person("Person","31-145 Katowice, ul. Słowackiego 5",
                "444-444-444","Tomasz","Nowak", 505111111);
    }
    //gettery i settery
    //todo: return phoneBookDataBase czy PhoneBookDataBase.phoneBookDataBase ??
    public static PhoneBookDataBase getPhoneBookDataBase() {
        return phoneBookDataBase;
    }

    //zwraca tablice rekordów (15 szt. w tym nulle)
    public Record[] getRecordsArray() {
        return recordsArray;
    }

    //podmienia tablice rekordów (15 szt.) używana do wczytywania z dysku
    public void setRecordsArray(Record[] recordsArray) {
        this.recordsArray = recordsArray;
    }
}




