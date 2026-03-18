package com.queiroz.Gerenciamento_Produtos.repositories;

import com.queiroz.Gerenciamento_Produtos.models.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
}
