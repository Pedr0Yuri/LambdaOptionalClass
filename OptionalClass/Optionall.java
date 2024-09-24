import java.util.Optional; // Implementação da optional class
public class Main {  
    public static void main(String[] args) {  
        String[] str = new String[10];  
        Optional<String> checkNull = Optional.ofNullable(str[5]);
        //Verifica se é nulo, então este método retorna se é vazio ou não.
                                                    
        if(checkNull.isPresent()){  // Checa se o valor vazio da classe optinal esta presente 
            String stringAula = str[5].toLowerCase();  
            System.out.print(stringAula);  
        }else  
            System.out.println("Não há valor de String definido");  
    }  
}  
