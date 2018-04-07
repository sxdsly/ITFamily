package cn.sxd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController 只支持Restful返回
 * @Controller 必须配合@ResponseBody一起使用，不然会跳转到return引用的页面
 * 
 * @author Administrator
 *
 */
@RestController
public class HelloController {
    @RequestMapping("/hello/object")
    public String helloObject(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("*** 客户IP地址 ***" + request.getRemoteAddr());
        System.out.println("*** 客户响应编码 ***" + response.getCharacterEncoding());
        System.out.println("*** 客户Session ID***" + request.getSession().getId());
        System.out.println("*** 真实路径***" + request.getServletContext().getRealPath("/upload/"));
    	return "Hello, World!";
    }
	
    @RequestMapping("/hello/world")
    public String helloWorld() {
        return "Hello, World!";
    }
   
    @RequestMapping(value="/hello/{message}", method=RequestMethod.GET)
    public String helloMsg(@PathVariable("message") String msg) {
    	return "Hello, " + msg + "!!!";
    }

}
