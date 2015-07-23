package com.subaozuche.comm.utils;

public class newPagination {
	/**
     * 
     * Enter description here ...
     * @param string 	url			当前url
     * @param int 		page			当前页码
     * @param int		total_row		共多少条数据
     * @param int 		adjacents		显示页面大小
     * 
     * @author lqf
     */
    public static String paginate(String url, int page,int page_len, int total_row, int adjacents) {
    	String prevlabel = "上一页";
    	String nextlabel = "下一页";    	
    	int tpages = (int) Math.ceil(total_row/page_len);
    	
    	page = page > tpages ? tpages: page;
    	
    	String out = "<nav><ul class=\"pagination\">\n";
    	
    	out += "<li><span>共找到" + total_row + "条</span</li>";
    	
    	out += "<li>";    	
    	// previous
    	if(page==1) {
    		//out += prevlabel;
    	}
    	else if(page==2) {
    		out += "<a target=\"_self\" href=\"" + url + "1\">" + prevlabel + "</a>\n";
    	}
    	else {
    		out += "<a target=\"_self\" href=\"" + url +  (page-1) + "\">" + prevlabel + "</a>\n";
    	}
    	out += "</li>\n";
    	
    	
    	// first
    	if(page>(adjacents+1)) {
    		out += "<li><a target=\"_self\" href=\"" + url + "1\">1</a></li>\n";
    	}
    	
    	// interval
    	if(page>(adjacents+2)) {
    		out += "<li><span>...</span></li>\n";
    	}
    	
    	// pages
    	int pmin = (page>adjacents) ? (page-adjacents) : 1;
    	int pmax = (page<(tpages-adjacents)) ? (page+adjacents) : tpages;
    	for(int i=pmin; i<=pmax; i++) {
    		if(i==page) {
    			out += "<li><a target=\"_self\" class=\"cur\">" + i + "</a></li>\n";
    		}
    		else if(i==1) {
    			out += "<li><a target=\"_self\" href=\"" + url + "1\">" + i + "</a></li>\n";
    		}
    		else {
    			out += "<li><a target=\"_self\" href=\"" + url  + i + "\">" + i + "</a></li>\n";
    		}
    	}
    	
    	// interval
    	if(page<(tpages-adjacents-1)) {
    		out += "<li><span>...</span></li>\n";
    	}
    	
    	// last
    	if(page<(tpages-adjacents)) {
    		out += "<li><a target=\"_self\" href=\"" + url + tpages + "\">" + tpages + "</a></li>\n";
    	}
    	
    	// next
    	out += "<li>";
    	if(page<tpages) {
    		out += "<a target=\"_self\" href=\"" + url + (page+1) + "\">" + nextlabel + "</a>\n";
    	}
    	else {
    		//out += nextlabel;
    	}
    	out += "</li>\n";
    	
    	out += "</ul></nav>";
    	return out;
    }

}
