package com.mrgrd56.tinkoff5bukvsolver.games.abstractions;

import java.util.Map;
import java.util.Set;

public abstract class Game {
    public abstract Character[] getFoundLetters();
    public abstract Set<Character> getAbsentLetters();
    public abstract Map<Character, Set<Integer>> getMispositionedLetters();

    protected Character[] buildFoundLetters(Character l1, Character l2, Character l3, Character l4, Character l5) {
        return new Character[] {l1, l2, l3, l4, l5};
    }
}
