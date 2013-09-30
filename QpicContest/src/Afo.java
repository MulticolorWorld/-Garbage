public class Afo {	
	static String afo(int n){
		String ans = "";
		for(int i = 1;i <= n;i++){
			String str = Integer.toString(i);
			if(i % 3 == 0){
				ans += "afo";
			}else if(str.contains("3")){
				ans += "afo";
			}else{
				ans += i;
			}
			ans += "\n";
		}
		return ans;
	}
}