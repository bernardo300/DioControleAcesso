package dio.controle.DioControleAcesso.controller;

import dio.controle.DioControleAcesso.model.JornadaTrabalho;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class JornadaTrabalhoController {

    @PostMapping
    public JornadaTrabalho createJornadaTrabalho(){
        JornadaTrabalho jornadaTrabalho = new JornadaTrabalho();
        return null;
    }
}
