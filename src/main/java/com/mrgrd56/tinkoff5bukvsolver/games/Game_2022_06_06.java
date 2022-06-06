package com.mrgrd56.tinkoff5bukvsolver.games;

import com.mrgrd56.tinkoff5bukvsolver.games.abstractions.BuiltGame;
import com.mrgrd56.tinkoff5bukvsolver.games.builders.abstractions.MispositionedLettersBuilder;

public class Game_2022_06_06 extends BuiltGame {
    @Override
    protected String prepareFoundLetters() {
        return "----а";
    }

    @Override
    protected String prepareAbsentLetters() {
        return "вождьгубир";
    }

    @Override
    protected MispositionedLettersBuilder prepareMispositionedLetters() {
        return MispositionedLettersBuilder.lineByLine()
                .lines("""
                        ---к-
                        -ск--
                        """);
    }
}
