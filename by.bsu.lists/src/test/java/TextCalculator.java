
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class TextCalculator {
    @Test
        public void TestfindWordsThatHasA(){
            List<String> input=Arrays.asList("apple","cat","dog");
            TextCalculator calculator=new TextCalculator();
            List<String>result=calculator.findWordsThatHasA(input);

            System.out.println(result);
        }
}

