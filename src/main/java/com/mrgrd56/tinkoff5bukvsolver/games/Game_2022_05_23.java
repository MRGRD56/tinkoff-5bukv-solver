package com.mrgrd56.tinkoff5bukvsolver.games;

import com.mrgrd56.tinkoff5bukvsolver.games.abstractions.Game;
import com.mrgrd56.tinkoff5bukvsolver.games.builders.ActualMispositionedLettersBuilder;

import java.util.Map;
import java.util.Set;

public class Game_2022_05_23 extends Game {
    @Override
    public Character[] getFoundLetters() {
        return parseFoundLetters("----а");
    }

    @Override
    public Set<Character> getAbsentLetters() {
        return parseAbsentLetters("щепквхтлин");
    }

    @Override
    public Map<Character, Set<Integer>> getMispositionedLetters() {
        return new ActualMispositionedLettersBuilder()
                .letter('а', 1)
                .letter('д', 0)
                .build();
    }
}
