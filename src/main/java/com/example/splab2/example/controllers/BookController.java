package com.example.splab2.example.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.splab2.model.*;
import com.example.splab2.services.BookStatisticsVisitor;

@RestController
@RequestMapping("/books")
public class BookController {
    @GetMapping("/statistics")
    public ResponseEntity<?> printStatistics() {
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);
        cap1.add(new ImageProxy("ImageOne"));
        cap1.add(new Image("ImageTwo"));
        cap1.add(new Paragraph("Some text"));
        cap1.add(new Table("Table 1"));
        BookStatisticsVisitor stats = new BookStatisticsVisitor();
        cap1.accept(stats);
        stats.printStatistics();
        return new ResponseEntity<>("", HttpStatus.OK);
    }
}
