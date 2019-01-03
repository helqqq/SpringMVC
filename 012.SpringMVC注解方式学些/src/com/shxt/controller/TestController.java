package com.shxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>
 * 描述:
 * </p>
 *
 * @author Helena
 * @since 1.0
 * @date 2018年12月6日 下午8:10:24
 * @see com.shxt.controller.TestController
 */
@Controller // <bean id = "" class="类名全路径"></bean>
// @RequestMapping("/shxt") 代表本文件内的所有的路径前面都要添加/shxts
public class TestController {
    @RequestMapping(path = "/path02")
    public ModelAndView testRequestMapping02() {

        return null;
    }

    @RequestMapping(path = { "/aaa" , "/bbb" }) // 此处注意模棱两可的错误，所有文件的路径名不能重复
    public ModelAndView testRequestMapping03() {
        return null;
    }

    @RequestMapping("/shxt")
    public ModelAndView testReuqestMapping01() {
        return null;
    }
}
