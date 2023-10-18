import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import static junit.framework.TestCase.assertEquals;

public class TestClass {
    @Rule
    public ErrorCollector collector = new ErrorCollector();
    @Test
    public void testOne(){
        for(int t=0;t<StringTests.problemOne.length;t++){
            String string = StringTests.problemOne[t];
            int expected = StringTests.problemOneExpected[t];
            int students = Main.problemOne(string);
            try{
                assertEquals("Input: " + string, expected, students);
            }catch(Throwable e){
                collector.addError(e);
            }
        }
    }
    @Test
    public void testTwo(){
        for(int t=0;t<StringTests.problemTwo.length;t++){
            String string = StringTests.problemTwo[t];
            int expected = StringTests.problemTwoExpected[t];
            int students = Main.problemTwo(string);
            try{
                assertEquals("Input: " + string, expected, students);
            }catch(Throwable e){
                collector.addError(e);
            }
        }
    }
    @Test
    public void testThree(){
        for(int t=0;t<StringTests.problemThree.length;t++){
            String string = StringTests.problemThree[t];
            String expected = StringTests.problemThreeExpected[t];
            String students = Main.problemThree(string);
            try{
                assertEquals("Input: " + string, expected, students);
            }catch(Throwable e){
                collector.addError(e);
            }
        }
    }
}
