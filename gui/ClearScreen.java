package phonebook.gui;

public class ClearScreen {

    static void clearScreen() //ok, w inteliJ nie działa
    {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls"); //win
            } else {
                Runtime.getRuntime().exec("clear");  //linux
            }
        } catch (final Exception zignorowane) {
        }
    }
}
