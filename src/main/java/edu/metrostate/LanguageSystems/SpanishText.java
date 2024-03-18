package edu.metrostate.LanguageSystems;

import java.util.HashMap;

public class SpanishText {
    public HashMap<String,String> SpanishMap(){
        HashMap<String,String> loadedMap = new HashMap<String,String>();
        loadedMap.put("default","Error: este mensaje no se encontró; comuníquese con el desarrollador.");
        //Main Menu
        loadedMap.put("mainmenu.buttons.profile","Perfill");
        loadedMap.put("mainmenu.buttons.workout","Agregar entrenamiento");
        loadedMap.put("mainmenu.buttons.goal","Agregar objetivo");
        loadedMap.put("mainmenu.buttons.exit","Salida");
        loadedMap.put("mainmenu.buttons.viewgraph", "Ver gráficos");
        //Settings
        loadedMap.put("settingsbar.button.language","Idioma");
        loadedMap.put("settingsbar.button.theme","Tema");
        return loadedMap;
    }
}
