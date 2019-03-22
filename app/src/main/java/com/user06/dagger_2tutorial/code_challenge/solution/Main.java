package com.user06.dagger_2tutorial.code_challenge.solution;

import com.user06.dagger_2tutorial.code_challenge.solution.provider.EmailServiceProvider;
import com.user06.dagger_2tutorial.code_challenge.solution.provider.ServiceProvider;
import com.user06.dagger_2tutorial.code_challenge.solution.provider.SmsServiceProvider;
import com.user06.dagger_2tutorial.code_challenge.solution.validator.Validator;

public class Main {

    public static void main(String args[]){

        String msg = "Hi Coders, How are you?";
        String email = "coders@gmail.com";
        String phone = "+19345678123";

        ServiceProvider provider = null;
        Validator validator = null;

        //Send email
        provider = new EmailServiceProvider();
        validator = provider.getValidator();
        validator.validateMessages(msg, email);

        //Send SMS
        provider = new SmsServiceProvider();
        validator = provider.getValidator();
        validator.validateMessages(msg, phone);
    }
}
