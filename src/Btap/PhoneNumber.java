package Btap;

import java.util.ArrayList;

public class PhoneNumber {
    private String name;
    private ArrayList<String> phoneList = new ArrayList<>();

    public PhoneNumber() {

    }

    public PhoneNumber(String name){
        this.name = name;
    }

    public PhoneNumber(String name, String phone){
        this.name   = name;
        if(!this.phoneList.contains(phone)){
            this.phoneList.add(0, phone);
        }
    }

    public PhoneNumber(String name, ArrayList<String> phoneList) {
        this.name = name;
        this.phoneList = phoneList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(ArrayList<String> phoneList) {
        this.phoneList = phoneList;
    }

    public  void showInfoPhoneNumber() {

        for(var item : this.phoneList) {
            System.out.printf("%-15s%-15s\n", this.name , item);
        }
    }
}