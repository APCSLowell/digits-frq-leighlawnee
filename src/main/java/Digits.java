import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num){
	while (num>0){
		digitList.add(0, num%10);
		num = num/10;
	}
	if(num == 0)
		digistList.add(num);
	}

	public boolean isStrictlyIncreasing(){ /* to be implemented in part (b) */
	for(int i = 0; i<digitList.size()-1; i++){
		if(digitList.get(i)<digitList.get(i+1))
			count++;
		}

		if(count == digitList.size()-1)
			return true;
		else
			return false;


	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
