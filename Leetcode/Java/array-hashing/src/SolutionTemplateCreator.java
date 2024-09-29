import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SolutionTemplateCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Difficulty: ");
        String difficulty = scanner.nextLine();

        System.out.print("Problem name: ");
        String problemName = scanner.nextLine();

        String[] words = problemName.split(" ");
        StringBuilder capitalizedProblemName = new StringBuilder();
        for (String word : words) {
            capitalizedProblemName.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1).toLowerCase());
        }

        String fileName = difficulty.substring(0,1).toUpperCase() + difficulty.substring(1) + capitalizedProblemName.toString().trim();

        File file = new File("src/" + fileName + ".java");
        try (FileWriter writer = new FileWriter(file)) {
            String newClassTemplate =
                    String.format("public class %s {\n" +
                                  "   public static void main(String[] args) {\n" +
                                  "       System.out.println(\"New Leetcode problem, Fight!\");\n" +
                                  "   }\n" +
                                  "}", fileName);
            writer.write(newClassTemplate);
        } catch (IOException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}
