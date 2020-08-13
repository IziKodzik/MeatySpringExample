package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class SubtractionController {

    @RequestMapping("/subtract")
    public ModelAndView subtract(@RequestParam("input0") int subtracted0,
                                 @RequestParam("input1") int subtracted1,
                                 HttpServletRequest request, HttpServletResponse response){
//
//        int subtracted0 = Integer.parseInt(request.getParameter("input0"));
//        int subtracted1 = Integer.parseInt(request.getParameter("input1"));
        int result = subtracted0-subtracted1;

        ModelAndView mav = new ModelAndView();
        mav.setViewName("display");
        mav.addObject("result",result);

        return mav;
    }

}
