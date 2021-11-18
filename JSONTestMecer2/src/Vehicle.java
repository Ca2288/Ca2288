
public class Vehicle {
    private String colour;
    private String Brand;
    private  String type;

    public Vehicle() {
    }

    
    public Vehicle(String colour, String Brand, String type) {
        this.colour = colour;
        this.Brand = Brand;
        this.type = type;
        
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "colour=" + colour + ", Brand=" + Brand + ", type=" + type + '}';
    }

 
    
    
}
