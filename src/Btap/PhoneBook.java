package Btap;

import java.util.ArrayList;

public class PhoneBook extends Phone {

 private ArrayList<PhoneNumber> phoneList = new ArrayList<>();

 public ArrayList<PhoneNumber> getPhoneList() {
  return phoneList;
 }

 public void setPhoneList(ArrayList<PhoneNumber> phoneList) {
  this.phoneList = phoneList;
 }

 public PhoneBook() {

 }

 public PhoneBook(String name , String phone) {
  PhoneNumber p = new PhoneNumber(name, phone);
  if(!this.phoneList.contains(p)){
   this.phoneList.add(0, p);
  }
 }

 @Override
 public  void insertPhone(String name, String phone){
  System.out.println(this.phoneList.size() );
  if(this.phoneList.size() ==0 ) {
   PhoneNumber p = new PhoneNumber(name, phone);
   this.phoneList.add(p);
   System.out.println("Insert complete!!");
  }

  for(int i = 0; i < this.phoneList.size()  ; i++) {
   if(this.phoneList.get(i).getName().compareTo(name) == 0){
    if(!this.phoneList.get(i).getPhoneList().contains(phone)) {
     PhoneNumber p = new PhoneNumber(name, phone);
     this.phoneList.add(0, p);
     System.out.println("Insert complete!!");
     break;
    }
    else{
     System.out.println("This phone number and user is exist!");
    }
   }
   else{
    PhoneNumber p = new PhoneNumber(name, phone);
    this.phoneList.add(p);
    System.out.println("Insert complete!!");
   }

  }
 }
 @Override
 public  void removePhone(String name){
  for( int i = 0; i < this.phoneList.size(); i ++) {
   if(this.phoneList.get(i).getName().compareTo(name) == 0){
    this.phoneList.remove(this.phoneList.get(i));
    System.out.println("Remove complete!");
    break;
   }
   else{
    System.out.println("Remove failed!!!");
   }
  }
 }
 @Override
 public  void updatePhone(String name, String phone, String newPhone){
  for(int i = 0; i < this.phoneList.size() ; i++ ){
   if(this.phoneList.get(i).getName().compareTo(name) == 0
           && this.phoneList.get(i).getPhoneList().contains(phone)){
    this.phoneList.get(i).getPhoneList().remove(phone);
    this.phoneList.get(i).getPhoneList().add(newPhone);
    System.out.println("Update complete!");
    break;
   }
   else{
    System.out.println("Do not find information phone number!!!");
   }
  }
 }
 @Override
 public  PhoneNumber searchPhone(String name){
  for(int i = 0; i < this.phoneList.size() ; i++ ){
   if(this.phoneList.get(i).getName().compareTo(name) == 0){
    return this.phoneList.get(i);
   }
  }
  return null;
 }

 @Override
 public  void sort(){
  this.phoneList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

 }
 public void showInfo() {
  System.out.printf("%-15s%-15s\n", "Name", "Phone number");
  for( int i = 0 ; i < this.phoneList.size() ; i ++ ) {
   this.phoneList.get(i).showInfoPhoneNumber();
  }
 }
}
