package phonebook.methods;

import phonebook.classes.Record;
import phonebook.gui.MiniCSS;

import java.io.*;

/**
 * @description:
 * @author: Gerard
 * @date: 04-01-2000:51
 * @version: 1.00
 */
public class IO {

    public static void saveFile(Record[] tablica, String plik) {
        try {
            FileOutputStream fos = new FileOutputStream(plik);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(tablica);
            oos.flush();
            oos.close();
            System.out.println(MiniCSS.printOK("Tablica zapisana "));
        } catch (IOException e) {
            System.out.println(MiniCSS.printERROR("ERROR SAVE"));
            e.printStackTrace();
        }
    }


    public static Record[] openFile(String plik) {
        Record[] dbRecords;
        try {
            FileInputStream fis = new FileInputStream(plik);
            ObjectInputStream ois = new ObjectInputStream(fis);
            dbRecords = (Record[]) ois.readObject();
            ois.close();
            System.out.println(MiniCSS.printOK("Baza wczytana poprawnie "));
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(MiniCSS.printERROR("Nie udało się odczytać pliku"));
            e.printStackTrace();
            return null;
        }
        return dbRecords;
    }
}

