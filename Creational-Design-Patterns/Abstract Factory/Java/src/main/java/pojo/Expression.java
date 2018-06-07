package pojo;

public class Expression implements Cloneable{
    public String phrase;

    @Override
    public Expression clone(){
        Expression clone = null;
        try{
            clone = (Expression)super.clone();
        } catch (CloneNotSupportedException ex){
            ex.printStackTrace();
        }
        return clone;
    }

    @Override
    public String toString(){
        return phrase;
    }
}
