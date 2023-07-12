package com.dadospessoais.dadosPessoais.Domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.Date;

@Entity
@Table(name = "Valores" )
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DadosPessoais {

  private static final Long serialVersionUID = 1L;

  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "nome", nullable = false, length = 80)
  private String nome;

  @Column(name = "CPF", nullable = false, length = 11)
  private Long CPF;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public static DadosPessoais create(DadosPessoais dadosPessoais){
    ModelMapper modelMapper = new ModelMapper();
    return modelMapper.map(dadosPessoais, DadosPessoais.class);
  }
}

