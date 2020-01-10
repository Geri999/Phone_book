package phonebook.gui;

import java.util.ArrayList;

public class FrameGenerator {

    public static String frameGenerator(ArrayList<String> wsad, String title) {

        String leftUp = "\u2554";
        String rightUp = "\u2557";
        String leftDown = "\u255A";
        String rightDown = "\u255D";
        String line = "\u2550";
        String side = "\u2551";

        int max = 0;
        for (String s : wsad) if (s.length() > max) max = s.length();

        //Title modyfications
        String extra = (title.length() % 2 == 1) ? " " : "";


        final StringBuilder sb = new StringBuilder();
        //pierwsza linia
        sb.append(leftUp)
                .append(multi1(line, (max / 2) + title.length() / 2 - 2))
                .append(" " + title + " ")
                .append(multi1(line, (max / 2) + title.length() / 2 - 2))
                .append(rightUp)
                .append("\n");

        //środek
        for (String s : wsad) {

            sb.append(side + "  ");
            if (s.startsWith(">") == true) {
                sb.append(MiniCSS.printHLc(s));
            } else {
                sb.append(s);
            }

            sb.append(multi1(" ", (max - s.length() + title.length())))
                    .append(extra)
                    .append(side)
                    .append("\n");
        }

        //ostatnia linia
        sb.append(leftDown)
                .append(multi1(line, max + 2 + extra.length() + title.length()))
                .append(rightDown);

        //koniec
        return sb.toString();
    }

    public static String multi1(String sign, int repetition) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repetition; i++) sb.append(sign);
        return sb.toString();
    }
}















