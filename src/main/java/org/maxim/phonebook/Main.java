package org.maxim.phonebook;

/**
 * Created by Stone on 26.08.2016.
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {


        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);
        String search = scanner.nextLine();
        phoneBook.getPhone(search);


    }
}