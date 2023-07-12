package com.dadospessoais.dadosPessoais.Services;

import com.dadospessoais.dadosPessoais.Domain.DadosPessoais;
import com.dadospessoais.dadosPessoais.Repository.DadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DadosServices {

  @Autowired
  DadosRepository rep;

  public List<DadosPessoais> findAll() {
    return rep.findAll();
  }

  public DadosPessoais create(DadosPessoais dadosPessoais) {
    return rep.save(dadosPessoais);
  }

  public DadosPessoais findByNome(String nome) {
    return rep.findByNome(nome);
  }

  public DadosPessoais findByCPF(Long CPF) {
    return rep.findByCPF(CPF);
  }

  public DadosPessoais update(DadosPessoais dadosPessoais){
    return DadosPessoais.create(rep.save(update(dadosPessoais)));
  }

  public void deleteById(Long id) {
    rep.deleteById(id);
  }
}
