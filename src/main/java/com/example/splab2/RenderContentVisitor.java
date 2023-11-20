package com.example.splab2;

public class RenderContentVisitor implements Visitor{
    @Override
    public void visitBook(Book book) {
        System.out.print("Book: ");
        System.out.println(book.getTitle());
        book.getAuthorList().forEach(e -> e.print());
        book.getAuthorList().forEach(e -> e.print());
    }

    @Override
    public void visitSection(Section section) {
        System.out.println(section.getTitle());
        for (Element element : section.getElementList()) {
            element.print();
        }
    }

    @Override
    public void visitTableOfContents(TableOfContents tableOfContents) {

    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        System.out.print("Paragraph: ");
        System.out.println(paragraph.getText());
    }

    @Override
    public void visitImage(Image image) {
        System.out.println(image.getUrl());
    }

    @Override
    public void visitTable(Table table) {

    }
}
