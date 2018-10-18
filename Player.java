//Alexander Chase Dimura
import java.util.Scanner;
import java.security.SecureRandom;

public class Player
{
	
	char currentPlayer;
	SecureRandom random= new SecureRandom();
	
public Player()
{
	currentPlayer='O';
	
}		

public char getFill() { //return fill
    return currentPlayer;
}
public char changeFill(char XorO) //change fill
{
	
	char pOne='X';
	char pTwo='O';
	
	if (currentPlayer == pTwo)
              currentPlayer=pOne;
                else
              currentPlayer=pTwo;	
		  
		   return currentPlayer;
}

public Board CompGetPosition(Board b)
{
		
	//check for middle space, take it
	if(b.IsEmpty(5))
	{
		b.FillEmpty(5,changeFill(currentPlayer));
		return b; 
	}
	
	//count the number of empties
	int counter=0;
	for(int i=1; i<=9; i++)
	{	
		if(b.IsEmpty(i))
			counter++; 
	}
	//pick from 1 to that number
	int StoreRando=random.nextInt(counter+1);
	//place in nth space
	counter = 0;
	for(int i= 1; i<=9; i++)
	{
		if (b.IsEmpty(i)) {
			counter++;
			
			if( counter== StoreRando)
			{b.FillEmpty(i,changeFill(currentPlayer));
			return b; 
			}
		}
		
	}
	return b;
}
	
	public Board GetPosition(Board b)
	{
		//takes in user input while also error checking for position availabilty before the spot is filled 
		
		Scanner input = new Scanner(System.in);
		
		
		
		int pos = 1;
		
		do{
			
			System.out.println("user Please enter a position 1-9:");
			pos = input.nextInt();
			if(pos<0||pos>9)
			{
			System.out.println("position entered is out of range ");
			
			}
			else if(!b.IsEmpty(pos))
			{
			System.out.println("position entered is filled ");
			
			}
			else
			{
			b.FillEmpty(pos,changeFill(currentPlayer));
			}
			 
		}while(b.IsEmpty(pos));
		
		
		return b; 
		
		
		
	}
	public static void main(String[] args)
	{
		
		
		
		
	}
	
	
	
	
	
}

	
	
	
	
	
	

