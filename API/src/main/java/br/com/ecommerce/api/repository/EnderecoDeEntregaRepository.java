package br.com.ecommerce.api.repository;

import br.com.ecommerce.api.model.EnderecoDeEntrega;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoDeEntregaRepository extends JpaRepository <EnderecoDeEntrega, Integer> {
}
