package com.mrgrd56.tinkoff5bukvsolver.games;

import com.mrgrd56.tinkoff5bukvsolver.games.abstractions.BuiltGame;
import com.mrgrd56.tinkoff5bukvsolver.games.builders.abstractions.MispositionedLettersBuilder;

public class Game_2022_05_28 extends BuiltGame {
    @Override
    protected String prepareFoundLetters() {
        return "-----";
    }

    @Override
    protected String prepareAbsentLetters() {
        return "букаотысяь";
    }

    @Override
    protected MispositionedLettersBuilder prepareMispositionedLetters() {
        return MispositionedLettersBuilder.lineByLine()
                .line("---в-")
                .line("--з-в")
                .line("-в-з-");
    }
}
