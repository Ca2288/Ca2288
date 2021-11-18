
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;


public class Person {
   private String name;
   private Integer age;
   private Boolean isMarried;
   private List<String> hobbies;
   private List<Person> children;
 

    public Person() {
    }

    public Person(String name, Integer age, Boolean isMarried, List<String> hobbies, List<Person> children) {
        this.name = name;
        this.age = age;
        this.isMarried = isMarried;
        this.hobbies = hobbies;
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
 @JsonProperty(value ="isMarried")
    public void setIsMarried(Boolean isMarried) {
        this.isMarried = isMarried;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public Integer getAge() {
        return age;
    }
   

    public Boolean getIsMarried() {
        return isMarried;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public List<Person> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", isMarried=" + isMarried + ", hobbies=" + hobbies + ", children=" + children + '}';
    }
    
}
