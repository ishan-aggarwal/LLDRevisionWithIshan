package creational.abstractfactory.q1;

import creational.abstractfactory.q1.parser.DocumentParser;
import creational.abstractfactory.q1.parser.TextDocumentParser;
import creational.abstractfactory.q1.printer.DocumentPrinter;
import creational.abstractfactory.q1.printer.TextDocumentPrinter;
import creational.abstractfactory.q1.processor.DocumentProcessor;
import creational.abstractfactory.q1.processor.TextDocumentProcessor;

public class TextDocumentFactory extends DocumentFactory {

    @Override
    public DocumentProcessor createProcessor(String name) {
        return new TextDocumentProcessor(name);
    }

    @Override
    public DocumentParser createParser(String path) {
        return new TextDocumentParser(path);
    }

    @Override
    public DocumentPrinter createPrinter(DocumentProcessor documentProcessor) {
        return new TextDocumentPrinter(documentProcessor);
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }
}