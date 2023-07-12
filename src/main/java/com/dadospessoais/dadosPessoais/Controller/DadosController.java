package com.dadospessoais.dadosPessoais.Controller;

import com.dadospessoais.dadosPessoais.Domain.DadosPessoais;
import com.dadospessoais.dadosPessoais.Repository.DadosRepository;
import com.dadospessoais.dadosPessoais.Services.DadosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dados")
public class DadosController {

  @Autowired
  private DadosServices dadosServices;

  @GetMapping("")
  public List<DadosPessoais> findAll(){
    return dadosServices.findAll();
  }

  @GetMapping("/nome/{nome}")
  public DadosPessoais findByNome(@PathVariable("nome")String nome){
    return dadosServices.findByNome(nome);
  }

  @GetMapping("/cpf/{CPF}")
  public DadosPessoais findByCPF(@PathVariable("CPF") Long CPF){
    return dadosServices.findByCPF(CPF);
  }


  @PostMapping("/create")
  public DadosPessoais crate(@RequestBody DadosPessoais dadosPessoais) {
    return dadosServices.create(dadosPessoais);
  }

  @PutMapping("/update")
  public DadosPessoais update(@RequestBody DadosPessoais dadosPessoais){
    return dadosServices.create(dadosPessoais);
  }

  @DeleteMapping("/deletar/{id}")
  public String deleteById(@PathVariable("id") Long id){
    dadosServices.deleteById(id);
      return "Id deletado com sucesso";
  }
}

