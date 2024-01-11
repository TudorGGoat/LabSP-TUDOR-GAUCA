package com.example.splab2.services;

import com.example.splab2.model.Context;
import com.example.splab2.model.Paragraph;

public interface AlignStrategy {
    public void render(Paragraph paragraph, Context context);
}
