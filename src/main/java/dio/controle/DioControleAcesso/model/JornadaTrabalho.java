package dio.controle.DioControleAcesso.model;

import lombok.*;

import java.util.Objects;

@Getter // metodos setters
@Setter  // metodos setters
@AllArgsConstructor //constutor com todos os argntos
@NoArgsConstructor // constutor sem argumentos
@EqualsAndHashCode //metodos equal e hash
@Builder // tranferie objeto dto para objeto modelo
public class JornadaTrabalho {
    private long id;
    private String descricao;

}
