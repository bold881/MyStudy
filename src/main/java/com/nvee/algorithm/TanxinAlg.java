package com.nvee.algorithm;

public class TanxinAlg {
	/*
	 * 设有N个活动时间集合，每个活动都要使用同一个资源，比如说会议场，而且同一时间内只能有一个活动使用，
	 * 每个活动都有一个使用活动的开始s[i]和结束时间f[i]，即他的使用区间为（s[i],f[2]）,
	 * 现在要求你分配活动占用时间表，即哪些活动占用该会议室，
	 * 哪些不占用，使得他们不冲突，要求是尽可能多的使参加的活动最大化，即所占时间区间最大化！
	 *          1   2   3    4    5    6    7    8     9     10      11
	 *  s[i]  1   3   0    5    3    5    6    8     8      2        12
	 *  f[i]  4   5    6   7    8    9    10  11   12    13      14
	 */
	public static void main(String[] args) {
		int[]  s = new int[]{1,3,0,5,3,5,6,8,8,2,12}; 
		int[] f = new int[]{4,5,6,7,8,9,1,0,11,12,13,14};
		boolean[] mark = new boolean[11];
		choose(11,s,f,mark);
		for (int i = 0; i < mark.length; i++) {
			if(mark[i])
			System.out.println("最有选择为:"+i);
		}
	}
	private static void choose(int len,int[] s,int[] f,boolean[] mark){
		mark[0]=true;
		int j = 0;
		for(int i=0;i<len ;i++){
			if(s[i] >= f[j]){
				mark[i] = true;
				j=i;
			}
		}
	}
}
