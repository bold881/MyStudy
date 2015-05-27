package com.nvee.spider;

/**
 * 获取页面源代码中的超链接
 * @author Administrator
 *
 */
public class HrefOfPage {
	public static void getHrefOfContent(String content){
		System.out.println("开始");
		String[] contents = content.split("<a href=\"");
		for (int i = 0; i < contents.length; i++) {
			int endHref = contents[i].indexOf("\"");
			String aHref = FunctionUtils.getHrefOfInOut(contents[i].substring(0,endHref));
			System.out.println(aHref);
			if(aHref != null){
				String href = FunctionUtils.getHrefOfInOut(aHref);
				if(!UrlQueue.isContants(href)
					//&&href.indexOf("/code/explore") != -1
					&&!VisitedUrlQueue.isContains(href)){
					UrlQueue.addElem(href);
				}
			}
		}
		System.out.println(UrlQueue.size() + "--抓到的连接数");
		System.out.println(VisitedUrlQueue.size() + "--已处理的页面数");
	}
}
