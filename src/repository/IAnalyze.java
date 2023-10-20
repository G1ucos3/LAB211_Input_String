package repository;

import model.InputString;

/**
 *
 * @author ASUS
 */
public interface IAnalyze {

    void getCharacters(String input, InputString s);

    void getNumbers(String input, InputString s);
    
}
