package CA_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class AddAllIncome {
	
	public void changeMap(Block B[][],int d_i,int d_j) {// 将二维数组转化为map 并且排序
		DefineDirection df=new DefineDirection();
		df.defineIncome(B, d_i, d_j);
		DynamicParameter dp=new DynamicParameter();
		dp.countAroundPeople(B, d_i, d_j);
		creatRandom(B, d_i, d_j);
		addAll(B, d_i, d_j);
		double allIncome[][]=B[d_i][d_j].getIncome();
		Map<Integer, Double> allIncomeMap=new HashMap< >();
		allIncomeMap.put(1, allIncome[0][0]);
		allIncomeMap.put(2, allIncome[0][1]);
		allIncomeMap.put(3, allIncome[0][2]);
		
		allIncomeMap.put(4, allIncome[1][0]);
		allIncomeMap.put(5, allIncome[1][1]);
		allIncomeMap.put(6, allIncome[1][2]);
		
		allIncomeMap.put(7, allIncome[2][0]);
		allIncomeMap.put(8, allIncome[2][1]);
		allIncomeMap.put(9, allIncome[2][2]);
		
		List<Map.Entry<Integer,Double>> list = new ArrayList<Map.Entry<Integer,Double>>(allIncomeMap.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<Integer,Double>>() {
            public int compare(Entry<Integer,Double> o1,
                    Entry<Integer, Double> o2) {
                return o2.getValue().compareTo(o1.getValue()); //o2-o1 降序 o1-o2 升序
            }

        });
        ArrayList<Direction> allDirection=new ArrayList();
        for(Map.Entry<Integer,Double> mapping:list){ 
//               System.out.println(mapping.getKey()+":"+mapping.getValue()); 
               Direction dir=new Direction();
               dir.setDirection(mapping.getKey());
               dir.setIncomeMat(mapping.getValue());
               allDirection.add(dir);
		}
        B[d_i][d_j].setIncomeArr(allDirection);
		B[d_i][d_j].setIncomeMap(allIncomeMap);
	}
	public void addAll(Block B[][],int d_i,int d_j) {//将所有的收益加起来 并放到总收益的二维矩阵
		double allIncome[][]=new double[3][3];
		double spaceIncome[][]=B[d_i][d_j].getSpaceIncome();
		double defineIncome[][]=B[d_i][d_j].getDefineIncome();
		double randomIncome[][]=B[d_i][d_j].getRandomIncome();
		for (int i = 0; i < allIncome.length; i++) {
			for (int j = 0; j < allIncome[i].length; j++) {
				allIncome[i][j]=spaceIncome[i][j]+defineIncome[i][j]+randomIncome[i][j];
			}
		}
		B[d_i][d_j].setIncome(allIncome);
	}
	
	public void creatRandom(Block B[][],int d_i,int d_j) {// 创建随机数收益 避免收益相同
		double randomIncome[][]=new double[3][3];
		for (int i = 0; i < randomIncome.length; i++) {
			for (int j = 0; j < randomIncome[i].length; j++) {
				randomIncome[i][j]=Math.random();
			}
		}
		B[d_i][d_j].setRandomIncome(randomIncome);
	}
}
