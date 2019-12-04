
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author treba
 */
public class NewClass 
{
    static int nota;
    public static void main(String... str)
    {System.out.println("Introduceti nota: ");
        
        Scanner sc = new Scanner(System.in);
        nota = sc.nextInt();
        switch(nota)
        {
            case 0:
                case 1:
                    case 2:
                        case 3:
                            case 4:
                            {
                                System.out.println("Fail!");
                                break;
                            }
            case 5: System.out.println("Approved."); break;
            case 6: System.out.println("Good."); break;
            case 7:
                case 8:
                {
                    System.out.println("Very good!");
                    break;
                }
            case 9:
                case 10:
                {
                    System.out.println("I`m proud of you!");
                    break;
                }
        }
    }
}
