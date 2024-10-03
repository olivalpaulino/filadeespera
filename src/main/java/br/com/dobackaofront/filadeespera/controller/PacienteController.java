package br.com.dobackaofront.filadeespera.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.dobackaofront.filadeespera.entity.Paciente;

@Controller
public class PacienteController {
    private List<Paciente> listaPacientes = new ArrayList<>();
	
	
    // Exibe o formulário de cadastro
    @GetMapping("/cadastrar")
    public String mostrarFormulario(Model model) {
        // Adiciona um objeto Paciente vazio ao modelo, para que o formulário seja preenchido
        model.addAttribute("paciente", new Paciente());
        return "cadastrar";  // Nome do template HTML (cadastro-paciente.html)
    }

    // Processa os dados do formulário de cadastro
    @PostMapping("/cadastrar")
    public String cadastrarPaciente(@ModelAttribute Paciente paciente) {
        // Aqui você pode realizar operações como salvar no banco de dados
        // Exemplo: salvando o paciente em um repositório de dados
        System.out.println("Paciente cadastrado: " + paciente.getNome());
        System.out.println("Email: " + paciente.getEmail());
        System.out.println("Telefone: " + paciente.getTelefone());
        System.out.println("Endereço: " + paciente.getEndereco());
        System.out.println("Data de Nascimento: " + paciente.getDataNascimento());
        System.out.println("Tipo Sanguíneo: " + paciente.getTipoSanguineo());
        System.out.println("Possui Alergias? " + (paciente.isPossuiAlergias() ? "Sim" : "Não"));
        System.out.println("Convênio: " + paciente.getConvenio());
        System.out.println("Sexo: " + paciente.getSexo());

        listaPacientes.add(paciente);
        
        // Após cadastrar, redireciona para uma página de sucesso ou outro fluxo desejado
        return "redirect:/sucesso";  // Redireciona para uma página de confirmação de sucesso
    }
    
    @GetMapping("/sucesso")
    public String sucesso(Model model) {
    	model.addAttribute("pacientes", listaPacientes);
    	
    	return "sucesso";
    }
    
 // Método para excluir paciente usando o índice
    @GetMapping("/excluir/{index}")
    public String excluirPaciente(@PathVariable("index") int index, Model model) {
        if (index >= 0 && index < listaPacientes.size()) {
            listaPacientes.remove(index);
        }
        model.addAttribute("pacientes", listaPacientes);
        return "redirect:/sucesso"; // Redireciona para o template de sucesso
    }
}
