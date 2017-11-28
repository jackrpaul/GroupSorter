import java.util.*;
import java.io.*;
public class Sorter
	{

		public static void main(String[] args)
			{
				ArrayList <Student> students = new ArrayList <Student>();
				int space1 = 0;
				int space2 = 0;
				boolean spacer = false;
				for(int x=0; x<line.length(); x++)
					{
						if(line.substring(x,x+1).equals(" "))
							{
								if(spacer==false)
									{
										space1=x;
									}
								else
									{
										space2=x;
									}
							}
					}
				Students.add(new Student(line.substring(0,space1), line.substring(space1+1,space2)))
			}

	}
