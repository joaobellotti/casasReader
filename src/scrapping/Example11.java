package scrapping;

import com.jaunt.Element;
import com.jaunt.Elements;
import com.jaunt.NotFound;
import com.jaunt.ResponseException;
import com.jaunt.UserAgent;

public class Example11{
  public static void main(String[] args) throws NotFound{
    try{ 
      UserAgent userAgent = new UserAgent();  
      userAgent.visit("http://www.wimoveis.com.br/df/brasilia/apartamento/aluguel?busca=galeria&quarto=todos&o=F&planta=1&pronto=1");

      Elements elements = userAgent.doc.findEvery("<div|span>");      //find every element who's tagname is div or span.
    //  System.out.println("search results:\n" + elements.innerHTML()); //print the search results

      elements = userAgent.doc.findEvery("<p id=1|4>");               //find every p element who's id is 1 or 4
    //  System.out.println("search results:\n" + elements.innerHTML()); //print the search results

      elements = userAgent.doc.findEvery("<div class=listagem_foto>");              //find every element (any name) with id from 2-6
      
      for(Element el : elements.getChildElements()){
    	  System.out.println(el.getElement(0).getElement(0));
      }
      System.out.println("search results:\n" + elements.innerHTML()); //print the search results
  //<div id=\"ctl00_Resultado_ResultadoGaleriaUC1_rptBusca_ct
      elements = userAgent.doc.findEvery("&lt;p>ho");      //find every p who's joined child text contains 'ho' (regex) 
   //   System.out.println("search results:\n" + elements.innerHTML()); //print the search results
    }
    catch(ResponseException e){                          
      System.out.println(e);
    }
  }
}