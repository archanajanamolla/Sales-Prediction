import org.apache.commons.math3.stat.regression.SimpleRegression;

public class SalesPrediction {
    public static void main(String[] args) {
        double[] advertisingCosts = {225, 240, 245, 250, 275, 280, 280, 290};
        double[] yearlySales = {12000, 12445, 12556, 12500, 12787, 12856, 13010};

        SimpleRegression regression = new SimpleRegression();
        for (int i = 0; i < yearlySales.length; i++) {
            regression.addData(advertisingCosts[i], yearlySales[i]);
        }

        double predictedSale2022 = regression.predict(1.2 * advertisingCosts[advertisingCosts.length - 1]);
        double predictedSale2024 = regression.predict(1.2 * 1.2 * advertisingCosts[advertisingCosts.length - 1]);

        System.out.println("Predicted sale in 2022: " + predictedSale2022);
        System.out.println("Predicted sale in 2024: " + predictedSale2024);
    }
}
