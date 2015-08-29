package com.core.game.level;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class LevelHandler {

	/**
	 * An ArrayList that holds all added screens.
	 */
	public static ArrayList<Level> levels = new ArrayList<Level>();
	
	/**
	 * This is the index of the current selected level. <br>
	 */
	public static int selected = 0;
	
	/**
	 * Adds a screen to the array list.
	 */
	public static void addLevel(Level screen) {
		levels.add(screen);
	}
	
	/**
	 * Sets the selected index to whatever level is desired. <br>
	 */
	public static void setLevel(int index) {
		selected = index;
	}
	
	/**
	 * Sets the selected index using the name of the chosen level. <br>
	 */
	public static void setLevel(String name) {
		for (Level level : levels) {
			if (level.getName().equalsIgnoreCase(name))
				selected = levels.indexOf(level);
		}
	}
	
	/**
	 * Returns a level instance by its index. <br>
	 */
	public static Level getLevel(int index) {
		return levels.get(index);
	}
	
	/**
	 * Returns a level instance by its name. <br>
	 */
	public static Level getLevel(String name) {
		for (Level level : levels) {
			if (level.getName().equalsIgnoreCase(name))
				return level;
		}
		return null;
	}

	/**
	 * Returns the selected level instance.
	 */
	public static Level getSelected() {
		return levels.get(selected);
	}
	
	/**
	 * Calls the render method in the selected level.
	 */
	public static void render(SpriteBatch sb, ShapeRenderer sr) {
		getSelected().render(Gdx.graphics.getDeltaTime(), sb, sr);
	}
	
}
