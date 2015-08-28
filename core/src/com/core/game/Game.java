package com.core.game;

import com.core.graphics.Screen;
import com.core.resources.Textures;

/**
 * This will be our core game class. <br>
 * In here we will do everything game related like: <br>
 * - Loading levels. <br>
 * - Loading gui. <br>
 * - etc. <br>
 * 
 * @author Pontus Wirsching
 * @since 2015-08-27
 *
 */
public class Game extends Screen {

	Level currentLevel;
	public Game(String name) {
		super(name);
		
		//TODO MM : Find a better place to move this.
		currentLevel = new Level();
		currentLevel.AddBackground(Textures.level1);
	}
	
	@Override
	public void render(float delta) {
		super.render(delta);
		
		sb.begin();
		{
			currentLevel.Draw(sb);
		}
		sb.end();
		
	}

}
