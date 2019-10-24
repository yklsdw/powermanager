package com.neusoft.Controller;

import com.neusoft.bean.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class BaseController {
    @Autowired
    HttpSession session;
    @Autowired
    HttpServletRequest request;

    public Manager getLoginManager(){
        Manager manager =(Manager)session.getAttribute(Manager.CURRENT_MANAGER);
        return manager;
    }

}
