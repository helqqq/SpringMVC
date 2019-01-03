/**
 * IndexController.java
 *
 * @author：Helena
 *                2018-11-13
 *                com.shxt.controller.IndexController
 *                Copyright (c) 2007, 2016 Infopower corporation All Rights Reserved.
 */
package com.shxt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * <p>
 * 描述:
 * </p>
 *
 * @author Helena
 * @since 1.0
 * @date 2018年11月13日 下午7:42:05
 * @see com.shxt.controller.IndexController
 */

public class IndexController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mav = new ModelAndView();
        // mav.setViewName("index");
        mav.setViewName(InternalResourceViewResolver.REDIRECT_URL_PREFIX + "cs.jsp");
        return mav;
    }
}
