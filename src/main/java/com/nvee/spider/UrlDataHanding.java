package com.nvee.spider;

/**
 * 此类主要从未访问队列中获取url,下载页面，分析url ,保存已访问等操作 实现Runnable接口
 * @author Administrator
 *
 */
public class UrlDataHanding implements Runnable{
	public void dataHanding(String url){
		HrefOfPage.getHrefOfContent(DownloadPage.getContentFormUrl(url));
	}

	@Override
	public void run() {
		while(!UrlQueue.isEmpty()){
			dataHanding(UrlQueue.outElem());
		}
	}

}
