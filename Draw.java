package CA_04;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.*;

public class Draw {
	Data data=new Data();
	int m=data.M;
	int n=data.N;
	JFrame jf;
	JPanel[][] jp;
	
	public Draw() {
		jf=new JFrame("CA");
		jp=new JPanel[m][n];
		jf.setLayout(new GridLayout(m,n,3,3));
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				jp[i][j]=new JPanel();
				jp[i][j].setBackground(Color.gray);
				jf.add(jp[i][j]);
			}
		}
		jf.setTitle("CA_V0.4");
		jf.setVisible(true);
		
		jf.setSize(n*20,m*20);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void onColor(Block B[][]) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				int logo=B[i][j].getLogo();
				switch (logo) {
//				case 1:
//					if(B[i][j].isType()) {
//						jp[i][j].setBackground(Color.BLUE);
//					}
//					else {
//						jp[i][j].setBackground(Color.RED);
//					}
//					break;
				case 0:
					jp[i][j].setBackground(Color.WHITE);
					break;
				case 10:
					jp[i][j].setBackground(Color.BLACK);
					break;
				case 100:
					jp[i][j].setBackground(Color.GREEN);
					break;
				default:
					jp[i][j].setBackground(Color.GRAY);
					break;
				}
			}
		}
	}
	public void onColorByArray(ArrayList<Block> BA) {
		for(int i=0;i<BA.size();i++) {
			int logo=BA.get(i).getLogo();
			int d_i=BA.get(i).getX();
			int d_j=BA.get(i).getY();
			boolean type=BA.get(i).isType();
			if(logo==data.LOGO_PEOPLE) {
				if(type) {
					jp[d_i][d_j].setBackground(Color.BLUE);
				}
				else {
					jp[d_i][d_j].setBackground(Color.RED);
				}
			}
			else {
				jp[d_i][d_j].setBackground(Color.WHITE);
			}
		}
	}
}
