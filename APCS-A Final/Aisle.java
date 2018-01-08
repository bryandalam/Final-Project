
/**
 * Creates an Aisle object that uses Item as an instance variable
 *
 * @author Bryan Lam
 *)
 */
public class Aisle
{
    //instance variables
    private String aisleName;
    private Item itemName;
    private int itemsStocked;
    public Aisle(String nm, Item n, int itstk) {
        this.aisleName = nm;
        this.itemName = n;
        this.itemsStocked = itstk;
    }
    public String toString() {
        return "The " + aisleName + " aisle is stocked with " + itemName + " and has " + itemsStocked + " avaliable.";
    }
    public boolean compareAisles(Aisle other) {
        if(this.aisleName.compareTo(other.aisleName) == 0 && this.itemsStocked == other.itemsStocked) {
            return true;
        }
        else {
            return false;
        }
    }
}
        
