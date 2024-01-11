package com.example.splab2.services;

import com.example.splab2.model.Context;
import com.example.splab2.model.Paragraph;

public class AlignLeft implements AlignStrategy{

    @Override
    public void render(Paragraph paragraph, Context context) {
        String text = paragraph.getText();
        int length = text.length();

        int pageWidth = context.getPageWidth();
        int spacesNeeded = pageWidth - length;

        System.out.print(text);
        for (int i = 0; i < spacesNeeded; i++) {
            System.out.print(" ");
        }
        System.out.println();
    }
}
