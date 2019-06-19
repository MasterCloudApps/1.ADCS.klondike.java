package klondike.views.console.menu;

import klondike.controllers.StartController;
import klondike.utils.Menu;

class GameSelectMenu extends Menu {

    GameSelectMenu(StartController startController) {
        String[] gamesNames = startController.getGamesNames();
        for (String title : gamesNames) {
            this.addCommand(new GameSelectCommand(title, startController));
        }
    }

}
