package com.dynnoil.ui.pages;

import com.dynnoil.store.order.User;
import com.dynnoil.ui.mixins.CkEditor;
import org.apache.tapestry5.annotations.*;
import org.apache.tapestry5.beaneditor.BeanModel;
import org.apache.tapestry5.beaneditor.PropertyModel;
import org.apache.tapestry5.corelib.components.BeanEditForm;
import org.apache.tapestry5.corelib.components.TextArea;
import org.apache.tapestry5.ioc.Messages;
import org.apache.tapestry5.services.BeanModelSource;

import javax.inject.Inject;
import java.net.Authenticator;

/**
 * Created by krukov on 12.10.2015.
 */

public class Login {

    @Property
    private String content;

    @Component(parameters = "value =content")
    @MixinClasses(CkEditor.class)
    private TextArea textArea;

}