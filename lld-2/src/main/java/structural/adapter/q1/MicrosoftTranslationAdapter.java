package structural.adapter.q1;

import structural.adapter.q1.external.MicrosoftTranslateApi;

import java.util.List;

public class MicrosoftTranslationAdapter implements TranslationProviderAdapter {
    private MicrosoftTranslateApi translateApi = new MicrosoftTranslateApi();

    @Override
    public String translate(TranslationRequest request) {
        return translateApi.translate(request.getText(), request.getSourceLanguage(), request.getTargetLanguage());
    }

    @Override
    public List<String> getSupportedLanguages() {
        return translateApi.getSupportedLanguages();
    }
}