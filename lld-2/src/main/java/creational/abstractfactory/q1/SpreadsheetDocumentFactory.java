package creational.abstractfactory.q1;

import creational.abstractfactory.q1.parser.DocumentParser;
import creational.abstractfactory.q1.parser.SpreadsheetDocumentParser;
import creational.abstractfactory.q1.printer.DocumentPrinter;
import creational.abstractfactory.q1.printer.SpreadsheetDocumentPrinter;
import creational.abstractfactory.q1.processor.DocumentProcessor;
import creational.abstractfactory.q1.processor.SpreadsheetDocumentProcessor;

public class SpreadsheetDocumentFactory extends DocumentFactory {

    @Override
    public DocumentProcessor createProcessor(String name) {
        return new SpreadsheetDocumentProcessor(name);
    }

    @Override
    public DocumentParser createParser(String path) {
        return new SpreadsheetDocumentParser(path);
    }

    @Override
    public DocumentPrinter createPrinter(DocumentProcessor documentProcessor) {
        return new SpreadsheetDocumentPrinter(documentProcessor);
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }
}