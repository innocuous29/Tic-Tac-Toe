//Alexander Chase Dimura

public class TicTacToe
{
	public static char[][] tt = new char[3][3]; 
	
	
	public TicTacToe()
		{
		
		}

	
public static void main(String[] args)
	{
		int location;
		char symbol=' '; 
		boolean XisCPU=false;
		boolean OisCPU=false;
		
		Board b= new Board();
		
		Player currentTurn=new Player();
		
		//allows for command line entry determining whether a computer or player will take a turn 
		if (args.length==1 && args[0].compareTo("-c")==0)
		{	
			XisCPU=true; 
			OisCPU=true;
		
		}
		else if(args.length==2&& args[0].compareTo("-c")==0&& args[1].compareTo("1")==0)
				XisCPU=true; 
		else if(args.length==2&& args[0].compareTo("-c")==0&& args[1].compareTo("2")==0)
				OisCPU=true;
		else
		{
			currentTurn.GetPosition(b);
			
			
		}
		
		while(!b.checkForWin()&&!b.fullBoard())
		{	
			///// while there is no winner/tie it takes in either a computer filling or a human entered entry
			
			if(currentTurn.getFill()=='X'&& XisCPU==true )
			{
				currentTurn.CompGetPosition(b);
				
			}
			else if(currentTurn.getFill()=='O'&& OisCPU==true)
			{
				currentTurn.CompGetPosition(b);
				
			}
			else
			{
				currentTurn.GetPosition(b);
				
			}
			
		System.out.println("+---+---+---+");
        System.out.println("| " + b.GetArray()[0][0] + " | " + b.GetArray()[0][1] + " | " +b.GetArray()[0][2] + " |");
        System.out.println("+---+---+---+");
        System.out.println("| " + b.GetArray()[1][0] + " | " + b.GetArray()[1][1] + " | " + b.GetArray()[1][2] + " |");
        System.out.println("+---+---+---+");
        System.out.println("| " + b.GetArray()[2][0] + " | " + b.GetArray()[2][1] + " | " + b.GetArray()[2][2] + " |");
        System.out.println("+---+---+---+");
		//display board and breaks out of the loop if there is a full board or a winner in the game
		
		if(b.checkForWin())
		{
			System.out.println("Game Over, congrats Player "+currentTurn.getFill()+"you won");
			break;
			
		}
		if(b.fullBoard())
		{
			System.out.println("Game over its a Tie");
			break;
		}
		
		}
	}
	  
	
		
	
	
	
}
