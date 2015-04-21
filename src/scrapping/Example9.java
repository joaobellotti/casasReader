package scrapping;

import com.jaunt.*;
import com.jaunt.component.*;
import java.util.List;

public class Example9{
  public static void main(String[] args){
    try{ 
      UserAgent userAgent = new UserAgent(); 
      userAgent.visit("http://www.wimoveis.com.br/df/brasilia/apartamento/aluguel?busca=galeria&quarto=todos&o=F&planta=1&pronto=1");
   
      Elements elements = userAgent.doc.findEvery("<div>");              //find all divs in the document
      System.out.println(elements.getElement(1).innerHTML());
      System.out.println("Every div: " + elements.size() + " results");  //report number of search results.
   
      elements = userAgent.doc.findEach("<div>");                        //find all non-nested divs
      System.out.println("Each div: " + elements.size() + " results");   //report number of search results.
                                                                         //find non-nested divs within <p class='meat'>
      elements = userAgent.doc.findFirst("<div id=\"ctl00_Resultado_ResultadoGaleriaUC1_rptBusca_ct").findEach("<div>"); 
      System.out.println("Meat search: " + elements.size() + " results");//report number of search results.
    }
    catch(JauntException e){                          
      System.out.println(e);
    }    
  }
}