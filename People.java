package CA_04;

import java.util.ArrayList;


public class People {
	Data data=new Data();
	Rule rule=new Rule();
	public boolean isNextCrash(Block B[][],int i,int j,int direction) {
		boolean flag=false;
		switch (direction) {
		case 1:
			if(B[i-1][j-1].getLogo()==data.LOGO_NULL ) {
				flag=true;
			}
			if(B[i-1][j-1].getLogo()==data.LOGO_EXIT) {
				rule.getExit(B, i, j);
			}
			break;
		case 2:
			if(B[i-1][j].getLogo()==data.LOGO_NULL ) {
				flag=true;
			}
			if(B[i-1][j].getLogo()==data.LOGO_EXIT) {
				rule.getExit(B, i, j);
			}
			break;
		case 3:
			if(B[i-1][j+1].getLogo()==data.LOGO_NULL ) {
				flag=true;
			}
			if(B[i-1][j+1].getLogo()==data.LOGO_EXIT) {
				rule.getExit(B, i, j);
			}
			break;
		case 4:
			if(B[i][j-1].getLogo()==data.LOGO_NULL) {
				flag=true;
			}
			if(B[i][j-1].getLogo()==data.LOGO_EXIT) {
				rule.getExit(B, i, j);
			}
			break;
		case 6:
			if(B[i][j+1].getLogo()==data.LOGO_NULL) {
				flag=true;
			}
			if(B[i][j+1].getLogo()==data.LOGO_EXIT) {
				rule.getExit(B, i, j);
			}
			break;
		case 7:
			if(B[i+1][j-1].getLogo()==data.LOGO_NULL ) {
				flag=true;
			}
			if(B[i+1][j-1].getLogo()==data.LOGO_EXIT) {
				rule.getExit(B, i, j);
			}
			break;
		case 8:
			if(B[i+1][j].getLogo()==data.LOGO_NULL) {
				flag=true;
			}
			if(B[i+1][j].getLogo()==data.LOGO_EXIT) {
				rule.getExit(B, i, j);
			}
			break;
		case 9:
			if(B[i+1][j+1].getLogo()==data.LOGO_NULL ) {
				flag=true;
			}
			if(B[i+1][j+1].getLogo()==data.LOGO_EXIT) {
				rule.getExit(B, i, j);
			}
			break;
		default:
			break;
		}
		return flag;
	}
	public void peopleMove(Block B[][],int i,int j,int direction) {
		switch (direction) {
		case 1:
			B[i][j].setMoveOK(false);
			B[i-1][j-1]=B[i][j];
			B[i][j]=new Block(data.LOGO_NULL);
			break;
		case 2:
			B[i][j].setMoveOK(false);
			B[i-1][j]=B[i][j];
			B[i][j]=new Block(data.LOGO_NULL);
			break;
		case 3:
			B[i][j].setMoveOK(false);
			B[i-1][j+1]=B[i][j];
			B[i][j]=new Block(data.LOGO_NULL);
			break;
		case 4:
			B[i][j].setMoveOK(false);
			B[i][j-1]=B[i][j];
			B[i][j]=new Block(data.LOGO_NULL);
			break;
		case 6:
//			System.out.println(i+"-------"+j);
			B[i][j].setMoveOK(false);
			B[i][j+1]=B[i][j];
			B[i][j]=new Block(data.LOGO_NULL);
			break;
		case 7:
			B[i][j].setMoveOK(false);
			B[i+1][j-1]=B[i][j];
			B[i][j]=new Block(data.LOGO_NULL);
			break;
		case 8:
			B[i][j].setMoveOK(false);
			B[i+1][j]=B[i][j];
			B[i][j]=new Block(data.LOGO_NULL);
			break;
		case 9:
			B[i][j].setMoveOK(false);
			B[i+1][j+1]=B[i][j];
			B[i][j]=new Block(data.LOGO_NULL);
			break;
		default:
			break;
		}
	}
	public void peopleMoveArray(ArrayList<Block> BA,int z,int d_i,int d_j,int d){
		switch (d) {
		case 1:
			BA.get(z).setX(d_i-1);
			BA.get(z).setY(d_j-1);
			break;
		case 2:
			BA.get(z).setX(d_i-1);
			BA.get(z).setY(d_j);
			break;
		case 3:
			BA.get(z).setX(d_i-1);
			BA.get(z).setY(d_j+1);
			break;
		case 4:
			BA.get(z).setX(d_i);
			BA.get(z).setY(d_j-1);
			break;
		case 5:
			BA.get(z).setX(d_i);
			BA.get(z).setY(d_j);
			break;
		case 6:
			BA.get(z).setX(d_i);
			BA.get(z).setY(d_j+1);
			break;
		case 7:
			BA.get(z).setX(d_i+1);
			BA.get(z).setY(d_j-1);
			break;
		case 8:
			BA.get(z).setX(d_i+1);
			BA.get(z).setY(d_j);
			break;
		case 9:
			BA.get(z).setX(d_i+1);
			BA.get(z).setY(d_j+1);
			break;
			
		default:
			break;
		}
	}
}
