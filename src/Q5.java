//Q5) Demonstrate the use of repeat(), strip(),trim(), isBlank(), indent(), transform(), stripIndent(), translateEscapes(),tripleQuotes and formatted() methods

public class Q5 {
    public static void main(String[] args) {
        // Repeat
        System.out.println("Repeat use:");
        System.out.println("Hello World! ".repeat(3));
        System.out.println();

        // Strip
        System.out.println("Strip use:");
        System.out.println("\u2005\u2005Hello World!\u2005\u2005".strip());
        System.out.println();

        // Trim
        System.out.println("Trim use:");
        System.out.println("\u2005\u2005Hello World!\u2005\u2005".trim());
        System.out.println();

        // isBlank
        System.out.println("isBlank use:");
        System.out.println("".isBlank());
        System.out.println();

        // indent
        System.out.println("indent use:");
        System.out.print("Hello World!".indent(10));
        System.out.print("Hello World!".indent(10).indent(-5));
        System.out.println();

        // transform
        System.out.println("Transform use:");
        System.out.println(
                (String) "    Hello World!    "
                        .transform(String::trim)
                        .transform(String::toUpperCase)
        );
        System.out.println();

        // stripIndent
        System.out.println("stripIndent use:");
        String s = """
                Hello World!
                    This is indented line.
                        This is indented too.
                """;
        System.out.println(s.stripIndent());
        System.out.println();

        // translateEscape
        System.out.println("translateEscape use:");
        System.out.println("Hello\\tWorld!".translateEscapes());
        System.out.println();

        // tripleQuotes
        System.out.println("tripleQuotes use:");
        System.out.println("""
                This is a multiline string.
                It contains multiple lines.
                    While also maintaining the formatting as seen in the code file.
                """);
        System.out.println();

        // formatted
        System.out.println("formatted use:");
        System.out.println("Hello %s!".formatted("World"));
        System.out.println();

    }
}
