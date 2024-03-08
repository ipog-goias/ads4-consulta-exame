package br.edu.ipog.consulta.service;

import br.edu.ipog.consulta.interfaces.IService;
import br.edu.ipog.consulta.model.Aluno;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j //anotação responsável para habilitar a parte de logging do projeto.
@Service //layer service ou camada de negócio.
public class AlunoService implements IService<Aluno, Integer>{

    @Override
    @Transactional
    public Aluno create(Aluno entity) {
        log.info("Acessando método create na classe {}", AlunoService.class.getSimpleName());
        log.debug("Persistindo dados do aluno: {}", entity);
        return null;
    }

    @Override
    public Aluno readById(Integer id) {
        log.info("Acessando método readById na classe {}", AlunoService.class.getSimpleName());
        log.debug("Valor recebido foi {}", id);
        return null;
    }

    @Override
    public List<Aluno> read() {
        log.info("Acessando método read na classe {}", AlunoService.class.getSimpleName());
        log.debug("Os valores obtidos na consulta foram....");
        return null;
    }

    @Override
    @Transactional
    public Aluno update(Integer id, Aluno entity) {
        log.info("Acessando método update na classe {}", AlunoService.class.getSimpleName());
        log.debug("Os valores obtidos foram: id: {}, objeto: {}", id, entity);
        return null;
    }

    @Override
    @Transactional
    public Aluno deleteById(Integer id) {
        log.info("Acessando método deleteById na classe {}", AlunoService.class.getSimpleName());
        log.debug("Os valores obtidos foram: id: {}", id);
        //aqui executamos uma consulta para trazer o objeto.
        log.debug("O objeto encontrato foi...: ");
        return null;
    }

    @Override
    @Transactional
    public Aluno delete(Aluno entity) {
        log.info("Acessando método delete na classe {}", AlunoService.class.getSimpleName());
        log.debug("Os valores obtidos foram: objeto: {}", entity);
        //aqui executamos uma consulta para trazer o objeto.
        log.debug("O objeto encontrato foi...: ");
        return null;
    }
}
