package Projekat;

import javax.sound.sampled.*;

public class Sound {
		
	private Clip clip;
	
	//READING THE PATH TO THE DATA
	public Sound(String soundstr) {
		try {
			AudioInputStream ais = AudioSystem.getAudioInputStream(getClass().getResourceAsStream(soundstr));
			clip = AudioSystem.getClip();
			clip.open(ais);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	//PLAY SOUND
	public void play() {
		if(clip==null) 
			return;
		clip.stop();	
		clip.setFramePosition(0);
		clip.start();
	}
	
	//STOP SOUND
	public void stop() {
		if(clip.isRunning()) 
			clip.stop();
	}
}