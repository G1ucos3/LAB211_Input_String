package repository;

import dataAccess.AnalyzeDao;
import model.InputString;

/**
 *
 * @author ASUS
 */
public class AnalyzeRepository implements IAnalyze {
    @Override
    public void getNumbers(String input, InputString s){
        AnalyzeDao.Instance().analyzeNumber(input, s);
    }
    
    @Override
    public void getCharacters(String input, InputString s){
        AnalyzeDao.Instance().analyzeCharacter(input, s);
    }
}
