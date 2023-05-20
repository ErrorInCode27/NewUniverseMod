package newuniverse;

import arc.*;
import arc.util.*;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import newuniverse.content.NewUniversePlanets;

public class NewUniverseMod extends Mod{

    public NewUniverseMod(){
        Log.info("Loaded New Universe constructor.");
    }

    @Override
    public void loadContent(){
        Log.info("Loading New Universe planets...");
        NewUniversePlanets.load();
    }

}
