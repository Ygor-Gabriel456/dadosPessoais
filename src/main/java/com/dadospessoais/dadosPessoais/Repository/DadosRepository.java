package com.dadospessoais.dadosPessoais.Repository;

import com.dadospessoais.dadosPessoais.Domain.DadosPessoais;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DadosRepository extends JpaRepository<DadosPessoais, Long> {



  DadosPessoais findByNome(String nome);

  DadosPessoais findByCPF(Long CPF);
}
