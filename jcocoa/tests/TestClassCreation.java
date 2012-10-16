import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: 1
 * Date: 04.10.12
 * Time: 9:51
 * To change this template use File | Settings | File Templates.
 */
public class TestClassCreation {

    @Test
    public void testClasses() {

        final Class x = Integer.class;
        new x() {
            void x(){
                System.out.println("blabla");
            }
        }.x();

    }
}
