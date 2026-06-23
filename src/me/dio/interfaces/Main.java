package me.dio.interfaces;

public class Main {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new Computer();
        runMusic(musicPlayer);
        VideoPlayer videoPlayer = new Smartphone();
        runVideo(videoPlayer);
    }

    public static void runVideo(VideoPlayer videoPlayer) {
        videoPlayer.playVideo();
    }

    public static void runMusic(MusicPlayer musicPlayer) {
        musicPlayer.playMusic();
    }

}
