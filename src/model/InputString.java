package model;

import java.util.HashMap;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class InputString {
    private HashMap<String, List<Integer>> numbers = new HashMap<>();
    private HashMap<String, StringBuilder> characters = new HashMap<>();

    public HashMap<String, List<Integer>> getNumbers() {
        return numbers;
    }

    public void setNumbers(HashMap<String, List<Integer>> numbers) {
        this.numbers = numbers;
    }

    public HashMap<String, StringBuilder> getCharacters() {
        return characters;
    }

    public void setCharacters(HashMap<String, StringBuilder> characters) {
        this.characters = characters;
    }
}
