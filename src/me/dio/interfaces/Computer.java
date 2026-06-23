package me.dio.interfaces;

public class Computer implements VideoPlayer, MusicPlayer {
    @Override
    public void playMusic() {
        System.out.println("O computador está tocando a musica...");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O computador pausou a musica...");
    }

    @Override
    public void stopMusic() {
        System.out.println("O computador parou a musica...");
    }

    @Override
    public void playVideo() {
        System.out.println("O computador começou o vídeo...");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O computador pausou o vídeo...");
    }

    @Override
    public void stopVideo() {
        System.out.println("O computador parou o vídeo...");
    }
}
