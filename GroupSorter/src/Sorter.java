import java.util.*;
import java.io.*;
public class Sorter
	{

		public static void main(String[] args)
			{
				String line = "Jeffery Herald 89.5";
				Scanner inp = new Scanner(System.in);
				ArrayList <String> lines = new ArrayList <String> ();
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
										spacer=true;
									}
								else
									{
										space2=x;
									}
							}
					}
				lines.add(line.substring(space2+1) + line.substring(space1+1,space2) + line.substring(0,space1));
				Collections.sort(lines);
				System.out.println("How many groups do you want?");
				int groups = inp.nextInt();
				int temp = groups;
				for(int x=0; x<lines.size(); x++)
					{
						String temp2 = lines.get(x);
						lines.remove(x);
						lines.add(x, temp2 + temp);
						temp--;
						if(temp==0)
							{
								temp=groups;
							}
					}
				for(int x=0; x<lines.size(); x++)
					{
						String temp3 = lines.get(x);
						lines.remove(x);
						lines.add(x, temp3.substring(4));
					}
				for(int x=0; x<lines.size(); x++)
					{
						
						System.out.println(lines.get(x));
					}
			}

	}
