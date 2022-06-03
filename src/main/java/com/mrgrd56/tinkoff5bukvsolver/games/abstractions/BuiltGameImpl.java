package com.mrgrd56.tinkoff5bukvsolver.games.abstractions;

import com.mrgrd56.tinkoff5bukvsolver.games.builders.abstractions.MispositionedLettersBuilder;

public class BuiltGameImpl extends BuiltGame {
    private final String foundLetters;
    private final String absentLetters;
    private final String mispositionedLetters;

    public BuiltGameImpl(String foundLetters, String absentLetters, String mispositionedLetters) {
        this.foundLetters = foundLetters;
        this.absentLetters = absentLetters;
        this.mispositionedLetters = mispositionedLetters;
    }

    @Override
    protected String prepareFoundLetters() {
        return foundLetters;
    }

    @Override
    protected String prepareAbsentLetters() {
        return absentLetters;
    }

    @Override
    protected MispositionedLettersBuilder prepareMispositionedLetters() {
        return MispositionedLettersBuilder.lineByLine()
                .lines(mispositionedLetters);
    }
}
