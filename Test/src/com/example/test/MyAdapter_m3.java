package com.example.test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.test.R;


public class MyAdapter_m3 {
	public List<Map<String, Object>> getData() {
		// TODO Auto-generated method stub
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		/*Map<String, Object> map = new HashMap<String, Object>();
		map.put("new_list",R.drawable.pic);

		map.put("uName", "主题：读书交流分享会\n时间：2017.05.04\n地点：学术报告厅");

		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("new_list",R.drawable.pic);

		map1.put("uName", "主题：辩论赛\n时间：2017.04.05\n地点：J楼教室");

		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("new_list",R.drawable.pic);

		map2.put("uName", "主题：篮球赛\n时间：2016.12.10\n地点：欣苑篮球场");
*/
		Map<String, Object> map3 = new HashMap<String, Object>();
		map3.put("new_list",R.drawable.pic);

		map3.put("uName", "主题：软件开发讲座\n时间：2016.09.04\n地点：W楼教室");

		Map<String, Object> map4 = new HashMap<String, Object>();
		map4.put("new_list",R.drawable.pic);

		map4.put("uName", "主题：团日活动答辩\n时间：2016.08.08\n地点：L楼教室");

		/*list.add(map);
		list.add(map1);
		list.add(map2);*/
		list.add(map3);
		list.add(map4);

		return list;
}
}
