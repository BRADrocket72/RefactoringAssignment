public class InsuranceStrategyHigh extends InsuranceStrategy {

    @Override
    int getConstant() {
        return 76500;
    }

    @Override
    double getWeight() {
        return .1;
    }

    @Override
    int getAdjustment() {
        return 30000;
    }
}
