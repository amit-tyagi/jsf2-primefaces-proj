package com.jsf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

/**
 * User: Amit
 * Date: 6/22/13
 * Time: 3:53 PM
 */
@ManagedBean
@ViewScoped
public class HelloController {
    private static Logger log = LoggerFactory.getLogger(HelloController.class);

    private String name;

	public HelloController() {
        log.info("new instance created.");
    }

    @PostConstruct
    public void init() {
        log.info("init called.");
    }

    public void sayHelloAction() {
    }

    public String getName() {
        return name;
    }

	public void setName(String name) {
		this.name = name;
	}
}
