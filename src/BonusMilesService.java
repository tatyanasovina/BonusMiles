public class BonusMilesService {
    public int calculate(int cost) {
        int price = cost;
        int bonus = 20;
        int miles = price / bonus * 1;

        return miles;
    }


}


