package dio.controle.DioControleAcesso;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Route {

    @GetMapping("/")
    public String Hello(){
        return "Hello gladle filho da puta";
    }
    @GetMapping("/{nome}")
    public String suer(@PathVariable String nome){
        return "Ola : "+nome;
    }
}
