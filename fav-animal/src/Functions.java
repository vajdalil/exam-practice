import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.Files.readAllLines;

public class Functions {

  private Path filePath = Paths.get("favourites.txt");
  private List<String> listOfFavoriteAnimals = new ArrayList<>();

  public void readFile() {
    try {
      listOfFavoriteAnimals = readAllLines(filePath);
    } catch (IOException e) {
      System.out.println("Unable to read file: " + filePath);
    }
  }

  public void addAnimalToFile(String[] args) {
    for (int i = 0; i < args.length; i++) {
      if (!listOfFavoriteAnimals.contains(args[i])) {
        listOfFavoriteAnimals.add(String.valueOf(args[i]));
      } else {
        System.out.println("You already added " + args[i] + " as your favourite animal!");
      }
    }
    try {
      Files.write(filePath, listOfFavoriteAnimals);
    } catch (Exception e) {
      System.out.println("Unable to add: no task provided");
    }
  }
}

