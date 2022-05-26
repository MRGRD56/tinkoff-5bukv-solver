package com.mrgrd56.tinkoff5bukvsolver.games.builders.abstractions;

public abstract class LetterByLetterMispositionedLettersBuilder extends MispositionedLettersBuilder {
    public abstract LetterByLetterMispositionedLettersBuilder letter(Character letter, Integer... wrongPositions);

    public LetterByLetterMispositionedLettersBuilder letter(String letter, Integer... wrongPositions) {
        if (letter.length() != 1) {
            throw new RuntimeException("letter must have length = 1");
        }

        return letter(letter.charAt(0), wrongPositions);
    }

    public LetterByLetterMispositionedLettersBuilder letter() {
        return this;
    }
}
