package dip.lab2;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class BaggageServiceTipCalculator implements TipCalculator {
    private int bagCount;
    private double tip;

    public BaggageServiceTipCalculator(double tip, int bags) {
        this.setTip(tip); // perform validation
        this.setBagCount(bags);
        
        tip = 1.00;
    }

    @Override
    public double getTip() {
        double tipAmt = bagCount*tip; // always initialize local variables
        return tipAmt;
    }

    public int getBagCount() {
        return bagCount;
    }
    
     public final void setTip(double tip) {
         if(tip < 0) {
            throw new IllegalArgumentException(
                    "Error: Tip must be greater than or equal to zero");
        }
        this.tip = tip;
    }

    public final void setBagCount(int bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException(
                    "Error: bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }

   
    

}
