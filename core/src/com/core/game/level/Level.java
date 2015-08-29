package com.core.game.level;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.maps.MapProperties;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapRenderer;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.core.graphics.ScreenManager;

public class Level {

	private String name = "undefined";

	public TiledMap map;
	public TiledMapRenderer renderer;

	public Level(String name) {
		setName(name);

		map = new TmxMapLoader().load("Map1_Tutorial.tmx");
		renderer = new OrthogonalTiledMapRenderer(map);

	}

	public void render(float delta, SpriteBatch sb, ShapeRenderer sr) {
		OrthographicCamera camera = ScreenManager.getSelected().getCamera();

		MapProperties prop = map.getProperties();

		camera.position.set(prop.get("width", Integer.class) * prop.get("tilewidth", Integer.class) / 2, prop.get("height", Integer.class) * prop.get("tileheight", Integer.class) / 2, 0);

		camera.zoom = 1.0f;
		renderer.setView(camera);
		
		int[] layers = {0, 1, 2, 3};
		renderer.render(layers);
		
		
		int[] layers2 = {4};
		renderer.render(layers2);

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
