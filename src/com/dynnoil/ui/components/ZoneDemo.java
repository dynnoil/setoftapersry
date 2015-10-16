package com.dynnoil.ui.components;

import org.apache.tapestry5.Asset;
import org.apache.tapestry5.Block;
import org.apache.tapestry5.MarkupWriter;
import org.apache.tapestry5.annotations.*;
import org.apache.tapestry5.corelib.components.Zone;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.json.JSONObject;
import org.apache.tapestry5.runtime.RenderCommand;
import org.apache.tapestry5.runtime.RenderQueue;
import org.apache.tapestry5.services.Request;
import org.apache.tapestry5.services.ajax.AjaxResponseRenderer;
import org.apache.tapestry5.services.ajax.JavaScriptCallback;
import org.apache.tapestry5.services.javascript.JavaScriptSupport;

import java.util.Date;

/**
 * Created by krukov on 16.10.2015.
 */
@Import(library = "effect.js")
public class ZoneDemo {

    @Persist
    @Property
    private int number;

    //@Inject
    //private Block numberBlock;

    @Inject
    private AjaxResponseRenderer ajaxResponseRenderer;

    @Parameter(required = true, value = "0")
    private int value;

    @Inject
    @Path("initializers.js")
    private Asset initializers;

    void setupRender() {
        this.number = value;
    }

    void onIncrement() {
        this.number++;

        RenderCommand command = new RenderCommand() {
            @Override
            public void render(MarkupWriter markupWriter, RenderQueue renderQueue) {
                markupWriter.element("p");
                markupWriter.writef("Current value %s", number);
                markupWriter.end();
            }
        };

        ajaxResponseRenderer.addRender("numberZone", command);

        ajaxResponseRenderer.addCallback(new JavaScriptCallback() {
            @Override
            public void run(JavaScriptSupport javaScriptSupport) {
                javaScriptSupport.importJavaScriptLibrary(initializers);
                JSONObject parameters = new JSONObject(
                        "id", "status",
                        "newContent", "Updated on " + new Date());
                javaScriptSupport.addInitializerCall("replaceContent", parameters);
            }
        });
    }
}