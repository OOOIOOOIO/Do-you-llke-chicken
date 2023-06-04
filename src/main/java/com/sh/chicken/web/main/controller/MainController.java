package com.sh.chicken.web.main.controller;

import com.sh.chicken.web.main.controller.dto.MainResDto;
import com.sh.chicken.web.main.controller.dto.MainResListDto;
import com.sh.chicken.web.main.service.MainService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/chicken/main")
public class MainController {

    private final MainService mainService;

    /**
     * Main Page
     */
    @GetMapping("")
    public String mainPage(Model model){

        MainResListDto chickenMenuList = mainService.getChickenMenus();

        model.addAttribute("chickenMenuList", chickenMenuList.getMainResDtoList());

//        for (MainResDto mainResDto : chickenMenuList.getMainResDtoList()) {
//            log.info("==="+mainResDto.getMenuId());
//            log.info("==="+mainResDto.getBrandName());
//            log.info("==="+mainResDto.getMenuName());
//            log.info("==="+mainResDto.getContents());
//            log.info("==="+mainResDto.getImg());
//            log.info("==="+mainResDto.getPrice());
//        }

        return "main";
    }



}