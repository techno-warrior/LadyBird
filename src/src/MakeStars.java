package src;

/**
 * Created by Daniel on 12/05/2015.
 */
public class MakeStars {
    private int amountOfStars = 0;
    public MakeStars(int i){
        amountOfStars = i;

    }

    public String stars(){

        String starStr = "";

        for(int k = 0; k<amountOfStars;k++){
            starStr = starStr.concat("*");
        }
        return starStr;
    }
}
