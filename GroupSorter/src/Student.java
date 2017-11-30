
public class Student
	{
		String firstName;
		String lastName;
		double score;
		public Student(String f, String l, double s)
		{
			firstName = f;
			lastName = l;
			score = s;
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
