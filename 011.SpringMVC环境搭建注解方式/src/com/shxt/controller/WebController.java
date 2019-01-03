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
 * @date 2018年11月13日 下午9:06:51
 * @see com.shxt.controller.WebController
 */
@Controller // 相当于实例化
@RequestMapping(path = "/sys") // 所有的方法前都要添加路径/sys
public class WebController {
    @RequestMapping(path = "/index")
    public ModelAndView test01() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }
}
