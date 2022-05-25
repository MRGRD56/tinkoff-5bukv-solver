package com.mrgrd56.tinkoff5bukvsolver.games.builders;

import java.util.*;

public class MispositionedLettersBuilder {
    private final Map<Character, Set<Integer>> mispositionedLetters = new HashMap<>();

    public MispositionedLettersBuilder letter() {
        return this;
    }

    public MispositionedLettersBuilder letter(Character letter, Integer... wrongPositions) {
        mispositionedLetters.put(letter, new HashSet<>(Arrays.asList(wrongPositions)));
        return this;
    }

    public MispositionedLettersBuilder letter(String letter, Integer... wrongPositions) {
        if (letter.length() != 1) {
            throw new RuntimeException("letter must have length = 1");
        }

        return letter(letter.charAt(0), wrongPositions);
    }

    public Map<Character, Set<Integer>> build() {
        return mispositionedLetters;
    }
}
