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

	public Game(String name) {
		super(name);
	}
	
	@Override
	public void render(float delta) {
		super.render(delta);
		
		sb.begin();
		{

			sb.draw(Textures.level1, -Textures.level1.getWidth() / 2, -Textures.level1.getHeight() / 2);
			
		}
		sb.end();
		
	}

}
