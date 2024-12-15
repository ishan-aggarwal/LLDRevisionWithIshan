package abstractfactory.q2;

import abstractfactory.q2.decoder.AudioDecoder;
import abstractfactory.q2.decoder.MP3Decoder;
import abstractfactory.q2.player.AudioPlayer;
import abstractfactory.q2.player.MP3Player;
import abstractfactory.q2.processor.AudioProcessor;
import abstractfactory.q2.processor.MP3AudioProcessor;

public class MP3AudioFactory extends AudioFactory {
    public MediaFormat supportsFormat() {
        return MediaFormat.MP3;
    }

    public AudioPlayer createAudioPlayer(int volume, double playbackRate) {
        return new MP3Player(volume, playbackRate);
    }

    public AudioDecoder createAudioDecoder(byte[] audioData) {
        return new MP3Decoder(audioData);
    }

    public AudioProcessor createAudioProcessor(byte[] audioData) {
        return new MP3AudioProcessor(audioData);
    }
}