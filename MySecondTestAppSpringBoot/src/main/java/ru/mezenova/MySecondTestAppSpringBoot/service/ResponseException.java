package ru.mezenova.MySecondTestAppSpringBoot.service;

import ru.mezenova.MySecondTestAppSpringBoot.model.Request;
import ru.mezenova.MySecondTestAppSpringBoot.model.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;


@Service
public interface ResponseException {
    ResponseEntity<Response> ResponseExceptions(Request request, BindingResult bindingResult);
}
