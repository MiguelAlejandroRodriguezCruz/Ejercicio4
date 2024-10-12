package com.upiiz.discounts.Services;

import java.util.List;
import org.springframework.stereotype.Service;

import com.upiiz.discounts.Models.Discounts;
import com.upiiz.discounts.Repository.DiscountsRepositoyry;

@Service
public class DiscountsService {
    DiscountsRepositoyry discountsRepositoyry;

    public DiscountsService(DiscountsRepositoyry discountsRepositoyry) {
        this.discountsRepositoyry = discountsRepositoyry;
    }

    // @GetMapping()
    public List<Discounts> getAlldiscounts() {
        return discountsRepositoyry.obtenerTodas();
    }

    // @GetMapping("/{id}")
    public Discounts getCategoriaById(Long id) {
        return discountsRepositoyry.obtnerPorId(id);
    }

    // @PostMapping()
    public Discounts createCategoria(Discounts categoria) {
        return discountsRepositoyry.guardar(categoria);
    }

    // @PutMapping("/{id}")
    public Discounts updateCategoria(Discounts categoria) {
        return discountsRepositoyry.actualizar(categoria);
    }

    // DeleteMapping("/{id}")
    public void deleteCategoria(Long id) {
        discountsRepositoyry.eliminar(id);
    }

}
