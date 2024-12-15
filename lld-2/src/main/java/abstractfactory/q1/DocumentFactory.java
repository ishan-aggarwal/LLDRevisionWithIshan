package abstractfactory.q1;

import abstractfactory.q1.parser.DocumentParser;
import abstractfactory.q1.printer.DocumentPrinter;
import abstractfactory.q1.processor.DocumentProcessor;

public abstract class DocumentFactory {

    public abstract DocumentProcessor createProcessor(String documentName);

    public abstract DocumentParser createParser(String path);

    public abstract DocumentPrinter createPrinter(DocumentProcessor processor);

    public abstract DocumentType supportsType();


}