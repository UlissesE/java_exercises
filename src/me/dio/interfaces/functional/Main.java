package me.dio.interfaces.functional;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Maria", 41),
                new User("João", 32),
                new User("Eduardo", 19),
                new User("Ana", 19)
        );
        printStringValue(Record::toString, users);
    }

    private static void printStringValue(Function<User, String> callback, List<User> users) {
        users.forEach(user -> System.out.println(callback.apply(user)));
    }
}
