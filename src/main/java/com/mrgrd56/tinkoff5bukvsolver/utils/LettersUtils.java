package com.mrgrd56.tinkoff5bukvsolver.utils;

import java.util.Set;

public final class LettersUtils {
    private LettersUtils() {
    }

    private static final Set<Character> letterPlaceholders = Set.of(' ', '_', '-', '*', '?', '+');

    public static Character[] parseLine(String line) {
        if (line.length() != 5) {
            throw new RuntimeException("Line length must be 5");
        }

        return line.chars().mapToObj(value -> (char) value).map(letter -> {
            return letterPlaceholders.contains(letter) ? null : letter;
        }).toArray(Character[]::new);
    }
}
