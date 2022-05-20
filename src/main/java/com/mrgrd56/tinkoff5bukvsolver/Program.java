package com.mrgrd56.tinkoff5bukvsolver;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Program {
    private static final Character[] foundLetters = {null, null, 'в', 'е', 'т'};
    private static final Set<Character> absentLetters = Set.of('а', 'б', 'р', 'з', 'л');
    private static final Map<Character, Set<Integer>> mispositionedLetters = Map.ofEntries(
            Map.entry('о', Set.of(0, 2)),
            Map.entry('в', Set.of(0)),
            Map.entry('т', Set.of(1))
    );

    public static void main(String[] args) throws Exception {
        var matchingWords = findMatchingWords(foundLetters, absentLetters, mispositionedLetters);
        printWords(matchingWords);
    }

    private static List<String> getAllWords() throws IOException {
        var fileStream = Program.class.getClassLoader().getResourceAsStream("russian_nouns_normalized.txt");
        assert fileStream != null;
        var fileBytes = fileStream.readAllBytes();
        var fileText = new String(fileBytes, StandardCharsets.UTF_8);
        return Arrays.stream(fileText.split("\r\n")).toList();
    }

    private static void printWords(Collection<String> words) {
        System.out.println("Words found: " + words.size());
        System.out.println(String.join(", ", words.stream().limit(250).toList()));
    }

    private static Map<Integer, Character> getLettersMap(Character[] letters) {
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

    private static List<String> findMatchingWords(
            Character[] foundLetters,
            Set<Character> absentLetters,
            Map<Character, Set<Integer>> mispositionedLetters) throws IOException {
        var foundLettersMapEntries = getLettersMap(foundLetters).entrySet();
        var mispositionedLettersMapEntries = mispositionedLetters.entrySet();

        return getAllWords().stream()
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
                            return letterIndex != -1 && letterIndex != wrongPosition;
                        });
                    })) {
                        return false;
                    }

                    return true;
                })
                .toList();
    }
}
