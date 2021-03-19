package com.bridgelabz.userregistrationtest;

import com.bridgelabz.userregistration.UserValidationProcess;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest 
{
    UserValidationProcess userValidationProcess = new UserValidationProcess();

    //for firstName Validation
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

    //For lastName Validation
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


    //For Email Validation
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

    //for Mobile Number Validation

    @Test
    public void givenPhoneNumber_WhenPhoneNumberIsFollowedByCountryCode_True()
    {
        boolean result = userValidationProcess.validateMobileNumber("91 8149240833");
        Assertions.assertTrue( result);
    }
    @Test
    public void givenPhoneNumber_WhenPhoneNumberIsNOtFollowedByCountryCode_False()
    {
        boolean result = userValidationProcess.validateMobileNumber("8149240833");
        Assertions.assertFalse( result);
    }
    @Test
    public void givenPhoneNumber_WhenPhoneNumberIsNOTTenDigit_False()
    {
        boolean result = userValidationProcess.validateMobileNumber("91 14924");
        Assertions.assertFalse( result);
    }
    @Test
    public void givenPhoneNumber_WhenPhoneNumberNOTFollowedSpaceBetweenCountryCode_False()
    {
        boolean result = userValidationProcess.validateMobileNumber("918149240833");
        Assertions.assertFalse(result);
    }

    //for Password Validation with minimum 8 character
    @Test
    public void givenPassword_WhenPasswordHaveMinimum8Characters_ShouldReturn_true() {
        boolean result = userValidationProcess.validatePassword("Prajakta14");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenPassword_WhenPasswordHaveLessThan8Characters_ShouldReturn_false() {
        boolean result = userValidationProcess.validatePassword("gfbn");
        Assertions.assertFalse(result);
    }
    //for Password Validation with At least one uppercase
    @Test
    public void givenPassword_WhenPasswordHaveAtleast1UpperCase_ShouldReturn_true() {
        boolean result = userValidationProcess.passwordAtLeastOneUpperCase("Prajakta141996");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenPassword_WhenPasswordDoNotHaveAtleast1UpperCase_ShouldReturn_false() {
        boolean result = userValidationProcess.passwordAtLeastOneUpperCase("prajakta141996");
        Assertions.assertFalse(result);
    }
}
