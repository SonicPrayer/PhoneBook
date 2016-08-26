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
        this.addEntry("Иванов И.И.", new String[] {"+8 800 2000 500", "+8 800 200 600"});
        this.addEntry("Петров П.П.", new String[] {"+8 800 2000 700"});
        this.addEntry("Сидоров С.С.", new String[] {"+8 800 2000 800", "+8 800 2000 900", "+8 800 2000 000"});

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
