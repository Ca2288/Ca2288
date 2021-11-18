
public class _Consumer {
    
}
interface _OurConsumer{
    void accept(Person p);
}
 class Person{
   String name;
   int args;

    public Person(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getArgs() {
        return args;
    }

    void setArgs(int args) {
        this.args = args;
    }
 }