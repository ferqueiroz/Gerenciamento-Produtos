package com.queiroz.Gerenciamento_Produtos.controllers;

import com.queiroz.Gerenciamento_Produtos.models.ProdutoModel;
import com.queiroz.Gerenciamento_Produtos.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<ProdutoModel> criarProduto(@RequestBody ProdutoModel produtoModel) {
        return ResponseEntity.status(201).body(produtoService.criarProduto(produtoModel));
    }

    @GetMapping
    public ResponseEntity<List<ProdutoModel>> listarProdutos() {
        return ResponseEntity.ok().body(produtoService.listarProdutos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoModel> buscarProduto(@PathVariable Long id) {
        Optional<ProdutoModel> livro = produtoService.buscarProduto(id);

        if (livro.isPresent())
            return ResponseEntity.ok().body(livro.get());
        else
            return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ProdutoModel> deletarProduto(@PathVariable Long id) {
        produtoService.excluirProduto(id);

        return ResponseEntity.noContent().build();
    }
}
