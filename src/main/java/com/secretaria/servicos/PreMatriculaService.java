package com.secretaria.servicos;

import com.secretaria.dominios.Candidato;
import com.secretaria.dominios.PreMatricula;
import com.secretaria.repositorios.CandidatoRepository;
import com.secretaria.repositorios.PreMatriculaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreMatriculaService {

    private PreMatriculaRepository preMatriculaRepository;
    private CandidatoRepository candidatoRepository;

    public PreMatriculaService(CandidatoRepository candidatoRepository, PreMatriculaRepository preMatriculaRepository) {
        this.preMatriculaRepository = preMatriculaRepository;
    }

    public List<PreMatricula> listarPreMatriculas(){
        return preMatriculaRepository.listar();
    }

    public void alterarPreMatricula(Long id) {
        preMatriculaRepository.alterarStatusCandidato(id);
    }
}
