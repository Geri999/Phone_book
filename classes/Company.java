package pl.bci.g73.itcamp.phonebook.classes;

import java.io.Serializable;

/**
 * @description:
 * @author: Gerard
 * @date: 02-01-2018:40
 * @version: 1.00
 */
public class Company extends Address implements Serializable {

    private String companyName;
    private String nip;

    //konstruktor
    public Company(String type, String address, String landlinePhone, String companyName, String nip) {
        super(type, address, landlinePhone);
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
        return new StringBuilder(super.toString())
                .append(",\n\t\tCompany=[Firma:")
                .append(companyName).append(", NIP:")
                .append(nip).append("]")
                .append("\n-----------------------------------------------------------------------------------------")
                .toString();
    }

}
