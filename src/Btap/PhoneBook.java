package Btap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone {

private ArrayList<PhoneNumber> phoneList;

 public PhoneBook() {
  phoneList = new ArrayList<>();
 }

 public ArrayList<PhoneNumber> getPhoneList() {
  return phoneList;
 }

 @Override
 public void insertPhone(String name, String phone) {
  for (PhoneNumber p : phoneList){
   if(p.getName().equals(name)){
    if(p.getPhone().contains(phone)){
     return;
    }
    p.getPhone().add(phone);
    return;
   }
  }
  //ra ngoai for chac chan ko co name trung
  PhoneNumber pn = new PhoneNumber(name,phone);
  phoneList.add(pn);
  return;
 }

 @Override
 public void removePhone(String name) {
  for (PhoneNumber p : phoneList){
   if(p.getName().equals(name)){
      phoneList.remove(p);
   }
  }
  return;
 }

 @Override
 public void updatePhone(String name, String oldphone, String newPhone) {

  for (PhoneNumber p : phoneList){
   if(p.getName().equals(name)){

    if(p.getPhone().contains(oldphone)){
     p.getPhone().remove(oldphone);
     p.getPhone().add(newPhone);
    }
   }
  }
return;
 }

 @Override
 public PhoneNumber searchPhone(String name) {
  for (PhoneNumber p : phoneList){
   if(p.getName().equals(name)){
       return p;
   }
  }

  return null;
 }

 @Override
 public void sort() {
  //bubble sort
  int size = phoneList.size();
  for(int i = 0; i < size; i++){
   for (int j = 0; j < size - i-1;j++){
    String name_pj = phoneList.get(j).getName();
    String name_pj1 = phoneList.get(j+1).getName();
    if(name_pj.compareTo(name_pj1)>0) {
     PhoneNumber tmp = phoneList.get(j);
     phoneList.add(j, phoneList.get(j + 1));
     phoneList.add(j+1,tmp);

    }
   }
   }
  Collections.sort(phoneList, new Comparator<PhoneNumber>(){
   @Override
   public int compare(PhoneNumber o1, PhoneNumber o2) {
    return o1.getName().compareTo(o2.getName());
   }
          }

  );
 }
}
