package com.dynnoil.ui.services;

import org.apache.tapestry5.Validator;
import org.apache.tapestry5.ioc.MappedConfiguration;
import org.apache.tapestry5.ioc.OrderedConfiguration;
import org.apache.tapestry5.ioc.Resource;
import org.apache.tapestry5.ioc.annotations.Contribute;
import org.apache.tapestry5.ioc.annotations.Value;
import org.apache.tapestry5.services.FieldValidatorSource;
import org.apache.tapestry5.services.messages.ComponentMessagesSource;
import org.apache.tapestry5.validator.ValidatorMacro;

/**
 * Created by krukov on 10.10.2015.
 */
public class AppModule {

    @Contribute(ValidatorMacro.class)
    public static void combineValidators(
            MappedConfiguration<String,String> configuration) {

        configuration.add("requiredMinMax","required,minlength=3,maxlength=50");
    }

    @Contribute(FieldValidatorSource.class)
    public static void addValidators(
            MappedConfiguration<String, Validator> configuration) {
        configuration.add("hasdigits", new
                HasDigits());
    }

    @Contribute(ComponentMessagesSource.class)
    public static void provideMessages(
            @Value("/com/tapestry5book/Messages.properties")
            Resource resource,
            OrderedConfiguration<Resource> configuration) {
        configuration.add("Messages", resource);
    }
}