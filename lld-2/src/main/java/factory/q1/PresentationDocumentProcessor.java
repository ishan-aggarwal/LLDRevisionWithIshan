package factory.q1;

public class PresentationDocumentProcessor extends DocumentProcessor {

    public PresentationDocumentProcessor(String documentName) {
        super(documentName);
    }

    @Override
    public void processDocument() {
        // Implement presentation document processing logic
        System.out.println("Processing a presentation document: " + getDocumentName());
        // Additional logic for presentation document processing
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.PRESENTATION;
    }

    public void addSlide() {
        System.out.println("Adding a slide to the presentation.");
    }
}