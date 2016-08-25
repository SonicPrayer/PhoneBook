package org.maxim.phonebook;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Stone on 25.08.2016.
 */


public class PhoneBook {

    private final Map<String, List<String>> entries = new HashMap<String, List<String>>();

    public PhoneBook(){
        this.addEntry("fff", new String[] {"345345", "53453453"});
    }

    private void  addEntry(String name, String[] phoneNumbers) {
        this.entries.put(name, Arrays.asList(phoneNumbers));
    }

    public void getPhone(String name) {
        if (entries.containsKey(name)){
        System.out.println(this.entries.get(name));}
        else {
            System.out.println("Такой записи нет!");
        }
    }
}
