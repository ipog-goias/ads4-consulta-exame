package br.edu.ipog.consulta.resource;

import br.edu.ipog.consulta.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Fala que o controlador vai trabalhar com REST
@RequestMapping("api/v1/aluno")
public class AlunoResource {

    @Autowired //Injeção de dependência
    public AlunoService alunoService;

}
