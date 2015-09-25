/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tourdefranceproject;

/**
 *
 * @author x13112406  Navjot Singh Virk
 */
public class DescriptionOfProducts {
    
    //here t is for denoting shop by team product description
    String t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12;
    //here b stands for description of best seller products
    String b1, b2, b3, b4, b5;
    //here r stands for description of best recommanded products
    String r1, r2, r3, r4;
    //here  stands for description of best most wanted products
    String m1, m2, m3, m4, m5;
    
    public DescriptionOfProducts(){
        // using html to properly display text in JLabel
     t1 = "<html>Team Sky Replica Jersey - Womens <br> \n"  +
"Women’s cycling jersey in stylish Team Sky livery.A replica of <br>the jersey worn on the Pro Tour by the world’s leading pro team. \n" +
"The jersey is made from a breathable performance fabric which wicks moisture <br>and has an anti-bacterial treatment.<html>";   
     t2 = "<html>Garmin Official jersey<br> Material: 100% Polyester </html>";
     t3 = "<html>Bib Shorts by the official team equipment supplier in <br>state-of-the-art team design made from elastic functional lycra. Brace<br> construction made from breathable mesh with small pocket. Anatomic <br>multi-panel cut.Ergonomic seat pad. Elastic silicone leg grippers.\n" +
"<br>Material: 83% Polyamide, 17% Elasthane</html>";
     t4 = "<html>Short Sleeve Jersey by the official team equipment supplier in <br>state-of-the-art team design made from breathable and moisture <br>absorbing functional material. Full length front zip.<br> Three compartment rear pocket. Elastic hem and cuffs.\n" +
"<br>Material: 100% Polyester</html>";
     t5 = "<html> Mondiala Replica Team Jersey<br>Short Sleeve Jersey by the official team equipment supplier in <br>state-of-the-art team design made from breathable and moisture <br>absorbing functional material. <br> Three compartment rear pocket. Elastic hem and cuffs.\n" +
"<br>Material: 100% Polyester</html>";
     t6 = "<html> Bib Shorts by the official team equipment supplier in state<br>-of-the-art team design made from elastic, muscle-supporting Eclipse fiber <br>with UV protection. Brace construction made from breathable mesh. <br>Anatomic multi-panel cut. Ergonomic seat pad.<br> Elastic leg grippers.\n" +
"<br><br>Material: 82% Polyester, 18% Elasthane</html>";
     t7 = "<html> Cap by the official team equipment supplier in state-of-the-art<br> team design.\n" +
"Material: 65% cotton , 35% polyester.\n" +
"<br>One size.</html>";
     t8 = "<html>Short Sleeve Jersey by the official team equipment supplier in state<br>-of-the-art team design made from breathable and moisture absorbing <br>functional material </html>";
     t9 = "<html> Orica GreenEdge Team Mitts Gloves</html>";
     t10 = "<html> Official Bib shorts <br>Leg hems made from siliconized elastic strap.<br> Body-mapped, seamless, 3-layer Performance pad.\n" +
"<br><br>Material: 80% Polyamide, 20% Elastane</html>";
     t11 = "<html>Short Sleeve Jersey by the official team equipment supplier in state<br>-of-the-art team design made from breathable and moisture absorbing Summertime <br>Microfibre. Short front zip. Three compartment rear pocket. Elastic hem.\n" +
"<br><br>Material: 100% Polyeste </html>";
     t12 = "<html>Podium Cap of the official team supplier in up to date,<br> embroidered team design in elastic cotton structure material.<br> Adjustable width.Material: 100% cotton.</html>";
     
    // know the description of Bestseller products
     b1="<html>The Le Coq Sportif Abutilon t-shirt is a great homage to cycling! <br>The Le Coq Sportif Abutilon t-shirt features real photos taken during<br> the historic Eroica cycling race, transfer-printed with \"glossy\"<br> texture, for a successful, authentic vintage twist. <br>Three cheers for cycling - <br>A nice nod to the sport by Le Coq Sportif! \n" +
"The Le Coq Sportif Abutilon t-shirt is made of 100% cotton for 140g.</html>";
     b2="<html>Oakley Limited Edition Fathom Racing Jacket Sunglasses- pacific <br>blue/black iridium vented & <br>clear vented</html>";
     b3="<html>The Le Coq Sportif Orobranche t-shirt pays homage to cycling.<br> The Le Coq Sportif Orobranche is printed with a bicycle which gives<br> an authentic urban style</html>";
     b4="<html>The Le Coq Sportif Mahonia t-shirt  is made of <br>100% cotton / 140g</html>";
     b5="<html>For fans, this cap takes on the emblematic codes of cycling.<br> The round-shaped, elasticated cap has a mini visor.<br> \n" +
"Turn the visor up if you like.\n" +
"<br>100% cotton.</html>";
    
    // know the description of recommanded products
     r1="<html>Le Tour de France by Le Coq Sportif Replica Jersey - Yellow - Junior</html>";
     r2="<html>EartH T-shirt Black<br> 100% Cotton.</html>";
     r3="<html>Tour De France Official Towel.</html>";
     r4="<html>Tour De France Pink T-shirt - Women</html>";
    
    //at last the description of wanted products
     m1="<html> Le Tour de France PVC Mug</html>";
     m2="<html>Ending its refined contours to the Tour de France colours,<br> the Saint Malo model reveals original design.<br> Material: Canvas</html>";
     m3="<html>Tour de France official keyring in the winner colours.<br> Personalise your passion!</html>";
     m4="<html>Tour de France official keyring in the winner colours. <br>Personalise your passion!</html>";
     m5="<html>A take on the typical stripe that decorates the front of <br>cycling jerseys, this cotton T-shirt is available in sports colours.<br> It promotes passion and support for the most watched cycling race in <br>the world, linking it to le coq sportif in a play on graphics with hints <br>of retro.\n" +
"Material: 100% cotton.</html>";
    }
    

    public String getT1() {
        return t1;
    }

    public String getT2() {
        return t2;
    }

    public String getT3() {
        return t3;
    }

    public String getT4() {
        return t4;
    }

    public String getT5() {
        return t5;
    }

    public String getT6() {
        return t6;
    }

    public String getT7() {
        return t7;
    }

    public String getT8() {
        return t8;
    }

    public String getT9() {
        return t9;
    }

    public String getT10() {
        return t10;
    }

    public String getT11() {
        return t11;
    }

    public String getT12() {
        return t12;
    }

    public String getB1() {
        return b1;
    }

    public String getB2() {
        return b2;
    }

    public String getB3() {
        return b3;
    }

    public String getB4() {
        return b4;
    }

    public String getB5() {
        return b5;
    }

    public String getR1() {
        return r1;
    }

    public String getR2() {
        return r2;
    }

    public String getR3() {
        return r3;
    }

    public String getR4() {
        return r4;
    }

    public String getM1() {
        return m1;
    }

    public String getM2() {
        return m2;
    }

    public String getM3() {
        return m3;
    }

    public String getM4() {
        return m4;
    }

    public String getM5() {
        return m5;
    }
    
}
