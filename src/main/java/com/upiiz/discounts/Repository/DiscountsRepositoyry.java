package com.upiiz.discounts.Repository;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.upiiz.discounts.Models.Discounts;

@Repository
public class DiscountsRepositoyry {
    // Almacenar las discounts
    // Genera de manera unica el id de cada discounts
    private List<Discounts> discounts = new ArrayList<Discounts>();
    private AtomicLong id = new AtomicLong();

    public Discounts guardar(Discounts categoria) {

        categoria.setId(id.incrementAndGet());
        discounts.add(categoria);
        return categoria;
    }

    // GET - Todas las discounts
    public List<Discounts> obtenerTodas() {

        return discounts;
    }

    // GET solo un categoria
    public Discounts obtnerPorId(Long id) {

        /*
         * for (Categoria categoria : discounts) {
         * if (categoria.getId().equals(id)) {
         * return categoria;
         * }
         * }
         * return null;
         */
        // discounts.stream().filter(categoria ->
        return discounts.stream().filter(categoria -> categoria.getId().equals(id)).findFirst().orElse(null);
    }

    // Delete
    public void eliminar(Long id) {
        discounts.removeIf(categoria -> categoria.getId().equals(id));

    }

    // PUT
    public Discounts actualizar(Discounts categoria) {
        eliminar(categoria.getId());
        discounts.add(categoria);
        return categoria;
    }
}
