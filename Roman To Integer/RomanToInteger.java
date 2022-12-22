package romantointeger;

public class RomanToInteger {

    public static void main(String[] args) {
        
        int resultingInt = 0;
        
        char nextChar       = 'z';
        char currentChar    = 'z'; 
        char prevChar       = 'z';
        
        String s = "MCMXCIV";
        
        for (int i = 0; i < s.length(); i++) {

            if (i + 1 != s.length())
                nextChar = s.charAt(i + 1);
            
            if (i - 1 != -1)
                prevChar = s.charAt(i - 1);
    
            currentChar = s.charAt(i);
            
                switch (currentChar) {
                
                    case 'I': 
                        if (nextChar == 'V' || nextChar == 'X')
                            break;
                        else
                            resultingInt += 1;
                        break;
                
                    case 'V': 
                        if (prevChar == 'I')
                            resultingInt += 4;
                        else
                            resultingInt += 5;
                        break;
                        
                    case 'X': 
                        if (nextChar == 'L' || nextChar == 'C')
                            break;
                        else if (prevChar == 'I')
                            resultingInt += 9;
                        else
                            resultingInt += 10;
                        break;
                
                    case 'L': 
                        if (prevChar == 'X')
                            resultingInt += 40;
                        else
                            resultingInt += 50;
                        break;
                
                    case 'C': 
                        if (nextChar == 'M' || nextChar == 'D')
                            break;
                        else if (prevChar == 'X')
                            resultingInt += 90;
                        else
                            resultingInt += 100;
                        break;
                
                    case 'D': 
                        if (prevChar == 'C')
                            resultingInt += 400;
                        else
                            resultingInt += 500;
                        break;
                
                    case 'M': 
                        if (prevChar == 'C')
                            resultingInt += 900;
                        else
                            resultingInt += 1000;
                        break;
            }
        }
        
        System.out.println("Roman numeral " + s + " in numeric form is " + 
                resultingInt);
        
    }
}
