package MapFlatMapDemo;

import java.util.List;

public class Customers {

    private String name;
    private int id;
    private String lastname;
    private List<String> phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(List<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Customers(String name, int id, String lastname, List<String> phoneNumber) {
        this.name = name;
        this.id = id;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
    }
}
