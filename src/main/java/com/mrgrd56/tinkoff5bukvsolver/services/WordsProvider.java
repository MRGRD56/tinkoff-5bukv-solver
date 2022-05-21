package com.mrgrd56.tinkoff5bukvsolver.services;

import com.mrgrd56.tinkoff5bukvsolver.Program;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

public class WordsProvider {
    private static final String fileName = "russian_nouns_normalized.txt";

    public List<String> getAllWords() throws IOException {
        var fileStream = Program.class.getClassLoader().getResourceAsStream(fileName);
        assert fileStream != null;
        var fileBytes = fileStream.readAllBytes();
        var fileText = new String(fileBytes, StandardCharsets.UTF_8);
        return Arrays.stream(fileText.split("\r\n")).toList();
    }
}
