import java.util.ArrayList;
public class LogPairs {
  
  public static void main(String[] args){
    
    String boxes[] = {"1", "2", "3", "4", "5"};
    ArrayList<String> pairs = new ArrayList<String>();

    //Its -> O(n^2) because we have a loop that repets itself n times and inside it we have another loop that also repets n times so putting it together we have O(n * n) and that is = O(n^2)  
    for(int i = 0; i < boxes.length; i++){
      String aux = boxes[i];
      for(int j = 0; j < boxes.length; j++){
          pairs.add(aux+boxes[j]);
      }


    }
    
    for(int k = 0; k < pairs.size(); k++)
      System.out.println(pairs.get(k));
  
  }

} 
