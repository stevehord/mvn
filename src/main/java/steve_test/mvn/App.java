package steve_test.mvn;

import org.joda.time.DateTime;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	DateTime dt = new DateTime();
        System.out.println( "Hello World!: " + dt.toString("dd:MM:yy") + " Its a great time to be alive3");
        System.out.println( "This is a new release");
        System.out.println( "is a new release");
        System.out.println( "I have added a Hot Fix");
        
    }
}
