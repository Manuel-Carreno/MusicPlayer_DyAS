package main.java.edu.unisabana.dyas.patterns.utils;

public class AdvancedAudioPlayerAdapter implements AudioPlayer {
    
    private AdvancedAudioPlayer reprodAvanzado;

    public AdvancedAudioPlayerAdapter(AdvancedAudioPlayer reprodAvanzado){ //constructor
        this.reprodAvanzado = reprodAvanzado;
    }

    @Override
    public void play(String audioType, String fileName){
        if(audioType.equalsIgnoreCase("mp4")){
            reprodAvanzado.playMp4(fileName);
        } else if (audioType.equalsIgnoreCase("vlc")) {
            reprodAvanzado.playVlc(fileName);
        } else {
            System.out.println("El formato no es soportado por el programa");
        }
    }

    @Override
    public void stop(){
        reprodAvanzado.stop();
    }


    


    
}
