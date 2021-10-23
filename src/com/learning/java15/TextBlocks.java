package com.learning.java15;

public class TextBlocks {

    public static void main(String[] args) {
        final String detailsWithIndentation = """
                    {
                        "name": "User1",
                        "age" : 28
                    }
                """;
        System.out.println("1. detailsWithIndentation ######");
        System.out.println(detailsWithIndentation);

        final String detailsWithoutIndentation = """
                {
                    "name": "User2",
                    "age" : 30
                }""";
        System.out.println("2. detailsWithoutIndentation ######");
        System.out.println(detailsWithoutIndentation);

        final String otherDetailsWithoutIndentation = """
                {
                    "name": "User3",
                    "age" : 20
                }
                """; //No space in block and last """.
        System.out.println("3. otherDetailsWithoutIndentation ######");
        System.out.println(otherDetailsWithoutIndentation);

        final String singleLine = """
                This line will print in a \
                Single Line
                """;
        System.out.println("4. singleLine ######");
        System.out.println(singleLine);

        final String formattedDetails = """
                {
                        "name": "%s",
                        "age" : %d
                }
                """.formatted("User4", 19);
        System.out.println("5. formattedDetails ######");
        System.out.println(formattedDetails);


        final String escapeTrailingSpaces = """
                Line1..............
                SpacesWillBeIgnored                             
                EscapeTrailingSpaces             \s
                """;
        System.out.println("6. escapeTrailingSpaces ######");
        System.out.println(escapeTrailingSpaces);
    }
}
