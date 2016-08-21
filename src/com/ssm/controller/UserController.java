package com.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.domain.User;
import com.ssm.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * <p>功能: domain传参</p
     * <p>备注: url上直接写domain参数名称, 例: /xx/xxx.do?userId=1</p>
     * <p>例子: </p>
     * <p>日志: Executer: DengXiuJun  DateTime: 2016年8月17日 下午4:12:13  Action: Create</p>
     *
     * @param usr
     * @return
     * @author DengXiuJun
     */
    @RequestMapping("/findUserByDomain")
    public ModelAndView findUserByDomain(User usr) {
        User u = userService.getUserById(usr.getUserId());
        List<User> userList = new ArrayList<User>();
        userList.add(u);

        ModelAndView model = new ModelAndView();
        model.addObject("userList", userList);
        model.setViewName("user");
        return model;
    }

    /**
     * <p>功能: RequestParam注解使用</p
     * <p>备注: url参数与方法内的参数一致可以不用写注解</p>
     * <p>例子: </p>
     * <p>日志: Executer: DengXiuJun  DateTime: 2016年8月17日 下午3:50:42  Action: Create</p>
     *
     * @param id
     * @return
     * @author DengXiuJun
     */
    @RequestMapping("/findUserById")
    public ModelAndView findUserById(@RequestParam(value="id", defaultValue = "") String id) {
        User u = userService.getUserById(id);
        List<User> userList = new ArrayList<User>();
        userList.add(u);

        ModelAndView model = new ModelAndView();
        model.addObject("userList", userList);
        model.setViewName("user");
        return model;
    }

    /**
     * <p>功能: PathVariable注解使用, 在url中传参</p
     * <p>备注: 例如: /findUser/123456789, 此时方法参数id的值就为123456789</p>
     * <p>例子: </p>
     * <p>日志: Executer: DengXiuJun  DateTime: 2016年8月17日 下午3:16:47  Action: Create</p>
     *
     * @param id
     * @return
     * @author DengXiuJun
     */
    @RequestMapping("/findUser/{id}")
    public ModelAndView findUser(@PathVariable("id") String id) {
        User u = userService.getUserById(id);
        List<User> userList = new ArrayList<User>();
        userList.add(u);

        ModelAndView model = new ModelAndView();
        model.addObject("userList", userList);
        model.setViewName("user");
        return model;
    }

    /**
     * <p>功能: RequestMapping注解使用</p
     * <p>备注: </p>
     * <p>例子: </p>
     * <p>日志: Executer: DengXiuJun  DateTime: 2016年8月17日 下午3:50:01  Action: Create</p>
     *
     * @return
     * @author DengXiuJun
     */
    @RequestMapping("/getUserList")
    public ModelAndView getUserList() {
        List<User> userList = userService.getUserList();

        ModelAndView model = new ModelAndView();
        model.addObject("userList", userList);
        model.setViewName("user");
        return model;
    }

}
