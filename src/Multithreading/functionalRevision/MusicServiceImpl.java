package Multithreading.functionalRevision;

public class MusicServiceImpl implements MusicService {

    @Override
    public void playmusic() {
        System.out.println("playing the music");
    }

    @Override
    public void stopmusic() {
        System.out.println("stoping the music");
    }
}
