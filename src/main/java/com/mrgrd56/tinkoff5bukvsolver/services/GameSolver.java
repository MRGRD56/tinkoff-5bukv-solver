package com.mrgrd56.tinkoff5bukvsolver.services;

import com.mrgrd56.tinkoff5bukvsolver.games.abstractions.Game;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GameSolver {
    private final WordsProvider wordsProvider = new WordsProvider();

    public List<String> findMatchingWords(Game game) {
        return findMatchingWords(game.getFoundLetters(), game.getAbsentLetters(), game.getMispositionedLetters());
    }

    public List<String> findMatchingWords(
            Character[] foundLetters,
            Set<Character> absentLetters,
            Map<Character, Set<Integer>> mispositionedLetters) {
        var foundLettersMapEntries = getLettersMap(foundLetters).entrySet();
        var mispositionedLettersMapEntries = mispositionedLetters.entrySet();

        return wordsProvider.getAllWords().stream()
                .filter(word -> {
                    if (!foundLettersMapEntries.stream().allMatch(entry -> {
                        var index = entry.getKey();
                        var letter = entry.getValue();
                        return word.charAt(index) == letter;
                    })) {
                        return false;
                    }

                    if (!absentLetters.stream().allMatch(letter -> {
                        return !word.contains(Character.toString(letter));
                    })) {
                        return false;
                    }

                    if (!mispositionedLettersMapEntries.stream().allMatch(entry -> {
                        var letter = entry.getKey();
                        var wrongPositions = entry.getValue();
                        return wrongPositions.stream().allMatch(wrongPosition -> {
                            var letterIndex = word.indexOf(Character.toString(letter));
                            return letterIndex != -1 && word.charAt(wrongPosition) != letter;
                        });
                    })) {
                        return false;
                    }

                    return true;
                })
                .toList();
    }

    private Map<Integer, Character> getLettersMap(Character[] letters) {
        if (letters.length != 5) {
            throw new RuntimeException("Letters length must be 5");
        }

        var map = new HashMap<Integer, Character>();

        for (var i = 0; i < letters.length; i++) {
            var letter = letters[i];
            if (letter != null) {
                map.put(i, letter);
            }
        }

        return map;
    }
}
