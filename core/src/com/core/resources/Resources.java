package com.core.resources;

import java.util.HashMap;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.XmlReader;
import com.badlogic.gdx.utils.XmlReader.Element;

public class Resources {

	public static HashMap<String, TextureRegion> textures = new HashMap<String, TextureRegion>();
	
	public static TextureRegion get(String name) {
		return textures.get(name);
	}
	
	/**
	 * Will load a spritesheet (.png) and the data sheet (.xml)
	 */
	public static void load(String name) {
		try {
			String dataSheet = name + ".xml";
			String imageSheet = name + ".png";
			
			Texture imageFile = new Texture(imageSheet);
			
			XmlReader reader = new XmlReader();
			Element root = reader.parse(Gdx.files.internal(dataSheet));
			
			Array<Element> sprites = root.getChildrenByName("Sprite");
			
			for (Element e : sprites) {
				String n = e.get("name");
				int x = Integer.parseInt(e.get("x"));
				int y = Integer.parseInt(e.get("y"));
				int width = Integer.parseInt(e.get("width"));
				int height = Integer.parseInt(e.get("height"));
				put(n, new TextureRegion(imageFile, x, y, width, height));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void put(String key, TextureRegion texture) {
		textures.put(key, texture);
	}
			
}
