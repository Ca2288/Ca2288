
package za.co.mecer.joke.model;

import java.util.Objects;

public class Joke {
  private int categoryId;
  private String joke;

  public Joke(int categoryId, String joke) {
    this.categoryId = categoryId;
    this.joke = joke;
  }

  public Joke() {
  }
  
  public int getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(int categoryId) {
    this.categoryId = categoryId;
  }

  public String getJoke() {
    return joke;
  }

  public void setJoke(String joke) {
    this.joke = joke;
  }

  @Override
  public String toString() {
    return "Joke{" + "categoryId=" + categoryId + ", joke=" + joke + '}';
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 97 * hash + this.categoryId;
    hash = 97 * hash + Objects.hashCode(this.joke);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Joke other = (Joke) obj;
    if (!Objects.equals(this.joke, other.joke)) {
      return false;
    }
    return true;
  }
  
  
}
