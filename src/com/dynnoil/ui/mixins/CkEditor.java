package com.dynnoil.ui.mixins;

import org.apache.tapestry5.Asset;
import org.apache.tapestry5.ClientElement;
import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.InjectContainer;
import org.apache.tapestry5.annotations.MixinAfter;
import org.apache.tapestry5.annotations.Path;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.javascript.JavaScriptSupport;

/**
 * Created by krukov on 15.10.2015.
 */


@MixinAfter
public class CkEditor {


    private Asset ckedit;

    @InjectContainer
    private ClientElement container;

    @Inject
    private JavaScriptSupport javaScriptSupport;

    void setupRender()
    {
        //javaScriptSupport.importJavaScriptLibrary(ckedit);
    }

    void afterRender(){
       // javaScriptSupport.importJavaScriptLibrary(ckedit);
        //javaScriptSupport.addScript("ckeditor/CKEDITOR.replace( '%s' );",
          //      container.getClientId());
        //javaScriptSupport.addScript(ckedit.toString().replace(), container.getClientId());
    }


}
