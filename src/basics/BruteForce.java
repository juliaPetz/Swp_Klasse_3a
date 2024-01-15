package basics;

public class BruteForce {

	public static void main(String[] args) {
		
		for(int x = 0; x <= 9; x++) {
			for(int o = 0; o <= 9; o++) {
				for(int l = 0; l <= 9; l++) {
					for(int t = 0; t <= 9; t++) {
						if(x*100+o*10+l + l*100+x*10+x == t*100+l*10+t) {
							if(x != o && x != l && x != t && o != l && o != t && l != t) {
								System.err.println("x = " + x + " o = " + o + " l = " + l + " t = "+ t);
							} else {
								System.out.println("x = " + x + " o = " + o + " l = " + l + " t = "+ t);
							}
						}
					}
				}
			}
		}

	}

}
