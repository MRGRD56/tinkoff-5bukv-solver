package com.mrgrd56.tinkoff5bukvsolver.games.builders.abstractions;

import com.mrgrd56.tinkoff5bukvsolver.games.builders.ActualMispositionedLettersBuilder;
import com.mrgrd56.tinkoff5bukvsolver.games.builders.HumanReadableMispositionedLettersBuilder;

import java.util.*;

public abstract class MispositionedLettersBuilder {
    protected final Map<Character, Set<Integer>> mispositionedLetters = new HashMap<>();

    public abstract MispositionedLettersBuilder letter(Character letter, Integer... wrongPositions);

    public MispositionedLettersBuilder letter(String letter, Integer... wrongPositions) {
        if (letter.length() != 1) {
            throw new RuntimeException("letter must have length = 1");
        }

        return letter(letter.charAt(0), wrongPositions);
    }

    public MispositionedLettersBuilder letter() {
        return this;
    }

    public Map<Character, Set<Integer>> build() {
        return mispositionedLetters;
    }

    public static MispositionedLettersBuilder actual() {
        return new ActualMispositionedLettersBuilder();
    }

    public static MispositionedLettersBuilder humanReadable() {
        return new HumanReadableMispositionedLettersBuilder();
    }
}
