package structural.adapter.q1;

import java.util.List;

public interface TranslationProviderAdapter {
    String translate(TranslationRequest request);

    List<String> getSupportedLanguages();
}