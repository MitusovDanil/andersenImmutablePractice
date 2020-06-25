package com.mitusov;

import java.util.*;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employee = new Employee("Danil", "Mitusov", 10,
                new Address("Spb", "Sovietskaia", 10));
        System.out.println(employee.toString());
        Address address = employee.getAddress();
        System.out.println(address.toString());
        address.setCity("Msk");
        address.setNumberOfHouse(50);
        System.out.println(address.toString());
        System.out.println(employee.toString());

        List<String> list = Arrays.asList("1", "2", "3");
        list = Collections.unmodifiableList(list);

        Set<String> set = new HashSet<>(Arrays.asList("1", "2", "3"));
        set = Collections.unmodifiableSet(set);

        Map<String, Integer> stringMap = new HashMap<>();
        stringMap.put("a", 1);
        stringMap.put("b", 2);
        stringMap.put("c", 3);
        stringMap = Collections.unmodifiableMap(stringMap);
    }
}
