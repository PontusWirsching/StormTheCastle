package com.core.game;

import com.core.Config;
import com.core.graphics.Screen;
import com.core.resources.Resources;

public class Menu extends Screen {

	public Menu(String name) {
		super(name);
	}

	@Override
	public void render(float delta) {
		super.render(delta);

		sb.begin();
		{
			sb.draw(Resources.get("gui:button:exit:nopress"), -314 / 2, -Config.HEIGHT / 2 + 20);
		}
		sb.end();

	}

}
