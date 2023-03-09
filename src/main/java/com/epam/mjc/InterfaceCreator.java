package com.epam.mjc;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfaceCreator {
    public static void main(String[] args) {

    }

    public static Predicate<List<String>> isValuesStartWithUpperCase() {
        return (x) -> {
            for (String s : x) {
                if (!Character.isUpperCase(s.trim().indexOf(0))) return false;
            }
            return true;
        };
    }

    public Consumer<List<Integer>> addEvenValuesAtTheEnd() {
        return (x) -> {
            Iterator<Integer> iter = x.iterator();
            for (Integer temp; iter.hasNext();) {
                if ((temp = iter.next()) % 2 == 0) x.add(temp);
            }
        };
    }

    public static Supplier<List<String>> filterCollection(List<String> values) {
        return () -> {
            List<String> list = new LinkedList<>();
            for (String e : values)
                if (e.startsWith(" ") && Character.isUpperCase(e.indexOf(0)) && e.endsWith(".") && (e.split(" +").length > 3)) {
                    list.add(e);
                }
            return list;
        };
    }

    public Function<List<String>, Map<String, Integer>> stringSize() {
        return (x) -> {
            Map<String, Integer> map = new LinkedHashMap<>();
            for (String e : x) {
                map.put(e, e.length());
            }
            return map;
        };
    }

    public static BiFunction<List<Integer>, List<Integer>, List<Integer>> concatList() {
        return (x, y) -> {
            List<Integer> list = new LinkedList<>(x);
            list.addAll(y);
            return list;
        };
    }
}