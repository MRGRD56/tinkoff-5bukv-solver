package com.mrgrd56.tinkoff5bukvsolver.games;

import com.mrgrd56.tinkoff5bukvsolver.games.abstractions.Game;
import com.mrgrd56.tinkoff5bukvsolver.games.builders.ActualMispositionedLettersBuilder;

import java.util.Map;
import java.util.Set;

public class Game_2022_05_20 extends Game {
    @Override
    public Character[] getFoundLetters() {
        return createFoundLetters(null, null, 'в', 'е', 'т');
    }

    @Override
    public Set<Character> getAbsentLetters() {
        return Set.of('а', 'б', 'р', 'з', 'л');
    }

    @Override
    public Map<Character, Set<Integer>> getMispositionedLetters() {
        return new ActualMispositionedLettersBuilder()
                .letter('о', 0, 2)
                .letter('в', 0)
                .letter('т', 1)
                .build();
    }
}
