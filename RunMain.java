package CA_04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RunMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Draw draw=new Draw();
		Init init=new Init();
		Data data=new Data();
		People people=new People();
		Rule rule=new Rule();
		AddAllIncome addAllIncome=new AddAllIncome();
		DefineDirection dd=new DefineDirection();
		DynamicParameter dyp=new DynamicParameter();
		int m=data.M;
		int n=data.N;
		Block B[][]=new Block[m][n];
		ArrayList<Block> BA=new ArrayList();
		
		init.initWallAndPeople(B,BA);
		System.out.println(BA.size());
//		for (int i = 0; i < BA.size(); i++) {
//			System.out.println(BA.get(i).getX());
//		}
		draw.onColor(B);
		while(true) {
			init.changeMoveOK(B);
			
			for(int z=0;z<BA.size();z++) {
				
				int i=BA.get(z).getX();
				int j=BA.get(z).getY();
//				System.out.println(i+"-----"+j);
				if(B[i][j].getLogo()==data.LOGO_PEOPLE) {
					
					if(B[i][j].isMoveOK()) {
						addAllIncome.changeMap(B, i, j);
						ArrayList<Direction> dir=B[i][j].getIncomeArr();
						int direction=dir.get(0).getDirection();
						if(rule.isExit(B, i, j, direction)) {
//							System.out.println("chuquyige ");
							B[i][j]=new Block(data.LOGO_NULL);
							BA.remove(z);
						}
						else {
							if(dir.get(0).getIncomeMat()<0) {
								System.out.println("wait here");
							}
							else {
								people.peopleMove(B, i, j, direction);
								people.peopleMoveArray(BA, z, i, j, direction);
							}
							
						}
						
					}
				}
			}
			
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
//			draw.onColor(B);
			draw.onColorByArray(BA);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
