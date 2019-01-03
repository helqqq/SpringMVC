/**
 * TestRequestMapping.java
 *
 * @author：Helena
 *                2018-12-06
 *                com.shxt.controller.TestRequestMapping
 *                Copyright (c) 2007, 2016 Infopower corporation All Rights Reserved.
 */
package com.shxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>
 * 描述:
 * </p>
 *
 * @author Helena
 * @since 1.0
 * @date 2018年12月6日 下午8:53:30
 * @see com.shxt.controller.TestRequestMapping
 */
@Controller
public class TestRequestMapping {
    // 相同的路径，防止模棱两可的错误Ambiguous
    @RequestMapping(path = "/mss", method = RequestMethod.GET)
    public ModelAndView test01() {
        System.out.println("get------>");
        return null;
    }

    @RequestMapping(path = "/mss", method = RequestMethod.POST)
    public ModelAndView test02() {
        System.out.println("-------->post");
        return null;
    }

    @RequestMapping(path = "/mss", method = RequestMethod.DELETE)
    public ModelAndView test03() {
        System.out.println("---------->delete");
        return null;
    }

    @RequestMapping(path = "/mss", method = RequestMethod.PUT)
    public ModelAndView test04() {
        System.out.println("--------->PUT");
        return null;
    }
}
