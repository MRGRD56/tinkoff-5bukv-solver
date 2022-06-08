package com.mrgrd56.tinkoff5bukvsolver.games;

import com.mrgrd56.tinkoff5bukvsolver.games.abstractions.BuiltGame;
import com.mrgrd56.tinkoff5bukvsolver.games.builders.abstractions.MispositionedLettersBuilder;

public class Game_2022_06_08 extends BuiltGame {
    @Override
    protected String prepareFoundLetters() {
        return "---ет";
    }

    @Override
    protected String prepareAbsentLetters() {
        return "бочканфьвзл";
    }

    @Override
    protected MispositionedLettersBuilder prepareMispositionedLetters() {
        return MispositionedLettersBuilder.lineByLine()
                .lines("""
                        -е-т-
                        """);
    }
}
