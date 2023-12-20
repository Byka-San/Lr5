package ru.mezenova.MySecondTestAppSpringBoot.controller;

import ru.mezenova.MySecondTestAppSpringBoot.model.Request;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.mezenova.MySecondTestAppSpringBoot.service.ResponseException;
import javax.validation.Valid;

@Slf4j
@RestController
public class Mycontroller {

    private final ResponseException responseException;

    @Autowired
    public Mycontroller( ResponseException responseException) {
        this.responseException = responseException;
    }

    @PostMapping(value = "/feedback")
    public void feedback(@Valid @RequestBody Request request, BindingResult bindingResult) {
        log.info("request:{}",request);
        responseException.ResponseExceptions(request,bindingResult);

    }
}
