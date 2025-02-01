package calamity;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class CalamityMod extends Mod{

    public CalamityMod(){
        Log.info("Loaded ExampleJavaMod constructor.");

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("WARNING!!!");
                dialog.cont.image(Core.atlas.find("calamity-sancho)).pad(15f).row();
                dialog.cont.add("This mod is currently under development").row();
                dialog.cont.add("[red]Expect from small unharmful bugs to some game breakinng glithces").row();
                dialog.cont.button("Continue", dialog::hide).size(125f, 50f);
                dialog.show();
            });
        });
    }

    @Override
    public void loadContent(){
        Log.info("Loading Some Files.");
    }

}
