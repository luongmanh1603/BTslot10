package Btap;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        var choice = 0;
        var input = new Scanner(System.in);

        PhoneBook phoneBook = new PhoneBook();
        do{
            System.out.println("\n=======================");
            System.out.println("1. Add Phone number in Phone Book");
            System.out.println("2. Remove Phone Number in Phone Book by name");
            System.out.println("3. Update new phone number");
            System.out.println("4. Search phone number in Phone Book by name");
            System.out.println("5. Sort Phone Book by name");
            System.out.println("6. Show information Phone Book");
            System.out.println("0. Exit");
            System.out.println("==========================\n");


            System.out.println("Your choice? ");
            choice = input.nextInt();
            input.nextLine();

            switch(choice){
                case 0:
                    System.out.println("Thanks!!!!");
                    break;
                case 1:
                    System.out.println("Enter name: ");
                    var name = input.nextLine();
                    System.out.println("Enter phone number: ");
                    var phone = input.nextLine();
                    phoneBook.insertPhone(name, phone);
                    phoneBook.showInfo();
                    break;
                case 2:
                    System.out.println("Enter name: ");
                    var nameRemove = input.nextLine();
                    phoneBook.removePhone(nameRemove);
                    break;
                case 3:
                    System.out.println("Enter name that you want to update: ");
                    var nameUpdate =input.nextLine();
                    System.out.println("Enter phone that you e=want to update: ");
                    var phoneUpdate = input.nextLine();
                    System.out.println("Enter the new phone: ");
                    var newPhone = input.nextLine();

                    phoneBook.updatePhone(nameUpdate, phoneUpdate, newPhone);
                    break;
                case 4:
                    System.out.println("Enter name that you want to search in Phone Book :");
                    var nameSearch = input.nextLine();

                    var result = phoneBook.searchPhone(nameSearch);
                    if(result == null){
                        System.out.println("Do not find!!");
                    }
                    else{
                        System.out.println("Phone number has name " + nameSearch + ": ");
                        result.showInfoPhoneNumber();
                    }
                    break;
                case 5:
                    phoneBook.sort();
                    System.out.println("Phone book after sorted: ");
                    phoneBook.showInfo();
                case 6:
                    phoneBook.showInfo();
                    break;

                default:
                    System.out.println("Invalid option!");
                    break;
            }

        }
        while(choice != 0);
    }


}
