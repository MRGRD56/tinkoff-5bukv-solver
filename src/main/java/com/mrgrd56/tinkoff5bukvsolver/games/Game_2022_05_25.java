package com.mrgrd56.tinkoff5bukvsolver.games;

import com.mrgrd56.tinkoff5bukvsolver.games.abstractions.Game;
import com.mrgrd56.tinkoff5bukvsolver.games.builders.ActualMispositionedLettersBuilder;
import com.mrgrd56.tinkoff5bukvsolver.games.builders.abstractions.MispositionedLettersBuilder;

import java.util.Map;
import java.util.Set;

public class Game_2022_05_25 extends Game {
    @Override
    public Character[] getFoundLetters() {
        return parseFoundLetters("а----");
    }

    @Override
    public Set<Character> getAbsentLetters() {
        return parseAbsentLetters("водкб");
    }

    @Override
    public Map<Character, Set<Integer>> getMispositionedLetters() {
        return MispositionedLettersBuilder.humanReadable()
                .letter('а', 5, 4)
                .letter('з', 3)
                .build();
    }
}
