/*
 * A list of items.
 * 
 * @author  Poul Henriksen
 * @version 1.0 (March 2005)
 */

import java.util.HashMap;
import java.util.Iterator;

public class Items
{
    private HashMap items = new HashMap();
    
    /**
     * Create a new item list.
     */
    public Items()
    {
    }
    
   /* public Iterator iterator() {
        return items.values().iterator();
    }*/

    public Item remove(String name) {
        return (Item) items.remove(name);
    }
    
    public void put(String name, Item value) {
        items.put(name, value);
    }
    
    public Item get(String name) {
        return (Item) items.get(name);
    }
    
    /**
     * Return a string listing the items in the list.
     */
    public String getLongDescription() 
    {
        String returnString = "";
        for(Iterator iter = items.values().iterator(); iter.hasNext(); )
            returnString += "  " + ((Item) iter.next()).getDescription();
        
        return returnString;     
    }
    
    /**
     * Return a string listing the items in the list.
     */
    public String getShortDescription() 
    {
        String returnString = "";
        for(Iterator iter = items.values().iterator(); iter.hasNext(); )
            returnString += " " + ((Item) iter.next()).getName();
        
        return returnString;     
    }
    
    public double getTotalWeight() {
        double weight = 0;
        for(Iterator iter = items.values().iterator(); iter.hasNext(); )
            weight += ((Item) iter.next()).getWeight();
        return weight;        
    }
}
