public class   TCT_20190213_LeeKangKil{
	public static void main(String args[])  {
		int num =30;
		int cnt=0;
		while(num!=1){
			if(num%3==0) num/=3;
			else if( (num-1)%3==0 ) num --;
			else if(num%2==0) num/=2;
			else num--;
			cnt++;
		}
		System.out.println(cnt);
	}
}
