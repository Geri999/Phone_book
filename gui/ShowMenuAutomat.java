package pl.bci.g73.itcamp.phonebook.gui;

public class ShowMenuAutomat { //klasa ta służy do nauki programowania bo jest zbyt.... akademicka

    public static void MenuPozShowMenu() {

        String poziom = "*";
        String pion = "|";

        //zmierzenie długości najdłuższej pozycji z menu (do tworzenia gwiazdek :-) )
        int max = 0;
        for (MenuPoz value : MenuPoz.values()) {
            if (value.description.length() > max) max = value.description.length();
        }

        final StringBuilder sb = new StringBuilder();
        sb.append("\n");
        //gwiazki na górze
        //for (int i = 0; i < (int) (max) / 2; i++) sb.append("*");
        sb.append(multi(poziom, max / 2));
        sb.append(" M E N U "+poziom);
        sb.append(multi(poziom, max / 2));
        sb.append("\n");
        for (MenuPoz value : MenuPoz.values()) {

            sb.append(pion+"  ").append((value.key == 100) ? MiniCSS.printHLc(value.description) :
                    "\t" + value.key + "-\t" + value.description);
            if (value.key == 100) {
                sb.append(multi(" ", max - value.description.length() + 6)).append(pion);
            } else
                sb.append(multi(" ", max - value.description.length() + 1)).append(pion);
            sb.append("\n");


        }
        //gwiazki na dole
        sb.append(multi(poziom, max + 10));

        sb.append("\n");
        sb.append("Wybierz pozycję i naciśnij [ENTER]");
        System.out.println(sb.toString());
    }

    public static String multi(String sign, int multi) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < multi; i++) sb.append(sign);

        return sb.toString();
    }


}
