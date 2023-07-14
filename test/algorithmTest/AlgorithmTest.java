package algorithmTest;


import algorithm.Algorithm;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AlgorithmTest {


    @Test
    public void testCountSpecialCharacters(){
        String[]strings = {"911@abc123_","wc4%@123-","AHc@123+","6543ttd<#"};
        long numberOfSpecialCharacters = Algorithm.countSpecialCharactersIn(strings);
        assertEquals(9L,numberOfSpecialCharacters);
    }

    @Test
    public void testCountSpecialCharacterTwo(){
        String[] strings = {"911@aab23_","wc4@23-","Atch+23","6543ttd<"};
        long numberOfSpecialCharacters = Algorithm.countSpecialCharactersIn(strings);
        assertEquals(6,numberOfSpecialCharacters);
    }





}
