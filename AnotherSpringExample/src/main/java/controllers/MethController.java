package controllers;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import services.MethServicable;

@Controller
@RequestMapping("/meth")
public class MethController {


    private final MethServicable service;



    public MethController(@Autowired MethServicable service){
        this.service = service;
    }
    @GetMapping(value = "/pow")
    public ModelAndView pow(@RequestParam("i0") int number0,
                              @RequestParam("i1") int number1){

        ModelAndView mav = new ModelAndView("result");
        mav.addObject("result",service.power(number0,number1));
        return mav;

    }

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public ModelAndView add(@RequestParam("i0") int number0,
                            @RequestParam("i1") int number1){

        ModelAndView mav = new ModelAndView("result");
        mav.addObject("result",service.add(number0,number1));

        return mav;

    }


}
