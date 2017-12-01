
public class Student
	{
		String firstName;
		String lastName;
		double score;
		int group;
		public Student(String f, String l, double s, int g)
		{
			firstName = f;
			lastName = l;
			score = s;
			group = g;
		}
		public int getGroup()
			{
				return group;
			}
		public void setGroup(int group)
			{
				this.group = group;
			}
		public String getFirstName()
			{
				return firstName;
			}
		public void setFirstName(String firstName)
			{
				this.firstName = firstName;
			}
		public String getLastName()
			{
				return lastName;
			}
		public void setLastName(String lastName)
			{
				this.lastName = lastName;
			}
		public double getScore()
			{
				return score;
			}
		public void setScore(double score)
			{
				this.score = score;
			}
	}
