package com.example.wospringmvc.controller;


import com.example.wospringmvc.model.Freeboard;
import com.example.wospringmvc.service.freeboard.FreeboardListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class FreeboardController {

    @Autowired
    private HttpSession session;



    @Autowired
    private FreeboardListService freeboardListService;

    @GetMapping("/freeboard")
    public String freeboard(@RequestParam(value ="pageNum",defaultValue = "1")String pageNum) {
        List<Freeboard> freeboardList = freeboardListService.freeboardList(pageNum);
        if (freeboardList == null) {
            return "feeboard";
        }
        session.setAttribute("boardList", freeboardList);
        return "freeboard";
    }
}
