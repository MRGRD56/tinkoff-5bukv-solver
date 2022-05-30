package com.mrgrd56.tinkoff5bukvsolver.games;

import com.mrgrd56.tinkoff5bukvsolver.games.abstractions.BuiltGame;
import com.mrgrd56.tinkoff5bukvsolver.games.builders.abstractions.MispositionedLettersBuilder;

public class Game_2022_05_30 extends BuiltGame {
    @Override
    protected String prepareFoundLetters() {
        return null;
    }

    @Override
    protected String prepareAbsentLetters() {
        return "лож";
    }

    @Override
    protected MispositionedLettersBuilder prepareMispositionedLetters() {
        return MispositionedLettersBuilder.lineByLine()
                .lines("""
                        ---ка
                        """);
    }
}
