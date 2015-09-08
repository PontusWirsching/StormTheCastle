package com.core.graphics;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.core.Config;

/**
 * A screen is an object that holds the basic components for <br>
 * a game to work. <br>
 * These objects are for example a camera, a sprite batch. <br>
 * 
 * @author Pontus Wirsching
 * @since 2015-08-27
 */
public class Screen {

	protected OrthographicCamera camera;

	public SpriteBatch sb;
	public ShapeRenderer sr;

	private String name = "undefined";

	public Screen(String name) {
		setName(name);
		sb = new SpriteBatch();
		sr = new ShapeRenderer();
		resize(0, 0);

	}

	public void render(float delta) {
		camera.update();

		sb.setProjectionMatrix(camera.combined);
		sr.setProjectionMatrix(camera.combined);

	}

	public void resize(int width, int height) {
		float w = Gdx.graphics.getWidth(); // Real screen width.
		float h = Gdx.graphics.getHeight(); // Real screen height.

		// float mapRatio = ((float) Config.WIDTH / (float) Config.HEIGHT);
		// float ratio = w / h;
		// if (ratio < mapRatio) {
		// camera = new OrthographicCamera((int) Config.WIDTH, (int)
		// (Config.WIDTH * (h / w)));
		// } else {
		camera = new OrthographicCamera((int) (Config.HEIGHT * (w / h)), (int) (Config.HEIGHT));
		// }

	}

	public OrthographicCamera getCamera() {
		return camera;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
