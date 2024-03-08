package br.edu.ipog.consulta.resource;

import br.edu.ipog.consulta.interfaces.IResource;
import br.edu.ipog.consulta.model.Aluno;
import br.edu.ipog.consulta.service.AlunoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * HTTP:
 * Verbos: POST,GET,PUT,PATCH,DELETE,OPTION,HEAD
 */
@Slf4j //indica que podemos fazer 'logging' das operações ou qualquer ação da classe
@RestController //Fala que o controlador vai trabalhar com REST
@RequestMapping("api/v1/aluno") //endereço de acesso: http://localhost:8080/api/v1/aluno
public class AlunoResource implements IResource<Aluno, Integer> {

    @Autowired //Injeção de dependência
    public AlunoService alunoService;

    @Override
    //PostMapping indica que a operação é POST
    //consumes indica que este método irá consumir (receber) um arquivo JSON
    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    //RequestBody indica que você irá receber um 'corpo de requisição = json'
    //O json recebido será 'convertido' em um objeto aluno
    public Aluno post(@RequestBody Aluno entity) {
        log.info("Camada de resource recebendo dados do aluno.");
        log.debug("Valores recebidos do JSON: {}", entity);

        return alunoService.create(entity);
    }

    @Override
    public List<Aluno> get() {
        return null;
    }

    @Override
    public Aluno getById(Integer id) {
        return null;
    }

    /**
     * PUT,PATCH
     *
     * @param id
     * @param entity
     */
    @Override
    public Aluno update(Integer id, Aluno entity) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
