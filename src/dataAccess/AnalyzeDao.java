package dataAccess;

import common.Validate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import model.InputString;

/**
 *
 * @author ASUS
 */
public class AnalyzeDao {

    private static AnalyzeDao instance = null;
    Validate validate = new Validate();

    public static AnalyzeDao Instance() {
        if (instance == null) {
            synchronized (AnalyzeDao.class) {
                if (instance == null) {
                    instance = new AnalyzeDao();
                }
            }
        }
        return instance;
    }
    
    public void analyzeNumber(String input, InputString s){
        s.setNumbers(getNumber(input));
        System.out.println("Perfect Square Numbers: " + s.getNumbers().get("perfect").toString());
        System.out.println("Odd Numbers: " + s.getNumbers().get("odd").toString());
        System.out.println("Even Numbers: " + s.getNumbers().get("even").toString());
        System.out.println("All Numbers: " + s.getNumbers().get("all").toString());
    }
    
    public void analyzeCharacter(String input, InputString s){
        s.setCharacters(getCharacter(input));
        System.out.println("Uppercase Characters: " + s.getCharacters().get("upper").toString());
        System.out.println("Lowercase Characters: " + s.getCharacters().get("lower").toString());
        System.out.println("Special Characters: " + s.getCharacters().get("special").toString());
        System.out.println("All Characters: " + s.getCharacters().get("all").toString());
    }

    public HashMap<String, List<Integer>> getNumber(String input) {
        HashMap<String, List<Integer>> numbers = new HashMap<>();
        String[] line = input.split("\\D+");
        List<Integer> perfect = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        List<Integer> all = new ArrayList<>();
        for (String s : line) {
            int num = Integer.parseInt(s);
            if (validate.checkOdd(num)) {
                odd.add(num);
            } else {
                even.add(num);
            }
            if (validate.checkPerfectSqaure(num)) {
                perfect.add(num);
            }
            all.add(num);
        }
        numbers.put("perfect", perfect);
        numbers.put("odd", odd);
        numbers.put("even", even);
        numbers.put("all", all);
        return numbers;
    }
    
    public HashMap<String, StringBuilder> getCharacter(String input){
        HashMap<String, StringBuilder> characters = new HashMap<>();
        StringBuilder uppercase = new StringBuilder();
        StringBuilder lowercase = new StringBuilder();
        StringBuilder special = new StringBuilder();
        StringBuilder all = new StringBuilder();
        input = input.replaceAll("\\d+", "");
        String uppercaseS = input.replaceAll("[^A-Z]", "");
        uppercase.append(uppercaseS);
        String lowercaseS = input.replaceAll("[^a-z]", "");
        lowercase.append(lowercaseS);
        String specialS = input.replaceAll("[A-Za-z]", "");
        special.append(specialS);
        all.append(input);
        characters.put("upper", uppercase);
        characters.put("lower", lowercase);
        characters.put("special", special);
        characters.put("all", all);
        return characters;
    }
}
