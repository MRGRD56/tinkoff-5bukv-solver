package com.mrgrd56.tinkoff5bukvsolver.games.abstractions;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class Game {
    public abstract Character[] getFoundLetters();

    public abstract Set<Character> getAbsentLetters();

    public abstract Map<Character, Set<Integer>> getMispositionedLetters();

    private static final Set<Character> letterPlaceholders = Set.of(' ', '_', '-', '*', '?', '+');

    protected Character[] createFoundLetters(Character l1, Character l2, Character l3, Character l4, Character l5) {
        return new Character[]{l1, l2, l3, l4, l5};
    }

    protected Character[] parseFoundLetters(String letters) {
        if (letters.length() != 5) {
            throw new RuntimeException("Letters length must be 5");
        }

        return letters.chars().mapToObj(value -> (char) value).map(letter -> {
            return letterPlaceholders.contains(letter) ? null : letter;
        }).toArray(Character[]::new);
    }

    protected Set<Character> parseAbsentLetters(String letters) {
        return letters.chars()
                .mapToObj(letter -> (char) letter)
                .collect(Collectors.toSet());
    }
}
