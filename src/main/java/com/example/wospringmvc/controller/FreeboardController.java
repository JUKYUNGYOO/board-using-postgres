package com.example.wospringmvc.controller;


import com.example.wospringmvc.model.Freeboard;
import com.example.wospringmvc.service.freeboard.FreeboardInfoService;
import com.example.wospringmvc.service.freeboard.FreeboardListService;
import com.example.wospringmvc.service.freeboard.FreeboardWriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class FreeboardController {

/*

board 보여주는 기능
 */
    @Autowired private FreeboardListService freeboardListService;
    @Autowired private FreeboardWriteService freeboardWriteService;
    @Autowired private HttpSession session;
    @Autowired private FreeboardInfoService freeboardInfoService;

    private int returnIntValue(String stringToInt){
        return Integer.parseInt(stringToInt);

    }

    //자유게시판 목록을 가지고 오는 함수

    @GetMapping("/freeboard")
    public String freeboard(@RequestParam(value ="pageNum",defaultValue = "1")String pageNum) {
      String page = freeboardListService.freeboardList(returnIntValue(pageNum));
        return page;
    }

        //방금 썻던 글을 포함해서 전체 글이 보임.
    @PostMapping("/freeboardWriteRequest")  //요청 본문에 paramMap key값이 있어야됨.
    public String freeboardWriteRequest(@RequestParam Map<String,String> paramMap){ //paramMap 에 해당하는 값이


        String title = paramMap.get("title");
        String content = paramMap.get("content");
        String writer = paramMap.get("writer");

        freeboardWriteService.write(title,content,writer);

        return "redirect:/freeboard?pageNum=1";
        //자유게시판 목록을 가지고 오는 함수 다시한번 호출
       // return "freeboard";
    }

    @GetMapping("/freeBoardInfo")
    public String getPost(@RequestParam(value="freeId")String freeId){

    String page = freeboardInfoService.getFreeboardPost(freeId);

     return page;
    }








}
