package com.mrgrd56.tinkoff5bukvsolver.games.abstractions;

import java.util.Map;
import java.util.Set;

public interface Game {
    Character[] getFoundLetters();
    Set<Character> getAbsentLetters();
    Map<Character, Set<Integer>> getMispositionedLetters();
}
