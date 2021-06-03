/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Edmund Johnson V
 */

/*
Create a program that walks the user through troubleshooting issues with a car. Use the following decision tree to build the system:

@startuml
if (Is the car silent when you turn the key?) then (yes)
    if (Are the battery terminals corroded?) then (yes)
        :Clean terminals and try starting again.;
        stop
    else (no)
        :Replace cables and try again.;
        stop
    endif
else (no)
    if (Does the car make a slicking noise?) then (yes)
        :Replace the battery.;
        stop
    else (no)
        if (Does the car crank up but fail to start?) then (yes)
            :Check spark plug connections.;
            stop
        else (no)
            if (Does the engine start and then die?) then (yes)
                if (Does you car have fuel injection?) then (yes)
                    :Get it in for service.;
                    stop
                else (no)
                    :Check to ensure the choke is opening and closing.;
                    stop
                endif
            else (no)
                :This should not be possible.;
                stop
            endif
        endif
    endif
endif
@enduml
Example Output
Is the car silent when you turn the key? y
Are the battery terminals corroded? n
The battery cables may be damaged.
Replace cables and try again.
Constraint
Ask only questions that are relevant to the situation and to the previous answers. Don’t ask for all inputs at once.
 */

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] arg){
        System.out.print("Is the car silent when you turn the key? ");
        String a = in.nextLine();
        if(a.equals("y")){
            System.out.print("Are the battery terminals corroded? ");
            String b = in.nextLine();
            if(b.equals("y")){
                System.out.println("Clean terminals and try starting again.");
                System.exit(0);
            }
            else{
                System.out.println("Replace cables and try again.");
                System.exit(0);
            }
        }
        else{
            System.out.print("Does the car make a slicking noise? ");
            String c = in.nextLine();
            if(c.equals("y")){
                System.out.println("Replace the battery.");
                System.exit(0);
            }
            else{
                System.out.print("Does the car crank up but fail to start? ");
                String d = in.nextLine();
                if(d.equals("y")){
                    System.out.println("Check spark plug connections.");
                    System.exit(0);
                }
                else{
                    System.out.print("Does the engine start and then die? ");
                    String e = in.nextLine();
                    if(e.equals("y")){
                        System.out.print("Does you car have fuel injection? ");
                        String f = in.nextLine();
                        if(f.equals("y")){
                            System.out.println("Get it in for service.");
                            System.exit(0);
                        }
                        else{
                            System.out.println("Check to ensure the choke is opening and closing.");
                            System.exit(0);
                        }
                    }
                    else{
                        System.out.println("This should not be possible.");
                        System.exit(0);
                    }
                }
            }
        }
    }
}
