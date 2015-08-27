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
public class Screen implements com.badlogic.gdx.Screen {

	private OrthographicCamera camera;
	
	private SpriteBatch sb;
	private ShapeRenderer sr;
	
	private String name = "undefined";

	public Screen(String name) {
		setName(name);
		sb = new SpriteBatch();
		sr = new ShapeRenderer();
		
		resize(0, 0);
		
	}
	
	@Override
	public void render(float delta) {
		camera.update();
		
		sb.setProjectionMatrix(camera.combined);
		sr.setProjectionMatrix(camera.combined);
		
	}

	@Override
	public void resize(int width, int height) {
		float w = Gdx.graphics.getWidth(); // Real screen width.
		float h = Gdx.graphics.getHeight(); // Real screen height.
		
		//Initialize camera.
		camera = new OrthographicCamera(Config.HEIGHT * (w / h), Config.HEIGHT);
	}

	@Override
	public void show() {

	}

	@Override
	public void hide() {

	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void dispose() {

	}
	
	public OrthographicCamera getCamera() {
		return camera;
	}

	public SpriteBatch getSb() {
		return sb;
	}

	public ShapeRenderer getSr() {
		return sr;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
