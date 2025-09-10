package examTPromain;
import java.util.Scanner;

 class romain {  
   static int preajout(char num1, char num2, int i, char[] c)
    {
    c[i++] = num1;
    c[i++] = num2;
    return i;
}

static int ajout(char ch, int n, int i, char[] c) {
    for (int j = 0; j < n; j++) {
        c[i++] = ch;
    }
    return i;
}
static String toRomanNumber(int number) {
    char c[] = new char[10001];
    int i = 0;
    if (number <= 0) {
        return("nombre negatif !!!!");
    }

  
    while (number != 0) {
        if (number >= 1000) {
          
            i = ajout('M', number / 1000, i, c);
            number = number % 1000;
        } 
        else if (number >= 500) {
         
            if (number < 900) {
                i = ajout('D', number / 500, i, c);
                number = number % 500;
            } 
            else {
               
                i = preajout('C', 'M', i, c);
                number = number % 100;
            }
        }
        else if (number >= 100) {
           
            if (number < 400) {
                i = ajout('C', number / 100, i, c);
                number = number % 100;
            } 
            else {
                i = preajout('C', 'D', i, c);
                number = number % 100;
            }
        } 
        else if (number >= 50) {
          
            if (number < 90) {
                i = ajout('L', number / 50, i, c);
                number = number % 50;
            } 
            else {
                i = preajout('X', 'C', i, c);
                number = number % 10;
            }
        } 
        else if (number >= 10) {
            
            if (number < 40) {
                i = ajout('X', number / 10, i, c);
                number = number % 10;
            } 
            else {
                i = preajout('X', 'L', i, c);
                number = number % 10;
            }
        }
        else if (number >= 5) {
            if (number < 9) {
                i = ajout('V', number / 5, i, c);
                number = number % 5;
            } 
                i = preajout('I', 'X', i, c);
                number = 0;
            }
        
        else if (number >= 1) {
            if (number < 4) {
                i = ajout('I', number, i, c);
                number = 0;
            } 
            else {
                i = preajout('I', 'V', i, c);
                number = 0;
            }
        }
    }

    System.out.printf("nombre en romain est: ");
    String word = "";
    for (int j = 0; j < i; j++) {
        word += c[j];
    } return(word);}


public static void main(String[] args) {
    
	System.out.println("entrez votre nombre   ");
	Scanner SC = new Scanner(System.in);
	int number = SC.nextInt();
    String word=toRomanNumber(number);
    System.out.println(word);
}
}


