package com.apex.spring.api.API.Colaboradores.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.apex.spring.api.API.Colaboradores.model.ColaboradorModel;
import com.apex.spring.api.API.Colaboradores.model.RespostaModel;
import com.apex.spring.api.API.Colaboradores.repository.ColaboradorRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class ColaboradorController {
	
	@Autowired
	private ColaboradorRepository colaboradorRepository;
	
	// método para buscar todos
	// responseBody joga em formato json
	// retorna o findAll que criamos
	@RequestMapping(value = "/colaborador", method = RequestMethod.GET) //mapeamento do tipo de requisição - "/colaborador" é a parte da url a ser acessada
	public @ResponseBody List<ColaboradorModel> consultarTodos() {
		return this.colaboradorRepository.findAll();
		
	}

	// método para buscar por código
	@RequestMapping(value = "/colaborador/{codigo}", method = RequestMethod.GET) // {codigo} é informação que será passada na url, "variável do navegador"
	public @ResponseBody ColaboradorModel buscarPorCodigo(@PathVariable("codigo") Integer codigo) {
		return this.colaboradorRepository.findByCodigo(codigo);
	}
	
	// método para validar se os dados foram salvos
	// pode utilizar a mesma url, pois os tipos de requisições será diferentes, post
	@RequestMapping(value = "/colaborador", method = RequestMethod.POST)
	public @ResponseBody RespostaModel salvar(@RequestBody ColaboradorModel colaborador) {
		try {
			
			this.colaboradorRepository.save(colaborador);
			return new RespostaModel("Registro salvo com sucesso");
			
		} catch (Exception e) {
			return new RespostaModel("Falha ao gravar registro\n" + e.getMessage());

		}
	}
	
	// alterar dados
	@RequestMapping(value = "/colaborador/{codigo}", method = RequestMethod.PUT)
	public @ResponseBody RespostaModel alterar(@PathVariable("codigo") Integer codigo, @RequestBody ColaboradorModel colaborador) {
		// preciso criar um objeto do tipo colaborador model para receber dos dados pelo código
		ColaboradorModel colaboradorModel = colaboradorRepository.findByCodigo(codigo);
		try {
			// setar dados atualizados através do RequestBody nos meus dados da tabela
			colaboradorModel.setNome(colaborador.getNome());
			colaboradorModel.setSobrenome(colaborador.getSobrenome());
			colaboradorModel.setEmail(colaborador.getEmail());
			this.colaboradorRepository.save(colaborador);
			return new RespostaModel("Registro alterado com sucesso");
			
		} catch (Exception e) {
			return new RespostaModel("Falha ao alterar registro" + e.getMessage());

		}
	}
	
	
	// deletar dados
	@RequestMapping(value = "/colaborador/{codigo}", method = RequestMethod.DELETE)
	public @ResponseBody RespostaModel deletar(@PathVariable("codigo") Integer codigo) {
		// não preciso do requestbody pois não preencher dados
		// preciso criar um objeto do tipo colaborador model para receber dos dados pelo código
		ColaboradorModel colaborador = colaboradorRepository.findByCodigo(codigo);
		try {
			this.colaboradorRepository.delete(colaborador);
			return new RespostaModel("Registro deletado com sucesso");
			
		} catch (Exception e) {
			return new RespostaModel("Falha ao deletar registro" + e.getMessage());

		}
	}
	
	
}
