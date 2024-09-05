package org.exemplo.demo.funcionario;

import org.exemplo.demo.abstractcrud.AbstractResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.exemplo.demo.funcionario.Funcionario;
import org.exemplo.demo.funcionario.FuncionarioService;

@RestController
@RequestMapping("/api/funcionarios")
@CrossOrigin("*")
//Controlador REST que lida com as requisições HTTP para a rota de funcionários
public class FuncionarioController extends AbstractResource<Funcionario, FuncionarioRepository, FuncionarioService> {

    //Construtor do controlador que injeta o serviço de funcionários
    public FuncionarioController(FuncionarioService service) {
        super(service);
    }

}