package me.dio.ArrayListsSet.set;

import java.util.HashMap;
import java.util.Map;

public class MainMap {

    static void main(String[] args) {
        Map<String, User> users = new HashMap<>();

        users.put("eduardo@eduardo.com", new User(1, "Eduardo"));
        users.put("ulisses@ulisses.com", new User(2, "Ulisses"));
        users.put("pereira@pereira.com", new User(3, "Pereira"));
        users.put("silva@silva.com", new User(4, "Silva"));

        System.out.println(users.containsKey("eduardo@eduardo.com"));
        System.out.println(users.containsValue(new User(1, "Eduardo")));
        System.out.println(users.hashCode());
        System.out.println(users.replace("silva@silva.com", new User(4, "Silveira")));
        System.out.println(users);

    }
}
