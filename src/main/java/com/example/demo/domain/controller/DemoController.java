package com.example.demo.domain.controller;

import com.example.demo.domain.entity.Demo;
import com.example.demo.domain.request.DemoRequest;
import com.example.demo.domain.service.DemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/demo")
@CrossOrigin("*")
public class DemoController {

    private final DemoService demoService;

    @GetMapping
    public List<Demo> findAll() {
        return demoService.findAll();
    }

    @PostMapping
    public void save(@RequestBody DemoRequest demoRequest) {
        demoService.save(demoRequest.toEntity());
    }
}
