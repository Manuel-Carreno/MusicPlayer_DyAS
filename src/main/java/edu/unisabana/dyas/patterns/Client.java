package main.java.edu.unisabana.dyas.patterns;

import main.java.edu.unisabana.dyas.patterns.utils.AdvancedAudioPlayer;
import main.java.edu.unisabana.dyas.patterns.utils.AdvancedAudioPlayerAdapter;
import main.java.edu.unisabana.dyas.patterns.utils.AudioPlayer;

// Cliente que utiliza directamente AdvancedAudioPlayer sin conocer la interfaz AudioPlayer
public class Client {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AdvancedAudioPlayerAdapter(new AdvancedAudioPlayer());
        
        audioPlayer.play("mp4", "video.mp4");
        audioPlayer.stop(); 

        System.out.println("-----------");

        // prueba para vlc
        audioPlayer.play("vlc", "videoDyAS.vlc");
        audioPlayer.stop();
        
    }   
}