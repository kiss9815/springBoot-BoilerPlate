package com.boilerPlate.app.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boilerPlate.app.Vo.HelloWorld;

import reactor.core.publisher.Mono;

@RestController
public class ReactiveController {
	@GetMapping("/hello")
    public Mono<HelloWorld> hello() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setTitle("hello");
        helloWorld.setMessage("hi");
        return Mono.just(helloWorld);
    }
}

