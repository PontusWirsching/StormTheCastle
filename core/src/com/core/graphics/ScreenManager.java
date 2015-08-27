package com.core.graphics;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;

/**
 * The ScreenManager will manage all of the different screens we will have. <br>
 * 
 * 
 * @author Pontus Wirsching
 * @since 2015-08-27
 */
public class ScreenManager {

	/**
	 * An ArrayList that holds all added levels.
	 */
	public static ArrayList<Screen> screens = new ArrayList<Screen>();
	
	/**
	 * This is the index of the current selected screen. <br>
	 */
	public static int selected = 0;
	
	/**
	 * This method will resize the selected screen.
	 */
	public static void resize(int width, int height) {
		getSelected().resize(width, height);
	}
	
	/**
	 * Adds a screen to the array list.
	 */
	public static void addScreen(Screen screen) {
		screens.add(screen);
	}
	
	/**
	 * Sets the selected index to whatever screen is desired. <br>
	 */
	public static void setScreen(int index) {
		selected = index;
	}
	
	/**
	 * Sets the selected index using the name of the chosen screen. <br>
	 */
	public static void setScreen(String name) {
		for (Screen screen : screens) {
			if (screen.getName().equalsIgnoreCase(name))
				selected = screens.indexOf(screen);
		}
	}
	
	/**
	 * Returns a screen instance by its index. <br>
	 */
	public static Screen getScreen(int index) {
		return screens.get(index);
	}
	
	/**
	 * Returns a screen instance by its name. <br>
	 */
	public static Screen getScreen(String name) {
		for (Screen screen : screens) {
			if (screen.getName().equalsIgnoreCase(name))
				return screen;
		}
		return null;
	}

	/**
	 * Returns the selected screen instance.
	 */
	public static Screen getSelected() {
		return screens.get(selected);
	}
	
	/**
	 * Calls the render method in the selected screen.
	 */
	public static void render() {
		getSelected().render(Gdx.graphics.getDeltaTime());
	}
	
}
