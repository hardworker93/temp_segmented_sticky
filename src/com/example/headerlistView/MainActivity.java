package com.example.headerlistView;

import java.util.LinkedHashMap;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class MainActivity extends Activity {

	HeaderListView mHeaderListView;
	LinkedHashMap<String, String[]> mLinkedHashMap;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);  

		//		mHeaderListView = (HeaderListView)findViewById(R.id.HeaderListView_MainActivity);
		//		mLinkedHashMap = new LinkedHashMap<>();
		//		mLinkedHashMap.put("Pizza", new String[]{"Cheese Pizza - Slice","Pepperoni Pizza","Tomato Bruschetta Flatbread Pizza",
		//				"Herb Seasoned Breadsticks","Spaghetti Sauce with Tomato Bits"});
		//
		//		mLinkedHashMap.put("Salad", new String[]{"Salad Bar","Green Pepper & Tomato Salad","Lo Mein Noodle Salad"});
		//
		//		mLinkedHashMap.put("Cold Cereal", new String[]{"Miscellaneous/Peripherals"});
		//
		//		mLinkedHashMap.put("Dessert", new String[]{"Carnival Cookies","Sweet Cinnamon Brownies","Oreo Crumble Pudding Cup", 
		//		"Cherry Jell-O Parfait"});
		//
		//
		//		mHeaderListView.setAdapter(new SectionAdapter() {
		//
		//
		//			@Override
		//			public int numberOfSections() {
		//
		//				return mLinkedHashMap.keySet().toArray().length;
		//			}
		//
		//			@Override
		//			public int numberOfRows(int section) {
		//			
		//				if(section >=0){
		//					String sectionKey = (String)mLinkedHashMap.keySet().toArray()[section];
		//					int numOfRows = mLinkedHashMap.get(sectionKey).length;
		//					return numOfRows;
		//				}else{
		//					return 0;
		//				}
		//			}
		//
		//			@Override
		//			public boolean hasSectionHeaderView(int section) {
		//				return true;
		//			}
		//
		//			@Override
		//			public View getRowView(int section, int row, View convertView,
		//					ViewGroup parent) {
		//
		//				ViewHolder holder = null;
		//				if (convertView == null) {
		//					holder = new ViewHolder();
		//					LayoutInflater mLayoutInflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE); 
		//					convertView = mLayoutInflater.inflate(R.layout.item_cell_view, parent, false);
		//					holder.textView = (TextView)convertView.findViewById(R.id.text);
		//					convertView.setTag(holder);
		//				} else {
		//					holder = (ViewHolder)convertView.getTag();
		//				}
		//				String sectionKey = (String)mLinkedHashMap.keySet().toArray()[section];
		//				holder.textView.setText(mLinkedHashMap.get(sectionKey)[row]);
		//				return convertView;
		//
		//			}
		//
		//			@Override
		//			public Object getRowItem(int section, int row) {
		//
		//				return ((String[])mLinkedHashMap.keySet().toArray()[section])[row];
		//			}
		//
		//			@Override
		//			public View getSectionHeaderView(int section, View convertView,
		//					ViewGroup parent) {
		//				ViewHolder holder = null;
		//				LayoutInflater mLayoutInflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE); 
		//				if (convertView == null) {
		//					holder = new ViewHolder();          
		//					convertView = mLayoutInflater.inflate(R.layout.header_cell_view, parent, false);
		//					holder.textView = (TextView)convertView.findViewById(R.id.textSeparator);
		//					convertView.setBackgroundColor(Color.parseColor("#FF0000"));
		//
		//
		//					convertView.setTag(holder);
		//				} else {
		//					holder = (ViewHolder)convertView.getTag();
		//				}
		//				holder.textView.setText((String)(mLinkedHashMap.keySet().toArray()[section]));
		//
		//				return convertView;
		//			}
		//		});
		//
		
			}
		
			public static class ViewHolder {
				public TextView textView;
			}
		
	
	


	}
