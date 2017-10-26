package CA_04;

public class DefineDirection {
	
	public void defineIncome(Block B[][],int d_i,int d_j) {
		double defineMat[][]=getDefineMat(B[d_i][d_j].type);
		B[d_i][d_j].setDefineIncome(defineMat);
	}
	public double[][] getDefineMat(boolean type){
		double defineMat[][]=new double[3][3];
		if(type) {
			defineMat[0][0]=-500;
			defineMat[1][0]=-500;
			defineMat[2][0]=-500;
			defineMat[0][1]=80;
			defineMat[2][1]=80;
			defineMat[0][2]=90;
			defineMat[2][2]=90;
			defineMat[1][2]=100;
		}
		else {
			defineMat[0][2]=-500;
			defineMat[1][2]=-500;
			defineMat[2][2]=-500;
			defineMat[0][1]=80;
			defineMat[2][1]=80;
			defineMat[0][0]=90;
			defineMat[2][0]=90;
			defineMat[1][0]=100;
		}
		return defineMat;
	}
}
