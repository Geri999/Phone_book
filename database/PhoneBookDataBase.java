package phonebook.database;

import phonebook.model.Company;
import phonebook.model.Person;
import phonebook.model.Record;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Gerard
 * @date: 02-01-2019:15
 * @version: 1.00
 */
public class PhoneBookDataBase {
    //singleton
    private static final PhoneBookDataBase phoneBookDataBase = new PhoneBookDataBase();

    //baza
    private List<Record> recordsArray = new ArrayList<>();

    //konstruktor, tworzy zalążek bazy
    public PhoneBookDataBase() {
        recordsArray.add(new Company("Company","31-142 Kraków, ul. Mickiewicza 54",
                "501-100-200", "Comarch", "111"));

        recordsArray.add(new Company("Company","31-142 Kraków, ul. Słowackiego 54",
                "506-100-200", "Prokom", "222"));

        recordsArray.add(new Company("Company","31-142 Kraków, ul. Miłosza 54",
                "505-500-500", "Optimus", "333"));

        recordsArray.add(new Person("Person","31-145 Katowice, ul. Słowackiego 5",
                "444-444-444","Tomasz","Nowak", 505111111));
    }
    //dostep do tej klasy/obiektu w ramach sigletonu
    public static PhoneBookDataBase getPhoneBookDataBase() {
        return PhoneBookDataBase.phoneBookDataBase;
    }

    //zwraca ArrayList rekordów (getter)
    public List<Record> getRecordsArray() {
        return recordsArray;
    }

    //setter dla głównej bazy ArrayList -  używana do wczytywania z dysku
    public void setRecordsArray(List<Record> recordsArray) {
        this.recordsArray = recordsArray;
    }
}




