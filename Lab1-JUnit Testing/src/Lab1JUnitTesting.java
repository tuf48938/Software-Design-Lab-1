
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;
import org.junit.runner.Result;

/**
 *
 * @author tuf48938
 */
public class Lab1JUnitTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Date d1 = new Date(2009, 5, 25);
//        Date d2 = new Date(2010, 3, 25);
//        
//        int daysBetween = d1.daysTo(d2);
//        
//        System.out.println(daysBetween);

        Result result = JUnitCore.runClasses(TestJunit.class);
        
        for(Failure failure: result.getFailures()) {
            System.out.println(failure.toString());
        }
        
        System.out.println(result.wasSuccessful());
    }
    
}