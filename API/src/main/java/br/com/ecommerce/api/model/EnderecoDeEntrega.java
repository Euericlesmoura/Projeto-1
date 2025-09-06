package br.com.ecommerce.api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "endereco_de_entrega", schema = "ecommerce")
public class EnderecoDeEntrega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_endereco", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente idCliente;

    @Column(name = "logradouro", nullable = false, length = Integer.MAX_VALUE)
    private String logradouro;

    @Column(name = "numero", nullable = false, length = 10)
    private String numero;

    @Column(name = "complemento", length = Integer.MAX_VALUE)
    private String complemento;

    @Column(name = "bairro", nullable = false, length = Integer.MAX_VALUE)
    private String bairro;

    @Column(name = "cidade", nullable = false, length = Integer.MAX_VALUE)
    private String cidade;

    @Column(name = "estado", nullable = false, length = Integer.MAX_VALUE)
    private String estado;

    @Column(name = "cep", nullable = false, length = Integer.MAX_VALUE)
    private String cep;

}