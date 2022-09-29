import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class HalloJavamitForEach {

    private List<String> liste;

    public void main(String args[])
    {
        liste = Arrays.asList();
        liste.forEach((String s) -> System.out.println(s));
    }



}
