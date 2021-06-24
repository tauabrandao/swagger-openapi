package com.brandao.mstransaction.controllers;

import com.brandao.mstransaction.dto.Order;
import com.brandao.mstransaction.dto.StockDTO;
import com.brandao.mstransaction.services.TransactionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Tag(name = "Transaction controller")
@RestController
@RequestMapping("/transaction")
public class TransactionController {

    private final TransactionService service;

    public TransactionController(TransactionService service) {
        this.service = service;
    }

    @Operation(summary = "Get resumed order by a stock code and its amount")
    @GetMapping("/calculate/{amount}/{stock}")
    public ResponseEntity<Object> resumeOrder(@PathVariable Long amount, @PathVariable String stock) {
        Order order = service.resumeOrder(stock, amount);

        if(Optional.ofNullable(order).isEmpty())
            return ResponseEntity.ok("stock not found");

        return ResponseEntity.ok(order);
    }

}
