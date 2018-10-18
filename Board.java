
//Alexander Chase Dimura
public class Board
{
	//this class maintains the board so that it will be accessed securly, checks for winning conditions, 
	
	private char[][] ttt = new char[3][3];
	
	
	public Board(){

    ttt = new char[3][3];
    clearttt();   
		//intialize empty board
}


public void clearttt()
{
	//initializes empty board
    for(int i = 0;  i< 3; i++)
	{
        for(int k = 0; k < 3; k++)
		{
            ttt[i][k]= ' ';
        }
    }
}
	
		
	
	
	public boolean IsEmpty(int position)
	{
		//column(position-1%3)
		//row(position-1/3) 
		//checks if it is empty based on the position entered
		
		if(' '==ttt[((position-1)/3)][((position-1)%3)])
			return true;
		else 
			return false; 
		
	}
	 public boolean fullBoard() {

        boolean full = true;

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (ttt[i][j] == ' ') {

                full = false;
                }
            }
        }
        return full;
    }
		
	public void FillEmpty(int position,char fill)
	{
		//allows user or computer entered data based on position passed in
		ttt[((position-1)/3)][((position-1)%3)]=fill; 
		
	}
	public char GetFill(char fill)
	{
		return fill; 
	}
	public char [][] GetArray()
	{
		
		
			return ttt; 
			
		 ///int  newarray[][]= new int [3][3];
		
		//
		//{
			//newarray[i][j]=ttt[i][j]; 
		//}
		//return newarray; 
		
		
	}
public boolean checkForWin() {

		return (checkWinRows() || checkWinColumns() || checkWinDiagonals());
	}


public boolean checkWinRows() {

    for (int i = 0; i < 3; i++) {

        if (checkSpot(ttt[i][0], ttt[i][1], ttt[i][2]) == true) {

            return true;
        }
    }
    return false;
}


public boolean checkWinColumns() {

    for (int i = 0; i < 3; i++) {

        if (checkSpot(ttt[0][i], ttt[1][i], ttt[2][i]) == true) {

            return true;
        }
    }
    return false;
}


public boolean checkWinDiagonals() {

    return ((checkSpot(ttt[0][0], ttt[1][1], ttt[2][2]) == true) || (checkSpot(ttt[0][2], ttt[1][1], ttt[2][0]) == true));
}

public boolean checkSpot (char mark1, char mark2, char mark3) {

    return ((mark1 != ' ') && (mark1 == mark2) && (mark2 == mark3));
	
	
	
}
	
	
	
	public static void main(String[] args)
	{
		
	}
	
	
	
}
