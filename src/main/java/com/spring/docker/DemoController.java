package com.spring.docker;


import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/docker")
@AllArgsConstructor
public class DemoController {

    final DemoRepository demoRepository;

    @PostMapping
    public ResponseEntity<DemoEntity> add(@RequestBody DemoEntity demoEntity) {
        var result = demoRepository.save(demoEntity);
        return ResponseEntity.ok(result);
    }

    @GetMapping
    public ResponseEntity<List<DemoEntity>> get() {
        return ResponseEntity.ok(demoRepository.findAll());
    }
}
