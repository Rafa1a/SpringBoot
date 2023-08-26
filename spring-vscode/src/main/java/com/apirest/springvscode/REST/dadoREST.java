package com.apirest.springvscode.REST;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.apirest.springvscode.database.repoCLIENTE;
import com.apirest.springvscode.database.repoENDERECO;
//import com.apirest.springvscode.database.repoPRODUTO;
import com.apirest.springvscode.modal.CLIENTE;
import com.apirest.springvscode.modal.ENDERECO;
import com.apirest.springvscode.modal.PRODUTO;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/classall")
public class dadoREST {
    /*@Autowired
    private repoPRODUTO repoPRODUTO;
    @Autowired
    private repoCLIENTE repoCLIENTE;*/
    @Autowired
    private repoENDERECO repoENDERECO;
    
    @PostMapping
    public String salvar(@RequestBody classALL classAll){
        // Popula a tabela PRODUTO
        PRODUTO produto = new PRODUTO();
        produto.setNOME(classAll.getNome());
        produto.setQUANTIDADE(classAll.getQuantidade());
        produto.setPRECOVENDA(classAll.getPreco());

        // Popula a tabela CLIENTE
        CLIENTE cliente = new CLIENTE();
        cliente.setNOME(classAll.getNomecliente());
        cliente.setCOD_PRODUTO(classAll.getCod());
        cliente.setCEP(classAll.getCep());

        //CLIENTE endereco_c = repoCLIENTE.findByCep(classAll.getCEP_c());
        //ENDERECO endereco_e = repoENDERECO.findByCep(classAll.getCEP_c());
        
        
        // Faz a chamada ao ViaCEP
        String cep = classAll.getCep();
        String viaCepUrl = "https://viacep.com.br/ws/"+cep+"/json/";

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(viaCepUrl))
            .GET()
            .build();

        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            String responseBody = response.body();
            
            // Faça o parsing do responseBody, se necessário
            ObjectMapper objectMapper = new ObjectMapper();
            ViaCepResponse viaCepResponse = objectMapper.readValue(responseBody, ViaCepResponse.class);
            
            // Popula a tabela ENDERECO com as informações do ViaCEP
            ENDERECO novoEndereco = new ENDERECO();
            novoEndereco.setCEP(viaCepResponse.getCep());
            novoEndereco.setRUA(viaCepResponse.getLogradouro());
            
            //repoPRODUTO.save(produto);
            //repoCLIENTE.save(cliente);
            repoENDERECO.save(novoEndereco);

            return novoEndereco.getRUA();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return "tudo errado";

        }
        
    }
}





    /*@GetMapping
    public List<PRODUTO> listar() {
        return repositorio.findAll();
    }
    @PutMapping
    public void alterar(@RequestBody PRODUTO data){
        if(data.getCOD_PRODUTO()>0)
        repositorio.save(data);
    }
    @DeleteMapping
    public void excluir(@RequestBody PRODUTO data){
        repositorio.delete(data);
    }*/

