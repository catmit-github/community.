package com.example.demo.controller;

import com.example.demo.common.api.ApiResult;
import com.example.demo.model.entity.Tip;
import com.example.demo.service.ITipService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/tip")
public class TipController extends BaseController {
    @Resource
    private ITipService TipService;

    @GetMapping("/today")
    public ApiResult<Tip> getRandomTip() {
        Tip tip = TipService.getRandomTip();
        return ApiResult.success(tip);
    }
}
