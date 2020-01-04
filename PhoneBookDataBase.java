package pl.bci.g73.itcamp.phonebook;

/**
 * @description:
 * @author: Gerard
 * @date: 02-01-2019:15
 * @version: 1.00
 */
public class PhoneBookDataBase {
    //singleton
    private static final PhoneBookDataBase phoneBookDataBase = new PhoneBookDataBase();

    private DBRecord[] phoneBookArray = new DBRecord[15]; //książka tel. z 15 rekordami

    //konstruktor (tworzy zalążek bazy, pare rekordów, reszte mozna dodać ręczni i potem zapisać do pliku)
    public PhoneBookDataBase() {
        phoneBookArray[0] = new DBRecord("31-142 Kraków, ul. Mickiewicza 54",
                "501-100-200", "", "", 0,
                "Comarch", "111", "Company");

        phoneBookArray[1] = new DBRecord("31-142 Kraków, ul. Słowackiego 54",
                "506-100-200", "", "", 0,
                "Prokom", "222", "Company");

        phoneBookArray[2] = new DBRecord("31-142 Kraków, ul. Miłosza 54",
                "505-500-500", "", "", 0,
                "Optimus", "333", "Company");

        phoneBookArray[3] = new DBRecord("31-145 Katowice, ul. Słowackiego 5",
                "","Tomasz","Nowak", 505-111-111,
                "", "", "Person");
    }

    public static PhoneBookDataBase getPhoneBookDataBase() {
        return phoneBookDataBase;
    }

    public DBRecord[] getPhoneBookArray() {
        return phoneBookArray;
    }

    public void setPhoneBookArray(DBRecord[] phoneBookArray) {
        this.phoneBookArray = phoneBookArray;
    }
}




