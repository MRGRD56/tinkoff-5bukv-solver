package com.mrgrd56.tinkoff5bukvsolver.games;

import com.mrgrd56.tinkoff5bukvsolver.games.abstractions.BuiltGame;
import com.mrgrd56.tinkoff5bukvsolver.games.builders.abstractions.MispositionedLettersBuilder;

public class Game_2022_06_05 extends BuiltGame {
    @Override
    protected String prepareFoundLetters() {
        return "-е---";
    }

    @Override
    protected String prepareAbsentLetters() {
        return "бочканфть";
    }

    @Override
    protected MispositionedLettersBuilder prepareMispositionedLetters() {
        return null;
    }
}
