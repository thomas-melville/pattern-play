package com.melville.tom.command.steps;

import com.melville.tom.command.Session;
import com.melville.tom.command.Step;
import com.melville.tom.command.tools.Tool;

public class ExecuteRequest implements Step {
    private String url;

    public ExecuteRequest(String url){
        this.url = url;
    }

    @Override
    public Session execute(final Session session) {
        Tool tool = session.getAttribute("tool");
        tool.execute(url);
        return session;
    }
}
