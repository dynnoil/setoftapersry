package com.dynnoil.ui.mixins;

import org.apache.tapestry5.Asset;
import org.apache.tapestry5.BindingConstants;
import org.apache.tapestry5.ClientElement;
import org.apache.tapestry5.annotations.*;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.javascript.JavaScriptSupport;

/**
 * Created by krukov on 15.10.2015.
 */


@Import(library = "ckeditor/ckeditor.js")
public class CkEditor {

    @Parameter(value = "moono", defaultPrefix = BindingConstants.LITERAL)
    private String skin;

    @InjectContainer
    private ClientElement container;

    @Inject
    private JavaScriptSupport javaScriptSupport;

    void afterRender(){
        javaScriptSupport.addScript("CKEDITOR.replace( '%s', { skin: '%s' } );",
                container.getClientId(), skin);
    }


}
