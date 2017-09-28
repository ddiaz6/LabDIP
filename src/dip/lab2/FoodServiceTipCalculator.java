package dip.lab2;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class FoodServiceTipCalculator implements TipCalculator{
    private double bill;
    private double tip;

    public FoodServiceTipCalculator(double tipAmt, double billAmt) {
        this.setTip(tipAmt);
        this.setBill(billAmt);
    }

    @Override
    public double getTip() {
        double tipTtl = bill*tip; 
        return tipTtl;
    }

    public final void setBill(double billAmt) {
        if(billAmt < 0) {
            throw new IllegalArgumentException("Sorry but bill Amount cannot be lower than 0. Please input bill amount again.");
        }
        bill = billAmt;
    }
    public final void setTip(double tipAmt) {
        if(tipAmt < 0) {
            throw new IllegalArgumentException("Sorry but Tip Amount cannot be lower than 0. Please input a number equal to or greater than zero.");
        }
        tip = tipAmt;
    }
    
}
