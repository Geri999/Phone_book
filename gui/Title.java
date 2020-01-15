package phonebook.gui;

import phonebook.AppPhoneBook;

import java.security.SecureRandom;

/**
 * @description:
 * @author: Gerard
 * @date: 03-01-2015:50
 * @version: 1.00
 */
public class Title {
    public static void castBajer() throws InterruptedException {

        System.out.println("\n\n\nKeyboard not found");
        System.out.println("Press F1 to Resume");
        Thread.sleep(2000);
        System.out.println("\n\n\n\nCurrent date is Tue 1-2-1985\n" +
                "Current time is  8:34:23.12\n\n" +
                "The IBM Personal Computer DOS\n" +
                "Version 1.10 (C)Copyright IBM Corp 1981, 1982\n\n");
        System.out.print("C:\\>");


        user("d:\n");
        System.out.print("D:\\>");

        user("cd pp\bhonebook\n");
        System.out.print("D:\\PHONEBOOK\\>");

        user("phonn\bebooooo\b\b\bk.exe");


        System.out.print("\n\nLoading");
        for (int i = 0; i < 6; i++) {
            System.out.print(".");
            Thread.sleep(700);
        }
        System.out.println("ok, I'm just kidding   :-)\n\n\n\n\n");

        Thread.sleep(2000);
    }
        public static void castTitle() throws InterruptedException {
        System.out.println(MiniCSS.kolor2 + "########  ##     ##  #######  ##    ## ########       ########   #######   ####### " +
                " ##    ## \n" +
                "##     ## ##     ## ##     ## ###   ## ##             ##     ## ##     ## ##     ## ##   ##  \n" +
                "##     ## ##     ## ##     ## ####  ## ##             ##     ## ##     ## ##     ## ##  ##   \n" +
                "########  ######### ##     ## ## ## ## ######         ########  ##     ## ##     ## #####    \n" +
                "##        ##     ## ##     ## ##  #### ##             ##     ## ##     ## ##     ## ##  ##   \n" +
                "##        ##     ## ##     ## ##   ### ##             ##     ## ##     ## ##     ## ##   ##  \n" +
                "##        ##     ##  #######  ##    ## ########       ########   #######   #######  ##    ## (c) 2020 by GP\n" + MiniCSS.stop+ AppPhoneBook.VERSION);
            //Thread.sleep(1000);
        }

    public static void user(String text) throws InterruptedException {
        SecureRandom secureRandom = new SecureRandom();
        for (int i = 0; i < text.length(); i++) {
            Thread.sleep(secureRandom.nextInt(600)+100);
            System.out.print(text.charAt(i));

        }


    }
}
