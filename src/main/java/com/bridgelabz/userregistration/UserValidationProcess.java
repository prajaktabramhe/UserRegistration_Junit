package com.bridgelabz.userregistration;

public class UserValidationProcess {
    public boolean validateFirstName(String name)
    {
        String pattern = "^([A-Z]{1})([a-z]{2,})$";

        if( name.matches(pattern))
        {
           return true;
        }
        else
        {
            return false;
        }
    }


    public boolean validateLastName(String name)
    {
        String pattern = "^([A-Z]{1})([a-z]{2,})$";
        if( name.matches(pattern))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean validateEmail(String name)
    {
        String pattern =  "^[a-zA-Z0-9]+([.+-_][a-zA-Z0-9]+)*@[a-zA-z0-9]+.[a-zA-Z]{2}([.][a-zA-Z]{2,4}){0,1}$";
        if( name.matches(pattern))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
