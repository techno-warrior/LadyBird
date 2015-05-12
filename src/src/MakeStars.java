package src;

/**
 * Created by Daniel on 12/05/2015.
 */
public class MakeStars {
    private int amount = 0;
    public MakeStars(int i){
        amount = i;
    }
    public String stars(){
        String starsStr = "";
        for(int k  = 0; k<amount;k++){
            starsStr = starsStr.concat("*");
        }
        return starsStr;
    }
}
