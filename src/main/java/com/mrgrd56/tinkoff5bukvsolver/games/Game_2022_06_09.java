package com.mrgrd56.tinkoff5bukvsolver.games;

import com.mrgrd56.tinkoff5bukvsolver.games.abstractions.BuiltGame;
import com.mrgrd56.tinkoff5bukvsolver.games.builders.abstractions.MispositionedLettersBuilder;

public class Game_2022_06_09 extends BuiltGame {
    @Override
    protected String prepareFoundLetters() {
        return "-об--";
    }

    @Override
    protected String prepareAbsentLetters() {
        return "ашняувьстлпегхи";
    }

    @Override
    protected MispositionedLettersBuilder prepareMispositionedLetters() {
        return MispositionedLettersBuilder.lineByLine()
                .lines("""
                        б----
                        об---
                        --о-б
                        ---б-
                        """);
    }
}
