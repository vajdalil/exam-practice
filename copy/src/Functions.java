import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.Files.readAllLines;

public class Functions {
  private Path originalFilePath;
  private Path newFilePath;
  private List<String> linesOfOriginalFile = new ArrayList<>();

  public void copyFile(String[] args) {
    originalFilePath = Paths.get(args[0]);
    newFilePath = Paths.get(args[1]);
    try {
      linesOfOriginalFile = readAllLines(originalFilePath);
    } catch (IOException e) {
      System.out.println("Unable to read file: " + originalFilePath);
    }
    try {
      Files.write(newFilePath, linesOfOriginalFile);
    } catch (Exception e) {
      System.out.println("Unable to add: no task provided");
    }
  }
}
