package com.bridgelabz.userregistrationtest;

import com.bridgelabz.userregistration.UserValidationProcess;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest 
{
    UserValidationProcess userValidationProcess = new UserValidationProcess();

    @Test
    public void givenFirstName_WhenFirstNameStartsWithCapitalLetter_ShouldReturn_True()
    {
       boolean result = userValidationProcess.validateFirstName("Prajakta");
       Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenFirstNameInLowerCase_ShouldReturn_false()
    {
       boolean result = userValidationProcess.validateFirstName("prajakta");
       Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenFirstNameStartHaveMinThreeLetters_ShouldReturn_True()
    {
      boolean result = userValidationProcess.validateFirstName("Pra");
      Assertions.assertTrue(result);
    }
    @Test
     public void givenFirstName_WhenFirstNameStartWithLessThanThreeLetters_ShouldReturn_False()
    {
       boolean result = userValidationProcess.validateFirstName("Pr");
       Assertions.assertTrue(result);
    }

}
