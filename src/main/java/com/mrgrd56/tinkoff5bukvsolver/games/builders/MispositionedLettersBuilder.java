package com.mrgrd56.tinkoff5bukvsolver.games.builders;

import java.util.*;

public class MispositionedLettersBuilder {
    private final Map<Character, Set<Integer>> mispositionedLetters = new HashMap<>();

    public MispositionedLettersBuilder letter(Character letter, Integer... wrongPositions) {
        mispositionedLetters.put(letter, new HashSet<>(Arrays.asList(wrongPositions)));
        return this;
    }

    public Map<Character, Set<Integer>> build() {
        return mispositionedLetters;
    }
}
