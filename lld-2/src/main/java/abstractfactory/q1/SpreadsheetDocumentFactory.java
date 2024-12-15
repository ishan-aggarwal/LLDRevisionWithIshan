package abstractfactory.q1;

import abstractfactory.q1.parser.DocumentParser;
import abstractfactory.q1.parser.SpreadsheetDocumentParser;
import abstractfactory.q1.printer.DocumentPrinter;
import abstractfactory.q1.printer.SpreadsheetDocumentPrinter;
import abstractfactory.q1.processor.DocumentProcessor;
import abstractfactory.q1.processor.SpreadsheetDocumentProcessor;

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