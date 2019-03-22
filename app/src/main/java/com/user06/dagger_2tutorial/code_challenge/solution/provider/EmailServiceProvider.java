package com.user06.dagger_2tutorial.code_challenge.solution.provider;

import com.user06.dagger_2tutorial.code_challenge.solution.service.EmailService;
import com.user06.dagger_2tutorial.code_challenge.solution.validator.MessageValidator;
import com.user06.dagger_2tutorial.code_challenge.solution.validator.Validator;

public class EmailServiceProvider implements ServiceProvider {

    @Override
    public Validator getValidator() {
        return new MessageValidator(new EmailService());
    }
}
