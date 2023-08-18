package br.com.pizzaria.uniamerica.dto.clienteDTOs;


import br.com.pizzaria.uniamerica.dto.pedidoDTOs.PedidoDTO;
import br.com.pizzaria.uniamerica.dto.usuarioDTOs.UsuarioDTO;
import br.com.pizzaria.uniamerica.entities.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class ClienteDTO {

    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    private UsuarioDTO usuarioDTO;
    @Getter
    @Setter
    private Endereco endereco;
    @Getter
    @Setter
    @NotNull
    @Column(name = "nome")
    private String nome;
    @Getter
    @Setter
    private List<PedidoDTO> pedidoList = new ArrayList<>();


    public ClienteDTO(Cliente entity) {
        id = entity.getId();
        endereco = entity.getEndereco();
        nome = entity.getNome();

    }
}
