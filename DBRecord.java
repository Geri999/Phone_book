package pl.bci.g73.itcamp.phonebook;

import java.io.Serializable;

/**
 * @description:
 * @author: Gerard
 * @date: 03-01-2014:35
 * @version: 1.00
 */
public class DBRecord extends Company implements Serializable {

    //pola
    private String type;

    //konstruktor
    public DBRecord(String address, String landlinePhone, String name, String surname, int mobile,
                    String companyName, String nip, String type) {
        super(address, landlinePhone, name, surname, mobile, companyName, nip);
        this.type = type;
    }

    //gettery i settery
    public String getType() {
        return type;
    }

    // metody
    @Override
    public String toString() {
        StringBuilder temp1 = new StringBuilder();

        temp1.append("ID=").append(getIdDBPhoneBook()).append(MiniCSS.kolor3+"\t(Typ:").append(type).append(")"+MiniCSS.stop);

        if (type.equals("Company")) {
            temp1.append(",Company=[Firma:").append(super.getCompanyName())
                    .append(", NIP:").append(super.getNip())
                    .append("]");
        } else {
            temp1.append(",Person=[").append(super.getName()).append(" ").append(super.getSurname())
                    .append(", tel.:").append(super.getMobile())
                    .append("]");
        }

        temp1.append(",\n\t\t[Adres:").append(getAddress()).append("]");

        if (!getLandlinePhone().equals("")) {
            temp1.append(", [tel. stacjonarny:").append(getLandlinePhone()).append("]");
        }
        temp1.append("\n-----------------------------------------------------------------------------------------");
        return temp1.toString();
    }

}
