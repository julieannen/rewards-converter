import java.util.Scanner;

public class RewardValue {
    private double cashValue;
    private double milesValue;
    private static final double MILES_CONVERSION = 50.0;
    private static final double CASH_CONVERSION = 0.0035;

    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = cashValue * MILES_CONVERSION;
    }

    public RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue = milesValue * CASH_CONVERSION;
    }

    public double getCashValue(){
        return cashValue;
    }

    public double getMilesValue(){
        return milesValue;
    }
}
