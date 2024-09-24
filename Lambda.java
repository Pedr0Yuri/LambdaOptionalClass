import java.util.List;
import java.util.ArrayList;

public class Lambda{
  public static void main(String args[]){
    
    System.out.println("Imprimindo todos os elementos da lista!");
    List<Integer> list = ArrayList.asList(1,2,3,4,5,6,7,8,9);
    for(Integer n: list){
      System.out.println(n);
    }

    System.out.println("Imprime todos os elementos pares da lista!");
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
    list.forEach(n -> {
       if (n % 2 == 0) {
             System.out.println(n);
       }
    });
    
  }
}
