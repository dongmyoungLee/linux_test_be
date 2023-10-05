package com.example.demo.domain.service;

import com.example.demo.domain.entity.Demo;
import com.example.demo.domain.repository.DemoRepository;
import com.example.demo.domain.request.DemoRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DemoService {
    private final DemoRepository demoRepository;

    public List<Demo> findAll() {
        return demoRepository.findAll();
    }

    public void save(Demo demo) {
        demoRepository.save(demo);
    }
}
