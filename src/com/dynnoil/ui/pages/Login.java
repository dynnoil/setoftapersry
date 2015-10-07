package com.dynnoil.ui.pages;

import com.dynnoil.store.order.User;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SessionState;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.ioc.Messages;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.shiro.authc.Authenticator;

/**
 * Created by krukov on 07.10.2015.
 */
public class Login {
    @Property
    private User user;

    @InjectComponent
    private Form loginForm;


    private Authenticator authenticator;

    @Inject
    private Messages messages;

    @SessionState(create=false)
    private User loggedIn;

    void onPrepare() {
        user = new User();
    }

    void onValidateFromLoginForm() {
        if (loginForm.isValid()) {
            UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(user.getName(), user.getPassword());
            User authenticated = (User) authenticator.authenticate(usernamePasswordToken);
            if (authenticated == null) {
                loginForm.recordError(messages.get("invalid-username-or-password"));
            } else {
                loggedIn = authenticated;
            }
        }
    }

    Object onSuccess() {
        return Index.class;
    }

}