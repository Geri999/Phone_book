package pl.bci.g73.itcamp.phonebook;

import java.io.Serializable;

/**
 * @description:
 * @author: Gerard
 * @date: 02-01-2018:40
 * @version: 1.00
 */
public class Company extends Person implements Serializable {

    private String companyName;
    private String nip;

    //konstruktor
    public Company(String address, String landlinePhone, String name, String surname,
                   int mobile, String companyName, String nip) {
        super(address, landlinePhone, name, surname, mobile);
        this.companyName = companyName;
        this.nip = nip;
    }

    //gettery i settery
    public String getCompanyName() {
        return companyName;
    }

    public String getNip() {
        return nip;
    }

    @Override
    public String toString() {
        return new StringBuilder("ID=").append(getIdDBPhoneBook())
                .append(", Company=[Firma:")
                .append(companyName).append(", NIP:")
                .append(nip).append("]").toString();
    }

}
