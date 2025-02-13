
import java.util.HashMap;


public class Abbreviations {
   
   private HashMap<String,String> abbreviations; // abbreviation, explanation
   
    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }
   
   public void addAbbreviation(String abbreviation, String explanation){
       this.abbreviations.put(abbreviation, explanation);
   }
   
   public boolean hasAbbreviation(String abbreviation){
      return this.abbreviations.containsKey(abbreviation);
   }
   
   public String findExplanationFor(String abbreviation){
       return this.abbreviations.get(abbreviation);
   }
}
