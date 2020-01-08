package pl.bci.g73.itcamp.phonebook.database;

import pl.bci.g73.itcamp.phonebook.classes.Record;

import java.util.Scanner;

public class DeleteRecord {
    public static void deleteRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Uwaga: Pozostałe rekordy zostaną przesunięte w dół, ID pozostaną bez zmian");
        System.out.println("Uwaga: ID kolejnych rekordów będzie dalej zwiększane o +1");
        System.out.println("Pierwszy rekord ma nr \"0\"");
        System.out.println("Podaj ID rekordu do skasowania");
        int rekordToDelete = sc.nextInt();
        sc.nextLine(); //"konsumcja" [entera]

// szukam w tablicy nr tego ID (bo nie muszą być po kolei, bo może to być kolejne kasowanie)
        Record[] temp = PhoneBookDataBase.getPhoneBookDataBase().getRecordsArray();
        boolean success=false;
        for (int i = 0; i < temp.length; i++) {

            if (temp[i] != null && (temp[i].getIdRecord() == rekordToDelete)) {

                for (int j = i; j < temp.length - 1; j++) {
                    temp[j] = temp[j + 1];
                    temp[temp.length - 1] = null;
                    success=true;
                }
            }
        }
        System.out.println((success==true)?"Rekord skasowany (nawet pusty)":"Niestety operacja nieudana, brak takiego ID");
    }
}
