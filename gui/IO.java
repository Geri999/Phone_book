package phonebook.gui;

import phonebook.model.Record;

import java.io.*;
import java.util.List;

/**
 * @description:
 * @author: Gerard
 * @date: 04-01-2000:51
 * @version: 1.00
 */
public class IO {

    static void saveFile(List<Record> tablica, String plik) {
        try {
            FileOutputStream fos = new FileOutputStream(plik);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(tablica);
            oos.flush();
            oos.close();

            System.out.print("Saving");
            for (int i = 0; i < 15; i++) {
                System.out.print(".");
                Thread.sleep(100);
            }
            System.out.println();


            System.out.println(MiniCSS.printOK("Tablica zapisana "));
        } catch (IOException | InterruptedException e) {
            System.out.println(MiniCSS.printERROR("ERROR SAVE"));
            e.printStackTrace();
        }
    }


    static List<Record> openFile(String plik) {
        List<Record> dbRecords;
        try {
            FileInputStream fis = new FileInputStream(plik);
            ObjectInputStream ois = new ObjectInputStream(fis);
            dbRecords = (List<Record>) ois.readObject();
            ois.close();

            System.out.print("Loading");
            for (int i = 0; i < 15; i++) {
                System.out.print(".");
                Thread.sleep(100);
            }
            System.out.println();



            System.out.println(MiniCSS.printOK("Baza wczytana poprawnie "));
        } catch (IOException | ClassNotFoundException | InterruptedException e) {
            System.out.println(MiniCSS.printERROR("Nie udało się odczytać pliku"));
            e.printStackTrace();
            return null;
        }
        return dbRecords;
    }
}

