/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.software2_4.Resturant_list;

/**
 *
 * @author tlatl
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ResturantComponent koreaResturant = new Menu("한식");
        ResturantComponent resturant1 = new Menu("식당1");
        ResturantComponent resturant2 = new Menu("식당2");
        ResturantComponent menu = new Menu("메뉴");
//        ResturantComponent chieneseResturant = new Menu("중식");
//        ResturantComponent westernResturant = new Menu("양식");
//        ResturantComponent japaneseResturant = new Menu("일식");

        createKoreaResturant(resturant1, resturant2);
//        createChieneseResturant(chieneseResturant);
//        createWesternResturant(westernResturant);
//        createJapaneseResturant(japaneseResturant);
        
        
        koreaResturant.add(resturant1);
        koreaResturant.add(resturant2);
//      chieneseResturant.add(menuResturant);

        createMenu(menu);
        resturant1.add(menu);
        resturant2.add(menu);
        

        Waitress waitress = new Waitress(koreaResturant);
        waitress.printResturant();

    }
    
    private static void createKoreaResturant(ResturantComponent resturant1, ResturantComponent resturant2) {
        resturant1.add(new ResturantItem("한식1"));
        resturant2.add(new ResturantItem("한식2"));
    }
    
//    private static void createChieneseResturant(ResturantComponent chieneseResturant) {
//        chieneseResturant.add(new ResturantItem("중식1"));
//        chieneseResturant.add(new ResturantItem("중식2"));
//    }
//    
//    private static void createWesternResturant(ResturantComponent westernResturant) {
//        westernResturant.add(new ResturantItem("양식1"));
//        westernResturant.add(new ResturantItem("양식2"));
//    }
//    
//    private static void createJapaneseResturant(ResturantComponent japaneseResturant) {
//        japaneseResturant.add(new ResturantItem("일식1"));
//        japaneseResturant.add(new ResturantItem("일식2"));
//    }

    private static void createMenu(ResturantComponent menu) {
        menu.add(new ResturantItem("디저트 1"));
        menu.add(new ResturantItem("디저트 2"));
    }
    
    
}
