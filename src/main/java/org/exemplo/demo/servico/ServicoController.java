package org.exemplo.demo.servico;

import org.exemplo.demo.servico.Servico;
import org.exemplo.demo.servico.ServicoRepository;
import org.exemplo.demo.servico.ServicoService;
import org.exemplo.demo.abstractcrud.AbstractResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/servicos")
@CrossOrigin("*")
//Controlador REST que lida com as requisições HTTP para a rota de serviços
public class ServicoController extends AbstractResource<Servico, ServicoRepository, ServicoService> {

    //Construtor que recebe o serviço e o passa para a superclasse
    public ServicoController(ServicoService service) {
        super(service);
    }
}
