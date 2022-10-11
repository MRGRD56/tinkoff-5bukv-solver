package com.mrgrd56.tinkoff5bukvsolver.games;

import com.mrgrd56.tinkoff5bukvsolver.games.abstractions.BuiltGame;
import com.mrgrd56.tinkoff5bukvsolver.games.builders.abstractions.MispositionedLettersBuilder;

public class Game_2022_10_11 extends BuiltGame {
    @Override
    protected String prepareFoundLetters() {
        return "";
    }

    @Override
    protected String prepareAbsentLetters() {
        return "вишняуфет";
    }

    @Override
    protected MispositionedLettersBuilder prepareMispositionedLetters() {
        return MispositionedLettersBuilder.lineByLine()
                .lines("""
                        б----
                        """);
    }
}
