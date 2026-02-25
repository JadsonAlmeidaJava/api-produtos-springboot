package com.jadson.api_produtos.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.jadson.api_produtos.model.Produto;
import com.jadson.api_produtos.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoRepository repository;

    public ProdutoController(ProdutoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Produto> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarPorId(@PathVariable Long id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Produto criar(@RequestBody Produto produto) {
        return repository.save(produto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produto> atualizar(@PathVariable Long id, @RequestBody Produto produto) {
        return repository.findById(id)
                .map(p -> {
                    p.setNome(produto.getNome());
                    p.setPreco(produto.getPreco());
                    p.setQuantidade(produto.getQuantidade());
                    return ResponseEntity.ok(repository.save(p));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {

        // Verifica se o produto existe
        if (repository.findById(id).isEmpty()) {
            return ResponseEntity.notFound().build(); // 404 - não encontrado
        }

        // Se existe, deleta
        repository.deleteById(id);
        return ResponseEntity.noContent().build(); // 204 - sem conteúdo
    }
}