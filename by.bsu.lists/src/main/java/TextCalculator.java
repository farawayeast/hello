import java.util.List;
import java.util.stream.Collectors;


public class TextCalculator {
    public List<String> findWordsThatHasA(List<String>text){
            return text.stream().filter(x -> x.contains("A")).collect(Collectors.toList());
    }
    public List<String> findWordsThatstartWithCapital(List<String>text){

        return text.stream().filter(X ->X.matches("^[A-Z][a-z]+$") ).collect(Collectors.toList());

    }
    public List<Integer>findNumbersThatGreaterThanX(List<Integer>numbers,int x) {
        return numbers.stream().filter(Y -> Y>x ).collect(Collectors.toList());
    }

}