package com.mrgrd56.tinkoff5bukvsolver.games;

import com.mrgrd56.tinkoff5bukvsolver.games.abstractions.Game;

import java.util.Map;
import java.util.Set;

public class Game_2022_05_20 implements Game {
    @Override
    public Character[] getFoundLetters() {
        return new Character[] {null, null, 'в', 'е', 'т'};
    }

    @Override
    public Set<Character> getAbsentLetters() {
        return Set.of('а', 'б', 'р', 'з', 'л');
    }

    @Override
    public Map<Character, Set<Integer>> getMispositionedLetters() {
        return Map.ofEntries(
                Map.entry('о', Set.of(0, 2)),
                Map.entry('в', Set.of(0)),
                Map.entry('т', Set.of(1))
        );
    }
}
