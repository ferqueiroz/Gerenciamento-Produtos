package com.queiroz.Gerenciamento_Produtos.services;

import com.queiroz.Gerenciamento_Produtos.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;
}
