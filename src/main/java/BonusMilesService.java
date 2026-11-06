public class BonusMilesService {

    public int BonusCalc(int ticketPrice) {
        int bonusQuant;
        bonusQuant = 20;
        int result;
        result = ticketPrice / bonusQuant;
        return result;
    }
}
