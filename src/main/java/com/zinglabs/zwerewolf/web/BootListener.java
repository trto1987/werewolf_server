package com.zinglabs.zwerewolf.web;

import com.zinglabs.zwerewolf.Boot;
import com.zinglabs.zwerewolf.app.App;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class BootListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        new Boot().boot();
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        App.instance().destroy();
    }
}
