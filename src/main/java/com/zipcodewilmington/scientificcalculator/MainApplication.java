package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a double", d);
    }


public static void showOption() {
        System.out.println("0.  clear display");
        System.out.println("1.  add");
        System.out.println("2.  subtract");
        System.out.println("3.  multiply");
        System.out.println("4.  division");
        System.out.println("5.  square");
        System.out.println("6.  square root");
        System.out.println("7.  inverse");
        System.out.println("8.  switch sign");
        System.out.println("9.  sine");
        System.out.println("10. cosine");
        System.out.println("11. tangent");
        System.out.println("12. inverse sine");
        System.out.println("13. inverse cosine");
        System.out.println("14. inverse tangent");
        System.out.println("15. factorial");
        System.out.println("16. switch display mode");
        System.out.println("17. switch units mode");
        System.out.println("18. memory functions");
        System.out.println("19. calculate percent of number");
        System.out.println("20. decimal to percent");
        System.out.println("21. exit");
    }


public static void runOption(Integer option, CoreFeatures cfcalc, ScientificCalculator sCalc) {
    
    Double userinput;

    boolean isdiplayval = cfcalc.getDisplayvalue() != 0.0;


    switch (option) {
        case 0:
            cfcalc.clearDisplay();
            cfcalc.setDisplay(0.0);
            break;
        case 1:
             if (!isdiplayval) {
                userinput = Console.getDoubleInput("Enter a number");
                cfcalc.setDisplay(userinput);
            }
            userinput = Console.getDoubleInput("Enter a number to add");
            cfcalc.add(userinput);
            System.out.println("= " + outputConverter(sCalc, cfcalc.getDisplayvalue()));
            break;
        case 2: 
            if (!isdiplayval) {
                userinput = Console.getDoubleInput("Enter a number");
                cfcalc.setDisplay(userinput);
        }
        userinput = Console.getDoubleInput("Enter a number to add");
        cfcalc.add(userinput);
        System.out.println("= + outputConverter(sCalc, cfcalc.getDisplayvalue())");
            break;
        case 3:
             if (!isdiplayval) {
                userinput = Console.getDoubleInput("Enter a number");
                cfcalc.setDisplay(userinput);
            }
            userinput = Console.getDoubleInput("Enter a number to multiply");
            cfcalc.multiply(userinput);
            System.out.println("= " + outputConverter(sCalc, cfcalc.getDisplayvalue()));
            break;
        case 4:
             if (!isdiplayval) {
                userinput = Console.getDoubleInput("Enter a number");
                cfcalc.setDisplay(userinput);
            }
            userinput = Console.getDoubleInput("Enter a number to divide");
            cfcalc.divide(userinput);
            System.out.println("= " + outputConverter(sCalc, cfcalc.getDisplayvalue()));
            break;
        case 5:
            if (!isdiplayval) {
                userinput = Console.getDoubleInput("Enter a number");
                cfcalc.setDisplay(userinput);
            }
            cfcalc.square();
            System.out.println("= " + outputConverter(sCalc, cfcalc.getDisplayvalue()));
            break;
        case 6:
            if (!isdiplayval) {
                userinput = Console.getDoubleInput("Enter a number");
                cfcalc.setDisplay(userinput);
            }
            cfcalc.squareRoot();
            System.out.println("= " + outputConverter(sCalc, cfcalc.getDisplayvalue()));
            break;
        case 7:
            if (!isdiplayval) {
                userinput = Console.getDoubleInput("Enter a number");
                cfcalc.setDisplay(userinput);
            }
            cfcalc.inverse();                                          
            System.out.println("= " + outputConverter(sCalc, cfcalc.getDisplayvalue()));
            break;
        case 8:
            if (!isdiplayval) {
                userinput = Console.getDoubleInput("Enter a number");
                cfcalc.setDisplay(userinput);
            }
            cfcalc.inverseSign();
            System.out.println("= " + outputConverter(sCalc, cfcalc.getDisplayvalue()));
            break;
        case 9:
            if (!isdiplayval) {
                userinput = Console.getDoubleInput("Enter a number");
                cfcalc.setDisplay(userinput);
            }
            System.out.println("sine(" + (cfcalc.getDisplayvalue() + ") = " + outputConverter(sCalc, cfcalc.sine(cfcalc.getDisplayvalue()))));
            break;
        case 10:
        if (!isdiplayval) {
                    userinput = Console.getDoubleInput("Enter a number to get cosine of: ");
                    cfcalc.setDisplay(userinput);
                }
                System.out.println("cosine(" + cfcalc.getDisplayValue() + ")= "
                        + outputConverter(sCalc, sCalc.cosine(cfcalc.getDisplayValue())));
                break;
            case 11:
                if (!isdiplayval) {
                    userinput = Console.getDoubleInput("Enter a number to get tangent of: ");
                    cfcalc.setDisplay(userinput);
                }
                System.out.println("tangent(" + cfcalc.getDisplayValue() + ")= "
                        + outputConverter(sCalc, sCalc.tangent(cfcalc.getDisplayValue())));
                break;
            case 12:
                if (!isdiplayval) {
                    userinput = Console.getDoubleInput("Enter a number to get inverse sine of: ");
                    cfcalc.setDisplay(userinput);
                }
                System.out.println("inverse sine(" + cfcalc.getDisplayValue() + ")= "
                        + outputConverter(sCalc, sCalc.inverseSine(cfcalc.getDisplayValue())));
                break;
            case 13:
                if (!isdiplayval) {
                    userinput = Console.getDoubleInput("Enter a number to get inverse cosine of: ");
                    cfcalc.setDisplay(userinput);
                }
                System.out.println("inverse cosine(" + cfcalc.getDisplayValue() + ")= "
                        + outputConverter(sCalc, sCalc.inverseCosine(cfcalc.getDisplayValue())));
                break;
            case 14:
                if (!isdiplayval) {
                    userinput = Console.getDoubleInput("Enter a number: enter a number to get inverse tangent of ");
                    cfcalc.setDisplay(userinput);
                }
                System.out.println("inverse tangent(" + cfcalc.getDisplayValue() + ")= "
                        + outputConverter(sCalc, sCalc.inverseTangent(cfcalc.getDisplayValue())));
                break;
            case 15:
                if (!isdiplayval) {
                    userinput = Console.getDoubleInput("Enter a number to do factorial on: ");
                    cfcalc.setDisplay(userinput);
                }
                System.out.println("factorial(" + cfcalc.getDisplayValue() + ")= "
                        + outputConverter(sCalc, sCalc.factorial(cfcalc.getDisplayValue())));
                break;
            case 16:
                String temp = "";
                temp = Console.getStringInput(
                        "type an option or click enter for auto next (decimal, hexadecimal, binary, octal): ");
                if (temp.isEmpty())
                    sCalc.switchDisplayMode();
                else
                    sCalc.switchDisplayMode(temp);

                break;
            case 17:
                String temp2 = "";
                temp2 = Console.getStringInput("type an option or click enter for auto next (radians, degree): ");
                if (temp2.isEmpty())
                    sCalc.switchUnitsMode();
                else
                    sCalc.switchUnitsMode(temp2);
                break;
            case 18:
                int x = Console.getIntegerInput(
                        "Memmory options:\n1.Add a number to memmory\n2.Reset memmory\n3.Recall from memmory\nChoose an option: ");
                switch (x) {
                    case 1:
                        userinput = Console.getDoubleInput("Enter an number to add to memory: ");
                        sCalc.memmoryFunctions(userinput, "m+");
                        break;
                    case 2:
                        sCalc.memmoryFunctions(x, "mc");
                        break;
                    case 3:
                        sCalc.memmoryFunctions(x, "mrc");
                        cfcalc.setDisplay(sCalc.mrc());
                        break;
                    default:
                        break;
                }
                break;
            case 19:
                if (!isdiplayval) {
                    userinput = Console.getDoubleInput("Enter a number: ");
                    cfcalc.setDisplay(userinput);
                }
                userinput = Console.getDoubleInput("Enter a number to see what percent of " + cfcalc.getDisplayValue() + " it is : ");
                cfcalc.percentage(userinput);
                System.out.println("= "+ cfcalc.getDisplayValue()+"%");

            case 20:
                if (!isdiplayval) {
                    userinput = Console.getDoubleInput("Enter a decimal to turn to percent: ");
                    cfcalc.setDisplay(userinput);
                }
                cfcalc.decimalToPercentage();
                System.out.println("= "+ cfcalc.getDisplayValue()+"%");
            default:

                break;
        }
    }
}