package za.co.mecer.joke.dataaccess;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import za.co.mecer.joke.model.Joke;

public abstract class JokeDAOImpl implements JokeDAO {
  private List<Joke> jokeList;
  private String fileName;

  public JokeDAOImpl() {
  }

  final void setJokeList(List<Joke> jokeList) {
    this.jokeList = jokeList;
  }


  final void setFileName(String fileName) {
    this.fileName = fileName;
  }

  final String getFileName() {
    return fileName;
  }
  
  @Override
  public Joke getJoke(int categoryId) {
    List<Joke> aJokeList = jokeList.stream().filter(j -> j.getCategoryId() == categoryId).collect(Collectors.toList());
    return aJokeList.get((int) (Math.random() * aJokeList.size()));
  }

  @Override
  public List<Joke> getJokes(int categoryId) {
    return jokeList.stream().filter(j -> j.getCategoryId() == categoryId).collect(Collectors.toList());
  }

  @Override
  public Joke getJoke() {
    return jokeList.get((int) (Math.random() * jokeList.size()));
  }

  @Override
  public List<Joke> getJokes() {
    return new ArrayList<>(jokeList);
  }

  @Override
  public boolean addJoke(Joke joke) {
    boolean retVal = false;
    return jokeList.add(joke);
  }

 

}
