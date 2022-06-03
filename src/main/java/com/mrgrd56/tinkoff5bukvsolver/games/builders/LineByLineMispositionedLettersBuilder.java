package com.mrgrd56.tinkoff5bukvsolver.games.builders;

import com.mrgrd56.tinkoff5bukvsolver.games.builders.abstractions.MispositionedLettersBuilder;
import com.mrgrd56.tinkoff5bukvsolver.utils.LettersUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LineByLineMispositionedLettersBuilder extends MispositionedLettersBuilder {
    public LineByLineMispositionedLettersBuilder line(String line) {
        var letters = LettersUtils.parseLine(line);

        for (var index = 0; index < letters.length; index++) {
            var letter = letters[index];
            if (letter == null) {
                continue;
            }

            var entry = mispositionedLetters.get(letter);
            if (entry != null) {
                entry.add(index);
            } else {
                mispositionedLetters.put(letter, new HashSet<>(List.of(index)));
            }
        }

        return this;
    }

    public LineByLineMispositionedLettersBuilder lines(String lines) {
        if (lines == null) {
            return this;
        }

        Arrays.stream(lines.split("\n"))
                .filter(StringUtils::isNotEmpty)
                .forEach(this::line);

        return this;
    }
}
