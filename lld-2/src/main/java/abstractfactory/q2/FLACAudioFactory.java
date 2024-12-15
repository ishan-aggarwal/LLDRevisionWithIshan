package abstractfactory.q2;

import abstractfactory.q2.decoder.AudioDecoder;
import abstractfactory.q2.decoder.FLACDecoder;
import abstractfactory.q2.player.AudioPlayer;
import abstractfactory.q2.player.FLACPlayer;
import abstractfactory.q2.processor.AudioProcessor;
import abstractfactory.q2.processor.FLACAudioProcessor;

public class FLACAudioFactory extends AudioFactory {

    public AudioPlayer createAudioPlayer(int volume, double playbackRate) {
        return new FLACPlayer(volume, playbackRate);
    }

    public AudioDecoder createAudioDecoder(byte[] audioData) {
        return new FLACDecoder(audioData);
    }

    public AudioProcessor createAudioProcessor(byte[] audioData) {
        return new FLACAudioProcessor(audioData);
    }

    public MediaFormat supportsFormat() {
        return MediaFormat.FLAC;
    }
}