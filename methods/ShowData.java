package phonebook.methods;

import phonebook.classes.Record;
import phonebook.gui.MiniCSS;

public class ShowData {
    public static void showData(Record[] record) {
        int counter = 0;

        if (record != null) {

            for (Record r : record) {
                if (r != null) {
                    System.out.println(r);
                    counter++;
                }

            }
        }
        if (counter == 0) System.out.println(MiniCSS.printERROR("Brak danych"));
    }
}
