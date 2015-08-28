package com.core.game;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.core.resources.Textures;

/**
 * Handles multiple backgrounds for each level.
 * 
 * @author Mike McEnery
 * @since 2015-08-27
 *
 */
public class Level {
	List<Texture> backgroundImages;
	int currentLevelScreen = 0;
	public Level(){
		backgroundImages = new ArrayList<Texture>();
	}
	
	public void AddBackground(Texture backgroundImage){
		backgroundImages.add(backgroundImage);
	}
	
	public void GoToNextScreen(){
		currentLevelScreen++;
	}
	
	public void GoToPreviousScreen(){
		currentLevelScreen--;
	}
	
	public void Draw(SpriteBatch spriteBatch){
		Texture CurrentBackgroundScreen = GetCurrentBackgroundScreen();
		
		spriteBatch.draw(CurrentBackgroundScreen, -CurrentBackgroundScreen.getWidth() / 2, -CurrentBackgroundScreen.getHeight() / 2);
	}
	
	private Texture GetCurrentBackgroundScreen(){
		return backgroundImages.get(currentLevelScreen);
	}
}
