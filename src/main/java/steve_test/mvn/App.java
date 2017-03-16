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
        System.out.println( "is a new release 2.0.11");
        
    }
}
