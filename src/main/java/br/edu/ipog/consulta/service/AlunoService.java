package br.edu.ipog.consulta.service;

import br.edu.ipog.consulta.interfaces.IService;
import br.edu.ipog.consulta.model.Aluno;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService implements IService<Aluno, Integer>{

    @Override
    public Aluno create(Aluno entity) {
        return null;
    }

    @Override
    public Aluno readById(Integer id) {
        return null;
    }

    @Override
    public List<Aluno> read() {
        return null;
    }

    @Override
    public Aluno update(Integer id, Aluno entity) {
        return null;
    }

    @Override
    public Aluno deleteById(Integer id) {
        return null;
    }

    @Override
    public Aluno delete(Aluno entity) {
        return null;
    }
}
