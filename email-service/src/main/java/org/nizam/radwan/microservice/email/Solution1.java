package org.nizam.radwan.microservice.email;
class Solution1 {

	public static void main(String[] args) {
		solution(8, 0);
		solution(18, 2);
		solution(10, 10);
	}
	public static int solution(int n, int k) {
		int allIn = 0;
		int rest = n;
		int iter = 0;

		while(rest != 1){
			// Avoid extra loops when reaching k
			if (allIn==k){
				iter += (rest-1);
				break;
			}
			
			iter++;
			if (rest % 2 == 0){
				allIn ++;
				rest -= (rest / 2);
			}else{
				rest -=1;
			}
		}

		return iter;
	}
}