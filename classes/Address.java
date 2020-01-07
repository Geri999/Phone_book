package pl.bci.g73.itcamp.phonebook.classes;

import java.io.Serializable;

/**
 * @description:
 * @author: Gerard
 * @date: 02-01-2018:29
 * @version: 1.00
 */
public  class Address extends Record implements Serializable {

    // dodatkowe pola
    private String address; //mozna potem rozbić na poszczególne składowe
    private String landlinePhone; // tel. stacjonarny (przypisany do adresu)

    // konstruktor
    public Address(String type, String address, String landlinePhone) {
        super(type);
        this.address = address;
        this.landlinePhone = landlinePhone;
    }

    //gettery
    public String getAddress() {
        return address;
    }

    public String getLandlinePhone() {
        return landlinePhone;
    }

    //metody
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
        .append(",\n\t\t[Adres:").append(address).append("]");

        if (landlinePhone.equals("")) {
            sb.append(", [tel. stacjonarny:").append(landlinePhone).append("]");
        }
        return sb.toString();
    }
}
