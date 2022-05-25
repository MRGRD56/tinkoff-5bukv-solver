package com.mrgrd56.tinkoff5bukvsolver.games.builders;

import com.mrgrd56.tinkoff5bukvsolver.games.builders.abstractions.MispositionedLettersBuilder;

import java.util.*;

public class ActualMispositionedLettersBuilder extends MispositionedLettersBuilder {
    public MispositionedLettersBuilder letter(Character letter, Integer... wrongPositions) {
        mispositionedLetters.put(letter, new HashSet<>(Arrays.asList(wrongPositions)));
        return this;
    }
}
