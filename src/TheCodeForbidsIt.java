import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.Collectors;


public class TheCodeForbidsIt {

    public static void main(String[] args) throws FileNotFoundException {
       Scanner sc = new Scanner (new File("C:\\Users\\chris\\IdeaProjects\\TheCodeForbidsIt\\src\\file.txt"));
        List<String> words = new ArrayList();

        while(sc.hasNext()){
            words.add(sc.next());
        }
        sc.close();

        System.out.println(words.stream()
                .filter(a -> !a.toLowerCase().equals("it"))
                .collect(Collectors.toList()));
    }
}
