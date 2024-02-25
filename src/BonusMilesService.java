public class BonusMilesService {
    public int calculate(int price) {

        int bonus = 20; // количество рублей для одной бонусной мили;

        return price / bonus;
    }
}
