package com.example.splab2;

public class AlignRight implements AlignStrategy{
    @Override
    public String render(Paragraph paragraph, Context context) {
        @Override
        public void render(Paragraph paragraph, Context context) {
            String text = paragraph.getText();
            int length = text.length();
            int pageWidth = context.getPageWidth();

            int spacesNeeded = pageWidth - length;

            for (int i = 0; i < spacesNeeded; i++) {
                System.out.print(" ");
            }

            System.out.println(text);
        }
}
