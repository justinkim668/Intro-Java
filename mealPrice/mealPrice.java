public class mealPrice{
  public static double calculatedTotalMealPrice(double listedMealPrice,
                                              double tipRate,
                                              double taxRate){
    double tip = tipRate * listedMealPrice;
    double tax = taxRate * listedMealPrice;
    double result = listedMealPrice + tip + tax;
    return result;
  }
  public static void main(String[] args){
    double groupTotalMealCost = calculatedTotalMealPrice(100, .2, .08);
    double individualMealCost = groupTotalMealCost / 5;

    System.out.println(individualMealCost);
  }
}
