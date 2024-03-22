package br.com.teia.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.teia.model.Response;

@RestController
@RequestMapping("/api")
public class Controller {

    private final ApiService apiService;

    @Autowired
    public Controller(ApiService apiService) {
        this.apiService = apiService;
    }

    @PostMapping("/manipulacao-string")
    public ResponseEntity<Response> manipularString(@RequestBody Solicitacao solicitacao) {
        Response response = apiService.manipula(solicitacao);
        if (response != null) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}

