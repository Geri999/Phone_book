package pl.bci.g73.itcamp.phonebook.classes;

import pl.bci.g73.itcamp.phonebook.gui.MiniCSS;

import java.io.Serializable;

/**
 * @description:
 * @author: Gerard
 * @date: 02-01-2019:18
 * @version: 1.00
 */
public class Record implements Serializable {

    //pola
    private static int idMax = 0;  // licznik rekordów
    private int idRecord;
    private String type; //np. Person lub Company

    //konstruktor
    public Record(String type) {
        this.type = type;
        this.idRecord = idMax++;  //przypisuje i dodaj +1 do poprzedniego. Każdy nowy rekord ma swój niepowtarzalny nr
    }

    //gettery i settery
    public int getIdRecord() {
        return idRecord;
    }

    public static int getIdMax() {
        return idMax;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return new StringBuilder("ID=")
                .append(idRecord)
                .append(MiniCSS.kolor3 + "\t(Typ:").append(type).append(")" + MiniCSS.stop)
                .toString();
    }
}
