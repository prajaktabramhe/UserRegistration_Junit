package com.bridgelabz.userregistration;

public class UserValidationProcess {
    public boolean validateFirstName(String name){
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


}
