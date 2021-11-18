
 
public class Singletontest {

   
    public static void main(String[] args) {
      new MysingletonClass().runMe();
    }
    public void runMe(){
         MysingletonClass theClass= new  MysingletonClass.getInstance();
         theClass.setValue(55);
         theClass.setName("Thabo");
         System.out.println("attrs:");
          MysingletonClass anothet= MysingletonClass.getInstance();
          System.out.println("attrs 2:"+anothet.toString());
          System.out.println(".....made changes........");
          theClass.setName("Adrian");
          anothet.setValue(95);
          System.out.println(""+theClass.toString());
          System.out.println(""+anothet.toString());
    }
}
 class MysingletonClass{
    String name;
    int value;
    static  MysingletonClass mys1=null;

    public static MysingletonClass getInstance(){
       // if(getMys1() == null){
            
       // }
        return getMys1();
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getValue() {
        return value;
    }

    void setValue(int value) {
        this.value = value;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    static MysingletonClass getMys1() {
        return mys1;
    }

    static void setMys1(MysingletonClass aMys1) {
        mys1 = aMys1;
    }


    static class getInstance extends MysingletonClass {

        public getInstance() {
        }
    }
}
        