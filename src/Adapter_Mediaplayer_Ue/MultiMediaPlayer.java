package Adapter_Mediaplayer_Ue;

import java.util.HashMap;

public class MultiMediaPlayer {

    private HashMap<String, IPlayer> formatmap;

    public void registerFormat(String format, IPlayer player){
        formatmap.put(format, player);
    };

    public void play(String format, String file){
        if (formatmap.containsKey(format)){
            IPlayer suitedPlayer = formatmap.get(format);
        }

    };

}
