package com.boilerPlate.app.Controller;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.boilerPlate.app.Vo.HelloWorld;

import reactor.core.publisher.Mono;

@Component
public class HelloWorldHandler {
    public Mono<ServerResponse> helloWorld(ServerRequest request) {
        Mono<HelloWorld> helloworldMono = Mono.just(new HelloWorld(1, "hello", "hi"));
        return ServerResponse.ok().body(helloworldMono, HelloWorld.class);
    }
}

