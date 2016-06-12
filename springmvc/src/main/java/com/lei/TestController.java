package com.lei;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by raymon on 2016/6/8.
 */
@Controller
public class TestController {
    @RequestMapping(value="/test")
    @ResponseBody
    public Map<String,String> test(HttpServletRequest request){
        Map<String,String> map = new HashMap<String, String>();
        map.put("sfzh",request.getParameter("sfzh"));
        return map;
    }
    @RequestMapping(value="/def")
    public String index(){
        return  "def";
    }
}
