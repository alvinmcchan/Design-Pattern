//折價策略的介面
public abstract class IDiscountStrategy {

    double discount;

    private IDiscountStrategy(){}

    public IDiscountStrategy(double discount){
        this.discount = discount;
    }

    abstract public double getValue(double value);

}