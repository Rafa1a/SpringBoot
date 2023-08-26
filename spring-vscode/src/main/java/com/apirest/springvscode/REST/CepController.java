package com.apirest.springvscode.REST;

//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@RestController
public class CepController {

    @PostMapping("/buscar")
    public String buscarEndereco(@RequestBody classALL cepRequest) {
        String cep = cepRequest.getCep();
        String viaCepUrl = "https://viacep.com.br/ws/"+cep+"/json/";

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(viaCepUrl))
                .GET()
                .build();

        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            String responseBody = response.body();
            return responseBody;
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return "Erro ao buscar endereço";
        }
    }
}



