package com.mrgrd56.tinkoff5bukvsolver.games.builders;

import com.mrgrd56.tinkoff5bukvsolver.games.builders.abstractions.LetterByLetterMispositionedLettersBuilder;

import java.util.Arrays;
import java.util.HashSet;

public class HumanReadableMispositionedLettersBuilder extends LetterByLetterMispositionedLettersBuilder {
    @Override
    public LetterByLetterMispositionedLettersBuilder letter(Character letter, Integer... wrongPositions) {
        var actualWrongPositions = Arrays.stream(wrongPositions)
                .map(position -> position - 1)
                .toList();

        mispositionedLetters.put(letter, new HashSet<>(actualWrongPositions));
        return this;
    }
}
