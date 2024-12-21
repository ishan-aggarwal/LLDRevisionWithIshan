package creational.abstractfactory.q1;

import creational.abstractfactory.q1.parser.DocumentParser;
import creational.abstractfactory.q1.printer.DocumentPrinter;
import creational.abstractfactory.q1.processor.DocumentProcessor;

public abstract class DocumentFactory {

    public abstract DocumentProcessor createProcessor(String documentName);

    public abstract DocumentParser createParser(String path);

    public abstract DocumentPrinter createPrinter(DocumentProcessor processor);

    public abstract DocumentType supportsType();


}