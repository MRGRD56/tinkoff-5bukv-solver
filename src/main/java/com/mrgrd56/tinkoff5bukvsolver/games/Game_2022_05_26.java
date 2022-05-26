package com.mrgrd56.tinkoff5bukvsolver.games;

import com.mrgrd56.tinkoff5bukvsolver.games.abstractions.BuiltGame;
import com.mrgrd56.tinkoff5bukvsolver.games.builders.abstractions.MispositionedLettersBuilder;

public class Game_2022_05_26 extends BuiltGame {
    @Override
    protected String prepareFoundLetters() {
        return "---та";
    }

    @Override
    protected String prepareAbsentLetters() {
        return "билев";
    }

    @Override
    protected MispositionedLettersBuilder prepareMispositionedLetters() {
        return MispositionedLettersBuilder.humanReadable()
                .letter('т', 5)
                .letter('р', 2)
                .letter('а', 3);
    }
}
