package com.mrgrd56.tinkoff5bukvsolver.games.builders.abstractions;

import com.mrgrd56.tinkoff5bukvsolver.games.builders.ActualMispositionedLettersBuilder;
import com.mrgrd56.tinkoff5bukvsolver.games.builders.HumanReadableMispositionedLettersBuilder;
import com.mrgrd56.tinkoff5bukvsolver.games.builders.LineByLineMispositionedLettersBuilder;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class MispositionedLettersBuilder {
    protected final Map<Character, Set<Integer>> mispositionedLetters = new HashMap<>();

    public Map<Character, Set<Integer>> build() {
        return mispositionedLetters;
    }

    public static ActualMispositionedLettersBuilder actual() {
        return new ActualMispositionedLettersBuilder();
    }

    public static HumanReadableMispositionedLettersBuilder humanReadable() {
        return new HumanReadableMispositionedLettersBuilder();
    }

    public static LineByLineMispositionedLettersBuilder lineByLine() {
        return new LineByLineMispositionedLettersBuilder();
    }
}
