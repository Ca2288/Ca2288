package za.co.mecer.joke.dataaccess;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;
import za.co.mecer.joke.model.Joke;

public class JokeDAOTextImpl extends JokeDAOImpl {
  private static JokeDAOTextImpl jokeDAOTextImpl;

  private JokeDAOTextImpl(String fileName) {
    try {
      List<Joke> jokeList = Files.lines(Paths.get(fileName))
              .map(s -> s.trim())
              .filter(s -> !s.isEmpty())
              .map(line -> line.split(","))
              .filter(parts -> parts.length == 2)
              .map(parts -> new Joke(Integer.valueOf(parts[0]), parts[1]))
              .collect(Collectors.toList());
      super.setJokeList(jokeList);
      super.setFileName(fileName);
    } catch (IOException ex) {
      System.out.println("Oh no: cannot read the jokes");
    }
  }

  public static JokeDAOImpl getInstance(String filename) {
    if (jokeDAOTextImpl == null) {
      jokeDAOTextImpl = new JokeDAOTextImpl(filename);
    }
    return jokeDAOTextImpl;
  }

  @Override
  public boolean addJoke(Joke joke) {
    boolean retVal = super.addJoke(joke);
    if (retVal) {
      String nextJoke = "\r\n" + joke.getCategoryId() + "," + joke.getJoke();
      try {
        Files.write(Paths.get(getFileName()), nextJoke.getBytes(), StandardOpenOption.APPEND);
        retVal = true;
      } catch (IOException iox) {
      }
    }
    return retVal;
  }

  public static void main(String[] args) {
    JokeDAO j = JokeDAOTextImpl.getInstance("C:\\temp\\joke.txt");
    System.out.println("All Jokes in a category: " + j.getJokes(1));
    System.out.println("A random Joke in a category: " + j.getJoke(1));
    System.out.println("All Jokes: " + j.getJokes());
    System.out.println("A Random joke any category: " + j.getJoke());
    Joke joke = new Joke(3, "soo funny. Bwhahaha");
    System.out.println("Adding new joke");
    System.out.println("Joke Added? " + j.addJoke(joke));
  }

}
