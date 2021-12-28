import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<String> listA =new ArrayList<>();
        listA.add("JAVA");
        listA.add("python");
        listA.add("phpA");
        TextCalculator calculator=new TextCalculator();
        List<String> findHasA=calculator.findWordsThatHasA(listA);

        System.out.println(findHasA);

        List<String> listB =new ArrayList<>();
        listB.add("java");
        listB.add("Python");
        listB.add("phpA");

        List<String> findcapital=calculator.findWordsThatstartWithCapital(listB);
        System.out.println(findcapital);

        List<Integer> listC =new ArrayList<>();
        listC.add(13);
        listC.add(57);
        listC.add(9);
        List<Integer> findx=calculator.findNumbersThatGreaterThanX(listC,10);
        System.out.println(findx);
        //listB.stream()
                //.map(x->x*x*x)
                //.filter(x->x>3)
               // .forEach(x->
               //         System.out.println(x)
             //   );
        //System.out.println(list.get(0));
        //System.out.println(list.size());
       // System.out.println(list.contains(5));
        //System.out.println(list.stream());

    }
    }
