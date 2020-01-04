package pl.bci.g73.itcamp.phonebook;

/**
 * @description:
 * @author: Gerard
 * @date: 02-01-2019:05
 * @version: 1.00
 */
public class Person extends Address {
    private String name;
    private String surname;
    private int mobile;

    //konstruktor
    public Person(String address, String landlinePhone, String name, String surname,int mobile) {
        super(address, landlinePhone);
        this.name = name;
        this.surname = surname;
        this.mobile = mobile;
    }

    //gettery i settery


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getMobile() {
        return mobile;
    }

    //metody
    @Override
    public String toString() {
        return new StringBuilder("ID=").append(getIdDBPhoneBook())
                .append(", Person=[")
                .append(name).append(" ").append(surname)
                .append(", tel.")
                .append(mobile).append("]").toString();
    }
}
