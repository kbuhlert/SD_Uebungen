package Command_TV_2_Training;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Fernbedienung {
    private Command aktuellerCommand;
    private Map<Integer, Command> knoepfe = new HashMap<>();
    private Stack<Command> historie = new Stack<>();


    //Fernbedienung nimmt Commands und deren Position entgegen
    public void setCommand(int position, Command k){
        if(!knoepfe.containsKey(position)){
            knoepfe.put(position,k);
        }

    }

    //Fernbedienung führt Command aus
    public void execute(int position){
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Zahl von 1 - 5 eingeben");
        int position = scan.nextInt();
        if(!knoepfe.containsKey(position) || !(position>0 && position<6)){
            System.out.println("Eingabe inkorrekt");
        }
        else {
            aktuellerCommand = knoepfe.get(position);
        }*/

        if(knoepfe.containsKey(position)){
            aktuellerCommand = knoepfe.get(position);
        }

        aktuellerCommand.execute();
        historie.push(aktuellerCommand);   //Command wird oben auf den Stack gelegt, wenn command rückgängig gemacht werden soll werden sie nacheinander vom Stack geholt
    }

    public void zurueck(){
        aktuellerCommand = historie.pop();
        aktuellerCommand.undo();
    }
}
