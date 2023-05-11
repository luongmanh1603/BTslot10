package Btap;

import java.util.ArrayList;

public final class PhoneNumber {
  private String name;
  private ArrayList<String> phone;

    public PhoneNumber(String name, String phone) {
        this.name = name;
        this.phone = new ArrayList<>();
        this.phone.add(phone);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getPhone() {
        return phone;
    }
}