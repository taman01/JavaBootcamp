package org.example.lesson3;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.regex.Pattern;

public class RegularEx {

    private static final Pattern regexp = Pattern.compile("(\\d+)\\D(\\d+)");

    private static String readLine()  throws IOException {
        return new LineNumberReader(new InputStreamReader(System.in)).readLine();
    }

     static int processLinePlus(String line) {
        var matcher = regexp.matcher(line);
        matcher.find();
        var a = Integer.parseInt(matcher.group(1));
        var b = Integer.parseInt(matcher.group(2));
        return a + b;

    }

    static int processLineMinus(String line) {
        var matcher = regexp.matcher(line);
        matcher.find();
        var a = Integer.parseInt(matcher.group(1));
        var b = Integer.parseInt(matcher.group(2));
        return a - b;

    }


    public static void main(String[] args) throws IOException {
        while (true) {
            var line = readLine();
            if (line.equals("Exit")) return;
            System.out.println(line);

            System.out.println("_________");

            var result = processLinePlus(line);
            System.out.println(result);

            System.out.println("_______________");

            var minus = processLineMinus(line);
            System.out.println(minus);


        }


    }
}
