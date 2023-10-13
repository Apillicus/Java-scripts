
/**
 *This generates a name based on user input.
 *
 * @author (Christopher Thompson)
 * @version (11 Feb 23)
 */
import java.util.Scanner;
public class generateStarWarsName
{
    /**
     * Constructor for objects of class NameGenerator
     */
    public generateStarWarsName()
    {
        Scanner input = new
        Scanner(System.in);
        System.out.println ("Please enter your first name; ");
            String firstName = input.nextLine();
            firstName = firstName.substring(0,2);
        System.out.println ("Please enter your last name: ");
            String lastName = input.nextLine();
            lastName = lastName.substring(0,3);
        System.out.println ("Please enter your mother's maiden name: ");
            String maidenName = input.nextLine();
            maidenName = maidenName.substring(0,2);
        System.out.println ("Please enter your birth city: ");
            String birthCity = input.nextLine();
            birthCity = birthCity.substring(0,3);
        System.out.println ("your Star Wars first name: " + lastName + firstName);
        System.out.println ("Your Star Wars last name: " + maidenName + birthCity);
            input.close();
    }

    /**
     * This is not at all meant to steal someone's security questions
     */
    
}
