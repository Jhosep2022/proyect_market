package com.platzi.proyectmarket.domain.repository;

import com.platzi.proyectmarket.domain.Purchase;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface PurchaseRepository {
    List<Purchase> getAll();
    Optional<List<Purchase>> getByClient(String clientId);
    Purchase save(Purchase purchase);
}
