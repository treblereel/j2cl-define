package org.treblereel;

import com.google.gwt.core.client.EntryPoint;
import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLButtonElement;

public class App implements EntryPoint {

    @Override
    public void onModuleLoad() {
        HTMLButtonElement btn = (HTMLButtonElement) DomGlobal.document.createElement("button");
        btn.textContent = org.treblereel.Element.UserAgentHolder.user_agent;
        DomGlobal.document.body.appendChild(btn);


        DomGlobal.console.log("? " + org.treblereel.Element.UserAgentHolder.user_agent);
    }
}
