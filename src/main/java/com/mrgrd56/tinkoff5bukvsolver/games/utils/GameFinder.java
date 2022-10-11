package com.mrgrd56.tinkoff5bukvsolver.games.utils;

import com.mrgrd56.tinkoff5bukvsolver.games.abstractions.Game;
import org.reflections.Reflections;

import java.util.Comparator;

public final class GameFinder {
    private GameFinder() { }

    public static Game findLastGame() {
        var reflections = new Reflections("com.mrgrd56.tinkoff5bukvsolver.games");
        var games = reflections.getSubTypesOf(Game.class);
        var gameClass = games.stream()
                .filter(clazz -> clazz.getSimpleName().matches("Game_.+"))
                .max(Comparator.comparing(Class::getSimpleName))
                .orElseThrow(() -> new RuntimeException("No games found"));

        try {
            var constructor = gameClass.getConstructor();
            return constructor.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
