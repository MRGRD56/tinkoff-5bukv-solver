package com.mrgrd56.tinkoff5bukvsolver;

import com.mrgrd56.tinkoff5bukvsolver.games.utils.GameFinder;
import com.mrgrd56.tinkoff5bukvsolver.services.GameSolver;

import java.util.Collection;

public class Program {
    private static final GameSolver gameSolver = new GameSolver();

    public static void main(String[] args) {
        var game = GameFinder.findLastGame();
        System.out.println("Solving " + game.getClass().getSimpleName());
        var matchingWords = gameSolver.findMatchingWords(game);
        printWords(matchingWords);
    }

    private static void printWords(Collection<String> words) {
        System.out.println("Words found: " + words.size());
        System.out.println(String.join(", ", words.stream().limit(250).toList()));
    }
}
