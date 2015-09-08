package com.core.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.core.Config;
import com.core.game.level.Level;
import com.core.game.level.LevelHandler;
import com.core.game.types.EntityKeys;
import com.core.graphics.Screen;

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

		LevelHandler.addLevel(new Level("level_01"));

		LevelHandler.setLevel("level_01");

		Sprite testSprite = new Entity(EntityKeys.PlayerUnits.Goblin);
	}

	@Override
	public void resize(int width, int height) {
		float w = Gdx.graphics.getWidth(); // Real screen width.
		float h = Gdx.graphics.getHeight(); // Real screen height.

		float mapRatio = ((float) Config.WIDTH / (float) Config.HEIGHT);
		float ratio = w / h;

		if (ratio < mapRatio) {
			camera = new OrthographicCamera((int) Config.WIDTH, (int) (Config.WIDTH * (h / w)));
		} else {
			camera = new OrthographicCamera((int) (Config.HEIGHT * (w / h)), (int) (Config.HEIGHT));
		}

	}

	@Override
	public void render(float delta) {
		super.render(delta);

		sb.begin();
		LevelHandler.render(sb, sr);
		sb.end();

	}

}
