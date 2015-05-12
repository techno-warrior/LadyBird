package JavaThings;

/**
 * Created by Daniel on 12/05/2015.
 */
public class MakeStar {
    private int amount = 0;
    public MakeStar(int i){
        amount = i;
    }
    public String getStars(){
        String s = "";
        for (int k =0; k < amount;k++){
            s = s.concat("*");
        }
        return s;
    }
}
