package Multithreading.functionalRevision;

public class Basicsmusic {
    public static void main(String[] args) {
        //traditional way
        MusicService musicService=new MusicServiceImpl();
        musicService.playmusic();
        musicService.stopmusic();
        //anonymous class
        MusicService anon=new MusicService() {
            @Override
            public void playmusic() {
                System.out.println("anon playing music");
            }

            @Override
            public void stopmusic() {
                System.out.println("anon stoping music");
            }
        };
       anon.playmusic();
       anon.stopmusic();

       MusicService lambda=()->{
           System.out.println("playing the lambda");
       };
       lambda.playmusic();
       lambda.stopmusic();
    }
}
