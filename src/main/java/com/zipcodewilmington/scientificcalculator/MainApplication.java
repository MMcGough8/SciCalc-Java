package com.zipcodewilmington.scientificcalculator;


/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    public static void main(String[] args) {

        CoreFeatures coreCalc = new CoreFeatures();
        ScientificCalculator sciCalc = new ScientificCalculator();

        System.out.println("Welcome to Scientific Calculator");

        boolean keepRunning = true;
        while (keepRunning) {
            showOption();
            int option = Console.getIntegerInput("Please select an option: ");
            if (option == 21) {
                keepRunning = false;
                continue;
            }
            runOption(option, coreCalc, sciCalc);
        }
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

    public static String outputConverter(ScientificCalculator sciCalc, Double value) {
        String mode = sciCalc.getDisplayMode();

        switch (mode) {
        case "DEC":
            return String.valueOf(value);
            
        case "HEX":
            return Integer.toHexString(value.intValue()).toUpperCase();
            
        case "OCT":
            return Integer.toOctalString(value.intValue());
            
        case "BIN":
            return Integer.toBinaryString(value.intValue());
            
        default:
            return String.valueOf(value);
    }
}

public static void runOption(int option, CoreFeatures coreCalc, ScientificCalculator sciCalc) {

    Double userinput;

    boolean isdisplay = coreCalc.getDisplayValue() != 0.0;


    switch (option) {
        case 0:
            coreCalc.clearDisplay();
            coreCalc.setDisplay(0.0);
            break;
        case 1:
             if (!isdisplay) {
                userinput = Console.getDoubleInput("Enter a number");
                coreCalc.setDisplay(userinput);
            }
            userinput = Console.getDoubleInput("Enter a number to add");
            coreCalc.add (userinput);
            System.out.println("= " + outputConverter(sciCalc, coreCalc.getDisplayValue()));
            break;
        case 2: 
            if (!isdisplay) {
                userinput = Console.getDoubleInput("Enter a number");
                coreCalc.setDisplay(userinput);
        }
        userinput = Console.getDoubleInput("Enter a number to add");
        coreCalc.subtract (userinput);
        System.out.println("= " + outputConverter(sciCalc, coreCalc.getDisplayValue()));
            break;
        case 3:
             if (!isdisplay) {
                userinput = Console.getDoubleInput("Enter a number");
                coreCalc.setDisplay(userinput);
            }
            userinput = Console.getDoubleInput("Enter a number to multiply");
            coreCalc.multiply(userinput);
            System.out.println("= " + outputConverter(sciCalc, coreCalc.getDisplayValue()));
            break;
        case 4:
             if (!isdisplay) {
                userinput = Console.getDoubleInput("Enter a number");
                coreCalc.setDisplay(userinput);
            }
            userinput = Console.getDoubleInput("Enter a number to divide");
            coreCalc.divide(userinput);
            System.out.println("= " + outputConverter(sciCalc, coreCalc.getDisplayValue()));
            break;
        case 5:
            if (!isdisplay) {
                userinput = Console.getDoubleInput("Enter a number");
                coreCalc.setDisplay(userinput);
            }
            coreCalc.square();
            System.out.println("= " + outputConverter(sciCalc, coreCalc.getDisplayValue()));
            break;
        case 6:
            if (!isdisplay) {
                userinput = Console.getDoubleInput("Enter a number ");
                coreCalc.setDisplay(userinput );
            }
            coreCalc.squareRoot();
            System.out.println("= " + outputConverter(sciCalc, coreCalc.getDisplayValue()));
            break;
        case 7:
            if (!isdisplay) {
                userinput = Console.getDoubleInput("Enter a number ");
                coreCalc.setDisplay(userinput);
            }
            coreCalc.inverse();
            System.out.println("= " + outputConverter(sciCalc, coreCalc.getDisplayValue()));
            break;
        case 8:
            if (!isdisplay) {
                userinput = Console.getDoubleInput("Enter a number ");
                coreCalc.setDisplay(userinput);
            }
            coreCalc.inverseSign();
            System.out.println("= " + outputConverter(sciCalc, coreCalc.getDisplayValue()));
            break;
        case 9:
            if (!isdisplay) {
                userinput = Console.getDoubleInput("Enter a number to get sine of: ");
                coreCalc.setDisplay(userinput);
            }
            double result = sciCalc.sine(coreCalc.getDisplayValue());
            coreCalc.setDisplay(result);
            System.out.println("= " + outputConverter(sciCalc, coreCalc.getDisplayValue()));    
            break;
        case 10:
        if (!isdisplay) {
                    userinput = Console.getDoubleInput("Enter a number to get cosine of: ");
                    coreCalc.setDisplay(userinput);
                }
                System.out.println("cosine(" + coreCalc.getDisplayValue() + ")= "
                        + outputConverter(sciCalc, sciCalc.cosine(coreCalc.getDisplayValue())));
                break;
            case 11:
                if (!isdisplay) {
                    userinput = Console.getDoubleInput("Enter a number to get tangent of: ");
                    coreCalc.setDisplay(userinput);
                }
                System.out.println("tangent(" + coreCalc.getDisplayValue() + ")= "
                        + outputConverter(sciCalc, sciCalc.tangent(coreCalc.getDisplayValue())));
                break;
            case 12:
                if (!isdisplay) {
                    userinput = Console.getDoubleInput("Enter a number to get inverse sine of: ");
                    coreCalc.setDisplay(userinput);
                }
                System.out.println("inverse sine(" + coreCalc.getDisplayValue() + ")= "
                        + outputConverter(sciCalc, sciCalc.inverseSine(coreCalc.getDisplayValue())));
                break;
            case 13:
                if (!isdisplay) {
                    userinput = Console.getDoubleInput("Enter a number to get inverse cosine of: ");
                    coreCalc.setDisplay(userinput);
                }
                System.out.println("inverse cosine(" + coreCalc.getDisplayValue() + ")= "
                        + outputConverter(sciCalc, sciCalc.inverseCosine(coreCalc.getDisplayValue())));
                break;
            case 14:
                if (!isdisplay) {
                    userinput = Console.getDoubleInput("Enter a number: enter a number to get inverse tangent of ");
                    coreCalc.setDisplay(userinput);
                }
                System.out.println("inverse tangent(" + coreCalc.getDisplayValue() + ")= "
                        + outputConverter(sciCalc, sciCalc.inverseTangent(coreCalc.getDisplayValue())));
                break;
            case 15:
                if (!isdisplay) {
                    userinput = Console.getDoubleInput("Enter a number to do factorial on: ");
                    coreCalc.setDisplay(userinput);
                }
                try {
                    result = sciCalc.factorial(coreCalc.getDisplayValue());
                    coreCalc.setDisplay(result);
                    System.out.println("factorial(" + (int) coreCalc.getDisplayValue() + ")= " +
                            outputConverter(sciCalc, result));
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 16:
                String temp = "";
                temp = Console.getStringInput(
                        "type an option or click enter for auto next (decimal, hexadecimal, binary, octal): ");
                if (temp.isEmpty())
                    sciCalc.switchDisplayMode();
                else
                    sciCalc.switchDisplayMode(temp);

                break;
            case 17:
                String temp2 = "";
                temp2 = Console.getStringInput("type an option or click enter for auto next (radians, degree): ");
                if (temp2.isEmpty())
                    sciCalc.switchUnitsMode();
                else
                    sciCalc.switchUnitsMode(temp2);
                break;
            case 18:
                int x = Console.getIntegerInput(
                "Memory options:\n1. Add to memory (M+)\n2. Clear memory (MC)\n3. Recall from memory (MR)");
                switch (x) {
                    case 1:
                        userinput = Console.getDoubleInput("Enter a number to add to memory: ");
                        sciCalc.memoryFunctions(userinput, "M+");
                        System.out.println("Added to memory. Memory now: " + sciCalc.mrc());
                        break;
                    case 2:
                        sciCalc.memoryFunctions(0.0, "MC");
                        System.out.println("Memory cleared");
                        break;
                    case 3:
                        coreCalc.setDisplay(sciCalc.mrc());
                        System.out.println("Recalled from memory: " + coreCalc.getDisplayValue());
                        break;
                    default:
                        System.out.println("Invalid option");
                        break;
                }
                break;

            case 19:
                if (!isdisplay) {
                    userinput = Console.getDoubleInput("Enter a number: ");
                    coreCalc.setDisplay(userinput);
                }
                userinput = Console.getDoubleInput("Enter a number to see what percent of " + coreCalc.getDisplayValue() + " it is : ");
                coreCalc.percentage(userinput);
                System.out.println("= "+ coreCalc.getDisplayValue()+"%");
                break;

            case 20:
    if (!isdisplay) {
        userinput = Console.getDoubleInput("Enter a decimal to turn to percent: ");
        coreCalc.setDisplay(userinput);
    }
    double percentResult = sciCalc.decimalToPercentage(coreCalc.getDisplayValue());
    coreCalc.setDisplay(percentResult);
    System.out.println("= " + percentResult + "%");
    break;
        }
    }
}