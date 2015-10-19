package com.dynnoil.ui.services;

import com.dynnoil.taggs.OldCustomer;
import org.apache.tapestry5.Validator;
import org.apache.tapestry5.ioc.*;
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
        configuration.add("hasdigit", new
                HasDigits());
    }

    @Contribute(ComponentMessagesSource.class)
    public static void provideMessages(
            @Value("/com/tapestry5book/Messages.properties")
            Resource resource,
            OrderedConfiguration<Resource> configuration) {
        configuration.add("Messages", resource);
    }

    public static void bind(ServiceBinder binder) {
        binder.bind(CustomerInfo.class).eagerLoad()
        .withId("CustomerInfoId");
        binder.bind(CustomerInfo.class, OldCustomerInfo.class)
                .withId("OldsCustomerId")
                .withMarker(OldCustomer.class);
    }


    @Contribute(CustomerInfo.class)
    public static void addNumbers(Configuration<String> configuration) {
        configuration.add("+79211401232");
    }
}