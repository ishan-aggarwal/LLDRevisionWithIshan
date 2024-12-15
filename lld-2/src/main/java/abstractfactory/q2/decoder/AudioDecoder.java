package abstractfactory.q2.decoder;

import abstractfactory.q2.MediaFormat;

public abstract class AudioDecoder {

    private final byte[] audioData;

    public AudioDecoder(byte[] audioData) {
        this.audioData = audioData;
    }

    public byte[] getAudioData() {
        return audioData;
    }

    public abstract MediaFormat supportsFormat();

    public abstract byte[] decode();
}