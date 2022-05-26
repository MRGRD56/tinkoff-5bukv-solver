package com.mrgrd56.tinkoff5bukvsolver.games.builders;

import com.mrgrd56.tinkoff5bukvsolver.games.builders.abstractions.LetterByLetterMispositionedLettersBuilder;

import java.util.*;

public class ActualMispositionedLettersBuilder extends LetterByLetterMispositionedLettersBuilder {
    public LetterByLetterMispositionedLettersBuilder letter(Character letter, Integer... wrongPositions) {
        mispositionedLetters.put(letter, new HashSet<>(Arrays.asList(wrongPositions)));
        return this;
    }
}
