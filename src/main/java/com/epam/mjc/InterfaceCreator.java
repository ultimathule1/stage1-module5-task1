package com.epam.mjc;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfaceCreator {

    public Predicate<List<String>> isValuesStartWithUpperCase() {
        return (x) -> {
            for (String s : x) {
                if (!Character.isUpperCase(s.indexOf(0))) return false;
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

    public Supplier<List<String>> filterCollection(List<String> values) {
        return (x) -> {
            List<String> list = new LinkedList<>();
            for (String e : values) {
                if (Character.isUpperCase(e.indexOf(0)) && e.endsWith(".") && e.split(" +").length > 3) {
                    
                }
            }
        };
    }

    public Function<List<String>, Map<String, Integer>> stringSize() {
        throw new UnsupportedOperationException("You should implement this method.");
    }

    public BiFunction<List<Integer>, List<Integer>, List<Integer>> concatList() {
        throw new UnsupportedOperationException("You should implement this method.");
    }
}
