package creational.abstractfactory.q2;

import creational.abstractfactory.q2.decoder.AudioDecoder;
import creational.abstractfactory.q2.decoder.FLACDecoder;
import creational.abstractfactory.q2.player.AudioPlayer;
import creational.abstractfactory.q2.player.FLACPlayer;
import creational.abstractfactory.q2.processor.AudioProcessor;
import creational.abstractfactory.q2.processor.FLACAudioProcessor;

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