package CA_04;

public class DynamicParameter {
	Data data=new Data();
	public void countAroundPeople(Block B[][],int d_i,int d_j) {
		double spaceIncome[][]=new double[3][3];
		for (int i = d_i-1; i <= d_i+1; i++) {
			for (int j =d_j-1 ; j <= d_j+1; j++) {
//				System.out.println(i+"*********"+j);
				if(i<1 | i>data.M-1 | j<1 | j>data.N-1 |(i==d_i & j==d_j)) {
//					System.out.println("范围之外的格子:"+i+"------"+j);
//					System.out.println("mat out raound");
				}
				else {
//					System.out.println("遍历的格子："+i+"&&&&&&"+j+"格子logo为"+B[i][j].getLogo());
					if(B[i][j].getLogo()==data.LOGO_WALL ) {
						spaceIncome[i+1-d_i][j+1-d_j]=-1000;
//						System.out.println("catch here");
					}
					else if(B[i][j].getLogo()==data.LOGO_PEOPLE) {
						spaceIncome[i+1-d_i][j+1-d_j]=-1000;
//						System.out.println("catch here");
					}
					else if(B[i][j].getLogo()==data.LOGO_EXIT) {
						spaceIncome[i+1-d_i][j+1-d_j]=1000;
					}
				}
			}
		}
		B[d_i][d_j].setSpaceIncome(spaceIncome);	
	}
}
