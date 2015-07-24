public class Card implements Constvar{
    private String mysuit;
    private int mynum;

    public Card(){
        mysuit = Clubs;
        mynum = 0;
    }

    public Card(String suit, int num){
        mysuit = suit;
        mynum = num;
    }

    public String getsuit(){
        return mysuit;
    }

    public int getnum(){
        return mynum;
    }
}