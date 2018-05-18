package com.ruide.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class Page extends SimpleTagSupport{
	
	private int count;
	private int pagenow;
	private int pagesize;
	private String url;
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getPagenow() {
		return pagenow;
	}

	public void setPagenow(int pagenow) {
		this.pagenow = pagenow;
	}

	public int getPagesize() {
		return pagesize;
	}

	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void doTag() throws JspException, IOException {
		int totalpage=(count-1)/pagesize+1;
		JspWriter out=this.getJspContext().getOut();
		
		out.print("<style>");
		out.print(".changepage{font-size:15px;display:block;width:60px;height:25px;text-align:center;font-weight:500;color:#2F4F4F;background-color:#F0FFFF;border-radius:10px;}.changepage a{text-decoration:none;color:#6495ED;}.fenge{width:20px;}#tiaozhuang{width:50px;height:25px;border:1px solid #6495ED;border-radius:10px;background-color:#F5F5F5;}#spage{width:70px;height:25px;text-align:center;font-weight:500;background-color:#F5F5F5;border:1px solid#6495ED;border-radius:10px;}");
		out.print("</style>");
		
		
		out.print("<table id='fenye'><tr>");
		if(pagenow == 1){
			out.print("<td class='changepage'>首页</td><td class='fenge'></td><td class='changepage'>上一页</td><td class='fenge'></td>");
		}else{
			out.print("<td class='changepage'><a href='"+url+"&pagenow=1&pagesize="+pagesize+"'>首页</a></td><td class='fenge'></td>");
			out.print("<td class='changepage'><a href='"+url+"&pagenow="+(pagenow-1)+"&pagesize="+pagesize+"'>上一页</a></td><td class='fenge'></td>");
		}
		if(pagenow == totalpage){
			out.print("<td class='changepage'>下一页</td><td class='fenge'></td><td class='changepage'>尾页</td><td class='fenge'></td>");
		}else{
			out.print("<td class='changepage'><a href='"+url+"&pagenow="+(pagenow+1)+"&pagesize="+pagesize+"'>下一页</a></td><td class='fenge'></td>");
			out.print("<td class='changepage'><a href='"+url+"&pagenow="+totalpage+"&pagesize="+pagesize+"'>尾页</a></td><td class='fenge'></td>");
		}
		out.print("<td style='display:block;font-size:15px;'>显示的页数:&nbsp;</td>");
		out.print("<td><input class='changepage' type='text' id='page' value='"+pagenow+"' size='5' /></td><td class='fenge'></td>");
		out.print("<td>&nbsp;<input id='tiaozhuang' style='margin-left:-20px;' type='button' value='跳转' onclick='doclick1("+pagesize+")' /></td><td class='fenge'></td>");
		out.print("<td>&nbsp;&nbsp;<select id='spage' onchange='doclick2("+pagesize+")'>");
		for(int i=1;i<=totalpage;i++){
			out.print("<option value='"+i+"'"+(pagenow==i?"selected=selected":"")+">第"+i+"页</option>");
		}
		out.print("</select></td><td class='fenge'></td>");
		out.print("<td style='font-size:15px;'>&nbsp;&nbsp;&nbsp;第"+pagenow+"/"+totalpage+"页</td>");

		out.print("<td style='font-size:15px;'>&nbsp;&nbsp;&nbsp;共"+totalpage+"页</td>");
		out.print("<td style='font-size:15px;'>&nbsp;&nbsp;&nbsp;每页条数：&nbsp;&nbsp;&nbsp;</td>");
		out.print("<td><input class='changepage' type='text' id='pagesize' size='1' value='"+pagesize+"'></td>");
		out.print("<td>&nbsp;<input id='tiaozhuang' type='button' value='跳转' onclick=doclick3()></td>");
		out.print("</tr></table>");
		
		out.print("<script type='text/javascript'>");
		out.print("function doclick1(pagesize){");
		out.print("var pagenow=document.getElementById('page').value;");
		out.print("location.href='"+url+"&pagenow='+pagenow+'&pagesize='+pagesize;");
		out.print("}");
		out.print("function doclick2(pagesize){");
		out.print("var pagenow=document.getElementById('spage').value;");
		out.print("location.href='"+url+"&pagenow='+pagenow+'&pagesize='+pagesize;");
		out.print("}");
		out.println("function doclick3(){var value=document.getElementById('pagesize').value;location.href='"+url+"&pagesize='+value;}");
		out.print("</script>");
	}
}









