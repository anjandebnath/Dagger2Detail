package com.user06.dagger_2tutorial.code_challenge.solution.validator;

import com.user06.dagger_2tutorial.code_challenge.solution.service.MessageService;

public class MessageValidator implements Validator {

    private MessageService service;

    // constructor injection
    public MessageValidator(MessageService svc){
        this.service=svc;
    }


    @Override
    public void validateMessages(String msg, String rec) {

        //do some validation, manipulation logic etc
        this.service.sendMessage(msg, rec);

    }
}
