package com.queiroz.Gerenciamento_Produtos.services;

import com.queiroz.Gerenciamento_Produtos.models.ProdutoModel;
import com.queiroz.Gerenciamento_Produtos.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public ProdutoModel criarProduto(ProdutoModel produtoModel) {
        return produtoRepository.save(produtoModel);
    }

    public List<ProdutoModel> listarProdutos() {
        return produtoRepository.findAll();
    }

    public Optional<ProdutoModel> buscarProduto(Long id) {
        return produtoRepository.findById(id);
    }

    public void excluirProduto(Long id) {
        produtoRepository.deleteById(id);
    }
}
