package org.example.lesson3;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.regex.Pattern;

public class Regular {
    private static final Pattern pattern = Pattern.compile("\\+(\\d{1,3})[- ](\\d{3})[- ]\\d{3}[- ]\\d{2}[- ]\\d{2}");

    // игнорируем throws IOException
    public static void main(String[] args) throws IOException {
        var consoleReader = createConsoleReader();
        String input = consoleReader.readLine();

        var matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println("pattern is callNumber");

            // some logic here
        }else {
            System.out.println("pattern is not callNumber");
        }

        var codeCountry = matcher.group(1);
        var codeOperator = matcher.group(2);
        var Phone = matcher.group(0);
        System.out.println("Телефон: " + Phone);
        System.out.println("Код страны: " + codeCountry);
        System.out.println("Код оператора: " + codeOperator);

    }

    // игнорируем страшную конструкцию
    private static LineNumberReader createConsoleReader() {
        return new LineNumberReader(new InputStreamReader(System.in));
    }
}
