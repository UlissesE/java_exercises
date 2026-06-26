package me.dio.ArrayListsSet.set;

import java.util.*;

public class Main {
    public static void main(String[] argsr) {
        Set<User> users = new LinkedHashSet<>();
        users.add(new User(1, "Eduardo"));
        users.add(new User(2, "Ulisses"));
        users.add(new User(3, "Pereira"));
        users.add(new User(4, "Silva"));

        System.out.println(users.contains(new User(1, "Eduardo")));

        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        users.removeAll(List.of(new User(1, "Eduardo")));
        System.out.println(users);

        System.out.println();

        users.removeIf(user -> user.getId() == 2);
        System.out.println(users);
    }
}
