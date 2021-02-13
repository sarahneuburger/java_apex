package com.example.situacao.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.situacao.model.AlunoModel;
import com.example.situacao.model.RespostaModel;
import com.example.situacao.repository.AlunoRepository;


@RestController
@RequestMapping("/api")
public class AlunoController {
	
	// Criando aluno respository
	@Autowired
	private AlunoRepository alunoRepository;
	
	// método para consultar todos
	@RequestMapping(value = "/aluno", method = RequestMethod.GET)
	public @ResponseBody List<AlunoModel> consultarAlunos() {
		return this.alunoRepository.findAll();
	}

	
	// método para consultar por código
	@RequestMapping(value = "/aluno/{codigo}", method = RequestMethod.GET)
	public @ResponseBody AlunoModel buscarPorCodigo(@PathVariable("codigo") Integer codigo) {
		return this.alunoRepository.findByCodigoAluno(codigo);
	}
	
	
	// método para salvar e inserir
	@RequestMapping(value = "/aluno", method = RequestMethod.POST)
	public @ResponseBody RespostaModel salvar(@RequestBody AlunoModel aluno) {
		try {
			AlunoModel alunoModel = new AlunoModel();
			if (alunoModel.getMediaAluno() >= 7) {
				alunoModel.setSituacaoAluno("Aprovado");
				
			} else if (alunoModel.getMediaAluno() < 7) {
				alunoModel.setSituacaoAluno("Reprovado");
			}
			this.alunoRepository.save(aluno);
			return new RespostaModel("Registro do aluno salvo com sucesso");
			
		} catch (Exception e) {
			return new RespostaModel("Falha ao gravar registro do aluno " + e.getMessage());

		}
	}
	
	// método para alterar
	@RequestMapping(value = "/aluno/{codigo}", method = RequestMethod.PUT)
	public @ResponseBody RespostaModel alterar(@PathVariable("codigo") Integer codigo, @RequestBody AlunoModel aluno) {
		AlunoModel alunoModel = alunoRepository.findByCodigoAluno(codigo);
		try {
			alunoModel.setNomeAluno(aluno.getNomeAluno());
			alunoModel.setIdadeAluno(aluno.getIdadeAluno());
			alunoModel.setMediaAluno(aluno.getMediaAluno());
			alunoModel.setSituacaoAluno(aluno.getSituacaoAluno());
			this.alunoRepository.save(aluno);
			return new RespostaModel("Registro alterado do aluno com sucesso");
			
		} catch (Exception e) {
			return new RespostaModel("Falha ao alterar registro do aluno" + e.getMessage());

		}
	}
	
	
	// método para deletar dados
	@RequestMapping(value = "/aluno/{codigo}", method = RequestMethod.DELETE)
	public @ResponseBody RespostaModel deletar(@PathVariable("codigo") Integer codigo) {
		AlunoModel alunoModel = alunoRepository.findByCodigoAluno(codigo);
		try {
			this.alunoRepository.delete(alunoModel);
			return new RespostaModel("Registro do aluno deletado com sucesso");
			
		} catch (Exception e) {
			return new RespostaModel("Falha ao deletar registro do aluno" + e.getMessage());

		}
	}
	
}

