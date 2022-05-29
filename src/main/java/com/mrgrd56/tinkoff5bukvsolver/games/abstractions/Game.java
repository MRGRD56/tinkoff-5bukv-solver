package com.mrgrd56.tinkoff5bukvsolver.games.abstractions;

import com.mrgrd56.tinkoff5bukvsolver.utils.LettersUtils;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class Game {
    public abstract Character[] getFoundLetters();

    public abstract Set<Character> getAbsentLetters();

    public abstract Map<Character, Set<Integer>> getMispositionedLetters();

    protected Character[] createFoundLetters(Character l1, Character l2, Character l3, Character l4, Character l5) {
        return new Character[]{l1, l2, l3, l4, l5};
    }

    protected Character[] parseFoundLetters(String letters) {
        if (letters == null || letters.length() == 0) {
            return new Character[] {null, null, null, null, null};
        }

        return LettersUtils.parseLine(letters);
    }

    protected Set<Character> parseAbsentLetters(String letters) {
        if (letters == null) {
            return Set.of();
        }

        return letters.chars()
                .mapToObj(letter -> (char) letter)
                .collect(Collectors.toSet());
    }
}
