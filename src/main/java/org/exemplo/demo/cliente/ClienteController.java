package org.exemplo.demo.cliente;

import org.exemplo.demo.abstractcrud.AbstractResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.exemplo.demo.cliente.Cliente;
import org.exemplo.demo.cliente.ClienteService;

@RestController
@RequestMapping("/api/clientes")
@CrossOrigin("*")
//Controlador REST que lida com as requisições HTTP para a rota de clientes
public class ClienteController extends AbstractResource<Cliente, ClienteRepository, ClienteService> {

    //Construtor do controlador que injeta o serviço de cliente
    public ClienteController(ClienteService service) {
        super(service);
    }

}