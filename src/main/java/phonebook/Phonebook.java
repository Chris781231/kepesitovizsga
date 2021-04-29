package phonebook;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class Phonebook {

    public void exportPhonebook(Map<String, String> contacts, String output) {
        if (contacts == null || output == null) {
            throw new IllegalArgumentException("Invalid contacts or output!");
        }

        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(Path.of(output)))) {
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                writer.println(entry.getKey() + ": " + entry.getValue());
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot open file!", ioe);
        }
    }
}
