package phonebook.gui;

import phonebook.errors.BadMenuPositionException;

public enum MenuPoz {

    SHOW_HL("WYSWIETLANIE", "HL", 0, 100),
    SHOW_ALL("Wyœwietl ca³¹ ksi¹¿kê telefoniczn¹", "N", 1, 1),
    SHOW_COMP("Wyœwietl firmy", "N", 2, 2),
    SHOW_PERSON("Wyœwietl osoby fizyczne", "N", 3, 3),
    SEARCH_HL("WYSZUKIWANIE", "HL", 4, 100),
    SEARCH_COMP("Wyszukaj firmê", "N", 5, 4),
    SEARCH_PERS("Wyszukaj osobê fizyczn¹", "N", 6, 5),
    ADD_DEL_HL("DODAWANIE/KASOWANIE REKORDÓW", "HL", 7, 100),
    ADD_COMP("Dodaj firmê", "N", 8, 6),
    ADD_PERS("Dodaj osobê fizyczn¹", "N", 9, 7),
    DEL("Usuñ rekord", "N", 10, 10),
    OPER_SYS_HL("OPERACJE SYSTEMOWE", "HL", 11, 100),
    SAVE("(SAVE) Zapisz bazê do pliku (Baza.txt)", "N", 12, 8),
    OPEN("(OPEN) Wczytaj bazê z pliku (Baza.txt)", "N", 13, 9),
    EXIT("Exit", "N", 14, 0);

    String description;
    String headLine;
    int position;
    int key;

    MenuPoz(String description, String headLine, int position, int key) {
        this.description = description;
        this.headLine = headLine;
        this.position = position;
        this.key = key;
    }

    public static MenuPoz searchByKey(int key) throws BadMenuPositionException {
        for (MenuPoz value : MenuPoz.values()) {
            if (value.key==key) {return value;}
        }
        return null;
    }

}
