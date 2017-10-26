package CA_04;

public class Rule {
	Data data=new Data();
	public void getExit(Block B[][],int i,int j) {
		B[i][j]=new Block(data.LOGO_NULL);
	}
	public boolean isExit(Block B[][],int d_i,int d_j,int direction) {
		boolean flag=false;
		switch (direction) {
		case 1:
			if(B[d_i-1][d_j-1].getLogo()==data.LOGO_EXIT) {
				flag=true;
			}
			break;
		case 2:
			if(B[d_i-1][d_j].getLogo()==data.LOGO_EXIT) {
				flag=true;
			}
			break;
		case 3:
			if(B[d_i-1][d_j+1].getLogo()==data.LOGO_EXIT) {
				flag=true;
			}
			break;
		case 4:
			if(B[d_i][d_j-1].getLogo()==data.LOGO_EXIT) {
				flag=true;
			}
			break;
		case 5:
//			if(B[d_i][d_j].getLogo()==data.LOGO_EXIT) {
//				B[d_i][d_j]=new Block(data.LOGO_NULL);
//			}
			break;
		case 6:
			if(B[d_i][d_j+1].getLogo()==data.LOGO_EXIT) {
				flag=true;
			}
			break;
		case 7:
			if(B[d_i+1][d_j-1].getLogo()==data.LOGO_EXIT) {
				flag=true;
			}
			break;
		case 8:
			if(B[d_i+1][d_j].getLogo()==data.LOGO_EXIT) {
				flag=true;
			}
			break;
		case 9:
			if(B[d_i+1][d_j+1].getLogo()==data.LOGO_EXIT) {
				flag=true;
			}
			break;
		default:
			break;
		}
		return flag;
	}
}
