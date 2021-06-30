package Logic;

public class IA {
    private  String[] keyWords = {"Population", "population", "poplation", "Poplation", "greenhouse", "gases", "Greenhouse", "Gases", "gaces", "Gaces", "Greenhouse Gases", "cropped", "area", "Cropped", "Area", "croped", "Croped", "Cropped Area"};
    private String respuesta;
    private int numWord;
    private String[] res = new String[10];
    private int i = 0;
    
    public String getRespuesta(){
        return respuesta;
    }
    
    public void setRespuesta(String r){
        respuesta = r;
    }
    
    public String getRes(int i){
        return res[i];
    }
    
    public int getI(){
        return i;
    }
    
    public void setI(int g){
        i = g;
    }
    
    public boolean recorrerKeyWords(){
        boolean hay = false;
        numWord = -1;
        for(int i = 0; i < keyWords.length; i++){
            numWord++;
            if(respuesta.contains(keyWords[numWord])){
               hay = true;
               break;
            }
        }
        if(hay == false){
            numWord = -1;
        }
        return hay;
    }
    
    public void respuestaBot(){
        for(int i = 0; i < res.length; i++){
            res[i] = "I'm sorry. I didn't undertand you.";
        }
        switch(numWord){
            case 0: case 1: case 2: case 3:
                res[0] = "It is true that the distribution of the worldwide population\nis completely uneven.\nThere may be packed, dense populated\nareas as well as ones with almost\nno human beings. This might be largely due to\nseveral factors such as living standards,\nquality of facilities, climatic conditions,\namong others…\n\n Do you want to know more about it? (Yes/No) \n\n\n\n\nhttps://eodashboard.org/?poi=W6-NASAPopulation&country=BE";
                res[1] = "Let’s go over the northern hemispheres…\nWhich colours can be seen?\nAlthough there indeed are some people\nliving in Alaska and Canada, it is far more\ndifferent to what we can find in South Asian\ncountries, right?\nAreas like India and China are darker\nthan near the Poles.\n\nThen, Europe is flocked with people whereas\nAustralia is almost empty (? As it\ncan be seen, there is a wide variety of distribution.\n\n Do you want to know more about it? (Yes/No)";
                res[2] = "OH right over that light coloured spot is nothing\nless than the Sahara Desert, where\nscorching high temperatures can be reached in summer,\nmaking it very hard to live and survive\n(as there is little water supplies).";
                break;
            case 4: case 5: case 6: case 7: case 8: case 9: case 10:
                res[0] = "Ok, let’s start with the basics.\nWhat are greenhouse gases?\nIt is any gas that has the property of absorbing\ninfrared radiation (net heat energy) emitted\nfrom Earth’s surface and reradiating it back\nto Earth’s surface (contributing to the greenhouse effect.\nSome examples of this are emissions of\nCarbon dioxide, methane, and nitrogen.\n\n Do you want to know more about it? (Yes/No)";
                res[1] = "These gases are released in several daily processes:\ncar fumes, fossil fuel combustion in order to\nobtain energy, sprays (aerosols), among others...\n\n Do you want to know more about it? (Yes/No)";
                res[2] = "Despite these processes being already\nincorporated into our daily lives, it cannot be\nignored that excess of these emissions are\nleading to our current rapid\nincrease of global climate change.\n\n Do you want to know more about it? (Yes/No)";
                res[3] = "Look at the indicator…\nThe more blue the zone is, the less CO2 emissions are.\nHowever, the reddish areas can be found in\nthe northern hemisphere rather than in the south.\nThis can be principally due to countries'\ndevelopment and industrialisation. \n\n\n\n\nhttps://eodashboard.org/?poi=W4-N2";
                break;
            case 11: case 12: case 13: case 14: case 15: case 16: case 17:
                res[0] = "Firstly, it is totally out of discussion\nthat some areas are not that adapted to have\ncrops grown, right? I mean…\nwe won’t try to grow wheat on top of a mountain\nhahaha.\nSuitable areas for growing crops are definitely\nthose near nutrient-rich grasslands and near\npotable water supplies such as rice at wetlands.\nSo crops tend to be grown near coastal places\n(or in river banks) but inland fields are\npossible due to them being well irrigated. \n\n\n\n\nhttps://eodashboard.org/?poi=W6-N6";
                break;
        }       
    }
    
    public void incrementoI(){
        i++;
    }
    
    public String masInfo(){        
        String info = null;
        if(respuesta.equals("yes") || respuesta.contains("Yes") || respuesta.equals("YES")){
            info = res[i];
        }else{
            info = "";
        }
        return info;
    }
}
