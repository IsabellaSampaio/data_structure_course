import java.util.ArrayList;
public class FindNemo{

  public static void main(String[] args){
  
    ArrayList<String> lista = new ArrayList<String>(); 
  
    lista.add("Dory");
    lista.add("Galli");
    lista.add("Marlin");
    lista.add("Dolby");
    lista.add("Dorothy");
    lista.add("Nemo");
    
    //Its O(n) -> Linear time 

    for(int i = 0; i < lista.size(); i++){
      if(lista.get(i) == "Nemo"){
        System.out.printf("We found nemo in pos: %d", i);
      }
    }


  }
}
