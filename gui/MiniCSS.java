package pl.bci.g73.itcamp.phonebook.gui;

/**
 * @description:
 * @author: Gerard
 * @date: 04-01-2001:14
 * @version: 1.00
 */
public class MiniCSS {
    public static String kolor0 = "\u001B[30m"; //white
    public static String kolor1 = "\u001B[31m"; //red
    public static String kolor2 = "\u001B[32m"; //green
    public static String kolor3 = "\u001B[33m"; //yellow
    public static String kolor4 = "\u001B[34m"; //blue
    public static String kolor5 = "\u001B[35m"; //magenta
    public static String kolor6 = "\u001B[36m"; //cyan
    public static String kolor7 = "\u001B[37m"; //gray

    public static String kolor10 = "\u001B[40m"; //BG - white
    public static String kolor11 = "\u001B[41m"; //BG - red
    public static String kolor12 = "\u001B[42m"; //BG - green
    public static String kolor13 = "\u001B[43m"; //BG - yellow
    public static String kolor14 = "\u001B[44m"; //BG - blue
    public static String kolor15 = "\u001B[45m"; //BG - magenta
    public static String kolor16 = "\u001B[46m"; //BG - cyan
    public static String kolor17 = "\u001B[47m"; //BG - gray

    public static String kolor20 = "\u001B[30m\u001B[44m"; //white & BG - blue

    public static String stop = "\u001B[0m"; //off

    public static void printHL(String tekst) {
        System.out.println(MiniCSS.kolor20 + tekst + MiniCSS.stop);
    }

    public static String printHLc(String tekst) {
        return MiniCSS.kolor20 + tekst + MiniCSS.stop;
    }


}
