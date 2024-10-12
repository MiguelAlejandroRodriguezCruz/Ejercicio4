package com.upiiz.discounts.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upiiz.discounts.Models.Discounts;
import com.upiiz.discounts.Services.DiscountsService;

@RestController
@RequestMapping("/api/v1/discounts")
public class DiscountsController {
    @Autowired
    private DiscountsService discountsService;

    @GetMapping()
    public ResponseEntity<List<Discounts>> getdiscounts() {
        return ResponseEntity.ok(discountsService.getAlldiscounts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Discounts> getCategoria(@PathVariable Long id) {
        return ResponseEntity.ok(discountsService.getCategoriaById(id));
    }

    @PostMapping()
    public ResponseEntity<Discounts> addCategoria(@RequestBody Discounts categoria) {
        return ResponseEntity.ok(discountsService.createCategoria(categoria));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Discounts> updateCategoria(@RequestBody Discounts categoria, @PathVariable Long id) {
        categoria.setId(id);
        return ResponseEntity.ok(discountsService.updateCategoria(categoria));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarCategoria(@PathVariable Long id) {
        discountsService.deleteCategoria(id);
        return ResponseEntity.noContent().build();
    }

}
