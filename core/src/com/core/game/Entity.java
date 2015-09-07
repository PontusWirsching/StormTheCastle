package com.core.game;

import java.io.IOException;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.XmlReader;
import com.badlogic.gdx.utils.XmlReader.Element;

/**
 * An entity represents a game object it extends the sprite class.
 *
 * @author Mike McEnery
 * @since 2015-08-29
 *
 */
public class Entity extends Sprite {
	public Entity(final String entityKey){
		super();
		//Get texture sheet by parsing the xml
		final String entityTexturePath = this.retrieveEntityPropertiesFromUnitDefinitionsFile(entityKey);
		final Texture entityTexture = new Texture(entityTexturePath);
		super.set(new Sprite(entityTexture));
	}

	/*
	 * Currently retrieves the texture of for the entity of a specified key, but will later setup the entity itself
	 */
	private String retrieveEntityPropertiesFromUnitDefinitionsFile(final String entityKey){
		final XmlReader reader = new XmlReader();
		Element root = null;
		try {
			root = reader.parse(Gdx.files.internal("config/UnitDefinitions.xml"));
		} catch (final IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		final Array<Element> items = root.getChildrenByName("Unit");
		for (final Element child : items)
		{
			if(child.get("type").equalsIgnoreCase(entityKey))
				return child.get("texture");
		}

		return "";
	}
}
