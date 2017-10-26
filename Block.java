package CA_04;

import java.util.ArrayList;
import java.util.Map;

public class Block {
	int uid;
	int x;
	int y;
	int logo;
	int direction;
	boolean type=false;//true为朝右 false为朝左
	boolean moveOK=false;
	double income[][];//总收益
	Map<Integer, Double> incomeMap;
	ArrayList<Direction> incomeArr;
	double spaceIncome[][];//空格参数
	double defineIncome[][];//默认方向参数
	double randomIncome[][];//随机参数 防止参数重合
	public Block(int logo) {
		this.logo=logo;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getLogo() {
		return logo;
	}
	public void setLogo(int logo) {
		this.logo = logo;
	}
	public int getDirection() {
		return direction;
	}
	public void setDirection(int direction) {
		this.direction = direction;
	}
	public boolean isType() {
		return type;
	}
	public void setType(boolean type) {
		this.type = type;
	}
	public boolean isMoveOK() {
		return moveOK;
	}
	public void setMoveOK(boolean moveOK) {
		this.moveOK = moveOK;
	}
	public double[][] getIncome() {
		return income;
	}
	public void setIncome(double[][] income) {
		this.income = income;
	}
	public double[][] getSpaceIncome() {
		return spaceIncome;
	}
	public void setSpaceIncome(double[][] spaceIncome) {
		this.spaceIncome = spaceIncome;
	}
	public double[][] getDefineIncome() {
		return defineIncome;
	}
	public void setDefineIncome(double[][] defineIncome) {
		this.defineIncome = defineIncome;
	}
	public double[][] getRandomIncome() {
		return randomIncome;
	}
	public void setRandomIncome(double[][] randomIncome) {
		this.randomIncome = randomIncome;
	}
	public Map<Integer, Double> getIncomeMap() {
		return incomeMap;
	}
	public void setIncomeMap(Map<Integer, Double> incomeMap) {
		this.incomeMap = incomeMap;
	}
	public ArrayList<Direction> getIncomeArr() {
		return incomeArr;
	}
	public void setIncomeArr(ArrayList<Direction> incomeArr) {
		this.incomeArr = incomeArr;
	}
	
}
