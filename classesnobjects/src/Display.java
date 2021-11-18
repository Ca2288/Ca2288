
public class Display {
    //attributes or fields of our class

  private  int maxDisplayValue;
   private int defaultDisplayValue;
    private int currentDisplayValue;

    Display(int maxDisplayValue,
            int defaultDisplayValue,
            int currentDisplayValue) {
        this.maxDisplayValue = maxDisplayValue;
        this.defaultDisplayValue = defaultDisplayValue;
        this.currentDisplayValue = currentDisplayValue;

    }

    Display() {
        this(99, 50, 0);
// this .maxDisplayValue=maxDisplayValue=99;
// this .defaultDisplayValue=defaultDisplayValue=50;
// this.currentDisplayValue=currentDisplayValue=0;
    }

    Display(int maxDisplayValue) {
        //this.maxDisplayValue=maxDisplayValue;
        this(maxDisplayValue, 0, 0);

    }

    int getMaxDisplayValue() {
        return maxDisplayValue;
    }

    void setMaxDisplayValue(int maxDisplayValue) {
        this.maxDisplayValue = maxDisplayValue;
    }

    int getDefaultDisplayValue() {
        return defaultDisplayValue;
    }

    void setDefaultDisplayValue(int defaultDisplayValue) {
        this.defaultDisplayValue = defaultDisplayValue;
    }

    int getCurrentDisplayValue() {
        return currentDisplayValue;
    }

    void setCurrentDisplayValue(int currentDisplayValue) {
        this.currentDisplayValue = currentDisplayValue;
    }

    void incrementDisplayValue() {
        int currValue = getCurrentDisplayValue();
        currValue += 1;
        if (currValue > getMaxDisplayValue()) {
            setCurrentDisplayValue(getDefaultDisplayValue());
        } else {
            setCurrentDisplayValue(currValue);
        }
    }
}
