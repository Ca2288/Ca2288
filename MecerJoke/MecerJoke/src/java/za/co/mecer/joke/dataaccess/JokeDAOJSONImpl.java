/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mecer.joke.dataaccess;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import za.co.mecer.joke.model.Joke;

/**
 *
 * @author StuartFripp
 */
public class JokeDAOJSONImpl extends JokeDAOImpl{
   private static JokeDAOJSONImpl jokeDAOJsonImpl;
   
  private JokeDAOJSONImpl(String fileName){
    try {
  
      ObjectMapper objectMapper = new ObjectMapper();
      List<Joke>jokeList = objectMapper.readValue(new File(fileName), new TypeReference<List<Joke>>(){});
      super.setJokeList(jokeList);
      super.setFileName(fileName);
    } catch (IOException ex) {
       System.out.println("Oh no: cannot read the jokes: "+ex.getMessage());
    }
  }
  
   public static JokeDAOImpl getInstance(String filename) {
    if (jokeDAOJsonImpl == null) {
      jokeDAOJsonImpl = new JokeDAOJSONImpl(filename);
    }
    return jokeDAOJsonImpl;
  }
   
   public static void main(String[] args) {
    JokeDAO j = JokeDAOJSONImpl.getInstance("C:\\temp\\joke.json");
    System.out.println("All Jokes in a category: " + j.getJokes(1));
    System.out.println("A random Joke in a category: " + j.getJoke(1));
    System.out.println("All Jokes: " + j.getJokes());
    System.out.println("A Random joke any category: " + j.getJoke());
//    Joke joke = new Joke(3, "soo funny. Bwhahaha");
//    System.out.println("Adding new joke");
//    System.out.println("Joke Added? " + j.addJoke(joke));
  }
  
  
  
}
