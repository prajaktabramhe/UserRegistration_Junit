package com.bridgelabz.userregistrationtest;

import com.bridgelabz.userregistration.UserValidationProcess;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest 
{
    UserValidationProcess userValidationProcess = new UserValidationProcess();

    //for firstName
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
       Assertions.assertFalse(result);
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
       Assertions.assertFalse(result);
    }

    //For lastName
    @Test
    public void givenLastName_WhenLastNameStartsWithCapitalLetter_ShouldReturn_True()
    {
        boolean result = userValidationProcess.validateLastName("Bramhe");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenLastName_WhenLastNameInLowerCase_ShouldReturn_false()
    {
        boolean result = userValidationProcess.validateLastName("bramhe");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenLastName_WhenLastNameStartHaveMinThreeLetters_ShouldReturn_True()
    {
        boolean result = userValidationProcess.validateLastName("Pra");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenLastName_WhenLastNameStartWithLessThanThreeLetters_ShouldReturn_False()
    {
        boolean result = userValidationProcess.validateLastName("Br");
        Assertions.assertFalse(result);
    }

    //For Email

    @Test
    public void givenEmail_WhenEmailContainMinimumTwoLetterAfterDot_ShouldReturn_True()
    {
        boolean result = userValidationProcess.validateEmail("abc@gmail.co");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenEmail_WhenEmailContainOnlyOneLetterAfterDot_ShouldReturn_False()
    {
        boolean result = userValidationProcess.validateEmail("abc@gmail.c");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenEmail_WhenEmailStartsWithCapitalLetter_ShouldReturn_True()
    {
        boolean result = userValidationProcess.validateEmail("Prajakta@gmail.com");
        Assertions.assertTrue(result);
    }

}
