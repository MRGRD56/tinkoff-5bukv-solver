package com.mrgrd56.tinkoff5bukvsolver;

import com.mrgrd56.tinkoff5bukvsolver.games.Game_2022_06_09;
import com.mrgrd56.tinkoff5bukvsolver.services.GameSolver;

import java.util.Collection;

public class Program {
    private static final GameSolver gameSolver = new GameSolver();

    public static void main(String[] args) {
        var matchingWords = gameSolver.findMatchingWords(new Game_2022_06_09());
        printWords(matchingWords);
    }

    private static void printWords(Collection<String> words) {
        System.out.println("Words found: " + words.size());
        System.out.println(String.join(", ", words.stream().limit(250).toList()));
    }
}
