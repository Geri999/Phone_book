package pl.bci.g73.itcamp.phonebook;

import java.io.Serializable;

/**
 * @description:
 * @author: Gerard
 * @date: 02-01-2018:29
 * @version: 1.00
 */
public  class Address extends ID implements Serializable {

    // dodatkowe pola
    private String address; //mozna potem rozbić na poszczególne składowe
    private String landlinePhone; // tel. stacjonarny (przypisany do adresu)

    // konstruktor

    public Address(String address, String landlinePhone) {
        super();
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
}
