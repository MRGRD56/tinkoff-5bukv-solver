package com.mrgrd56.tinkoff5bukvsolver.games.abstractions;

import com.mrgrd56.tinkoff5bukvsolver.games.builders.abstractions.MispositionedLettersBuilder;

import java.util.Map;
import java.util.Set;

public abstract class BuiltGame extends Game {
    protected abstract String prepareFoundLetters();
    protected abstract String prepareAbsentLetters();
    protected abstract MispositionedLettersBuilder prepareMispositionedLetters();

    @Override
    public Character[] getFoundLetters() {
        return parseFoundLetters(prepareFoundLetters());
    }

    @Override
    public Set<Character> getAbsentLetters() {
        return parseAbsentLetters(prepareAbsentLetters());
    }

    @Override
    public Map<Character, Set<Integer>> getMispositionedLetters() {
        return prepareMispositionedLetters().build();
    }
}
