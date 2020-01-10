package phonebook.gui;

import java.util.ArrayList;

public class ShowMenuAutomat2 {

    public static void MenuPozShowMenu() {

        ArrayList<String> menuContent = new ArrayList<>();

        menuContent.add(" ");

        for (MenuPoz value : MenuPoz.values()) {
//            menuContent.add((value.key == 101) ? MiniCSS.printHLc(value.description) :
//                    "\t" + value.key + "-\t" + value.description);

//            menuContent.add(value.key + " - " + value.description);

            menuContent.add((value.key == 100) ? "> "+value.description :
                    value.key + " - " + value.description);


        }

        System.out.println(FrameGenerator.frameGenerator(menuContent, "M E N U"));
        System.out.println(("\nWybierz pozycję i naciśnij [ENTER]"));

    }
}
