package abstractfactory.q2;

import abstractfactory.q2.decoder.AudioDecoder;
import abstractfactory.q2.player.AudioPlayer;
import abstractfactory.q2.processor.AudioProcessor;

public abstract class AudioFactory {
    public abstract MediaFormat supportsFormat();

    public abstract AudioPlayer createAudioPlayer(int volume, double playbackRate);

    public abstract AudioDecoder createAudioDecoder(byte[] audioData);

    public abstract AudioProcessor createAudioProcessor(byte[] audioData);

}
