package com.util.algorithms;


import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class StringUtilTest {

    @Test
    public void shouldConcatObjectStringByComma(){
      List<PersonDTO> ages = List.of(
              new PersonDTO("Maria", 63), new PersonDTO("Andre", 43) ,
              new PersonDTO("Anderson", 40), new PersonDTO("Ana Paula", 36) ,
              new PersonDTO("Ingrid", 33), new PersonDTO("Ana Flavia", 12),
              new PersonDTO("Lucas", 3));

      String result =  StringUtil.getFiedValuesSeparatedBy(ages, "age", ",", PersonDTO.class );

      Assert.assertNotNull(result);
    }


    @Test
    public void shouldConcatStringByComma(){
        List<Integer> ages = List.of(63 , 43, 40, 36, 33, 12, 3);

        String result =  StringUtil.getCommaSeparatedString(ages);

        Assert.assertNotNull(result);
    }
}