import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/*
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  For each existing exit, the room 
 * stores a reference to the neighboring room.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 1.0 (February 2002)
 */

public class Room 
{
    private String description;
    private HashMap exits;        // stores exits of this room.
    private Items items;        // stores items available in this room.
    
    /**
     * Create a room described "description". Initially, it has no exits.
     * "description" is something like "in a kitchen" or "in an open court 
     * yard".
     */
    public Room(String description) 
    {
        this.description = description;
        exits = new HashMap();
        items = new Items();
    }

    /**
     * Define an exit from this room.
     */
    public void setExit(String direction, Room neighbor) 
    {
        exits.put(direction, neighbor);
    }

    /**
     * Return the description of the room (the one that was defined in the
     * constructor).
     */
    public String getShortDescription()
    {
        return description;
    }

    /**
     * Return a long description of this room, in the form:
     *     You are in the kitchen.
     *     Exits: north west
     */
    public String getLongDescription()
    {
        return "You are " + description + ".\n" + getExitString() + "\nItems in the room: " + items.getLongDescription();
    }
   
    /**
     * Return a string describing the room's exits, for example
     * "Exits: north west".
     */
    private String getExitString()
    {
        String returnString = "Exits:";
        Set keys = exits.keySet();
        for(Iterator iter = keys.iterator(); iter.hasNext(); )
            returnString += " " + iter.next();
        return returnString;
    }

    /**
     * Return the room that is reached if we go from this room in direction
     * "direction". If there is no room in that direction, return null.
     */
    public Room getExit(String direction) 
    {
        return (Room)exits.get(direction);
    }
    
    /**
     * Puts an item into this room.
     */
    public void addItem(Item item) {
        items.put(item.getName(), item);
    }
    
    /**
     * Returns the item if it is available, otherwise it returns null.
     */
    public Item getItem(String name) {
        return (Item) items.get(name);
    }    
    
    /**
     * Removes and returns the item if it is available, otherwise it returns null.
     */
    public Item removeItem(String name) {
        return (Item) items.remove(name);
    }
}

