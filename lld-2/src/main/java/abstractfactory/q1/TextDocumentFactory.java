package abstractfactory.q1;

import abstractfactory.q1.parser.DocumentParser;
import abstractfactory.q1.parser.TextDocumentParser;
import abstractfactory.q1.printer.DocumentPrinter;
import abstractfactory.q1.printer.TextDocumentPrinter;
import abstractfactory.q1.processor.DocumentProcessor;
import abstractfactory.q1.processor.TextDocumentProcessor;

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