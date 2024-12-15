package structural.facade.q2;

import structural.facade.q2.models.AnalysisAlgorithmConfig;
import structural.facade.q2.models.AnalysisResult;
import structural.facade.q2.models.DataCollectionParams;
import structural.facade.q2.models.PreprocessingOptions;
import structural.facade.q2.services.AnalysisAlgorithmService;
import structural.facade.q2.services.DataCollectionService;
import structural.facade.q2.services.DataPreprocessingService;
import structural.facade.q2.services.VisualizationService;

public class DataAnalysisManager {

    private DataAnalysisProcessor dataAnalysisProcessor;

    public DataAnalysisManager(DataCollectionService dataCollectionService,
                               DataPreprocessingService dataPreprocessingService,
                               AnalysisAlgorithmService analysisAlgorithmService,
                               VisualizationService visualizationService) {
        dataAnalysisProcessor = new DataAnalysisProcessor(dataCollectionService, dataPreprocessingService, analysisAlgorithmService, visualizationService);
    }

    public AnalysisResult performFullAnalysis(DataCollectionParams collectionParams,
                                              PreprocessingOptions preprocessingOptions,
                                              AnalysisAlgorithmConfig algorithmConfig) {
        return dataAnalysisProcessor.process(collectionParams, preprocessingOptions, algorithmConfig);
    }

}