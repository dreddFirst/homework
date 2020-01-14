
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author treba
 */

public class FirstPro 
{
    public static void main(String[] args)
    {
        try{
           
        
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            
            
            
            Document document = builder.parse("/home/treba/Документы/homework/Individual_Project/Millionaire/src/main/java/questionspackage/q1.xml");
            
            document.getDocumentElement().normalize();
            
            NodeList nodeList = document.getElementsByTagName("questions");
            
            Node q = nodeList.item(0); 
            Node a = nodeList.item(0);
            
            if (Node.ELEMENT_NODE == q.getNodeType()) { 
                Element eq = (Element) q;
             
            System.out.println(eq.getElementsByTagName("q"+1).item(0).getTextContent());
            }
            
            if (Node.ELEMENT_NODE == a.getNodeType()) { 
                Element ea = (Element) a;
             
            System.out.println(ea.getElementsByTagName("a"+1).item(0).getTextContent());
            }
            }catch(Exception e){
            
        }
    }
}
