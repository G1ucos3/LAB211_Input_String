package controller;

import common.Validate;
import model.InputString;
import repository.AnalyzeRepository;

/**
 *
 * @author ASUS
 */
public class AnalyzeController {
    InputString s;
    AnalyzeRepository ar;
    Validate validate;
    
    public AnalyzeController(){
        s = new InputString();
        ar = new AnalyzeRepository();
        validate = new Validate();
    }
    
    public void run(){
        System.out.println("===== Analysis String program =====");
        String input = validate.checkString("Input String");
        System.out.println("-----Result Analysis------");
        ar.getNumbers(input, s);
        ar.getCharacters(input, s);
    }
}
