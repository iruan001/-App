package com.ruide.action;


import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ruide.biz.DeptBiz;
import com.ruide.po.Dept;

@Controller
public class DoDeptAction {
	@Resource
	private DeptBiz deptbiz;
	@RequestMapping(value="/showdept.do")
	public String show(
			HttpServletRequest request,
			@RequestParam(required=true,defaultValue="1") Integer pagenow,  
            @RequestParam(required=false,defaultValue="3") Integer pagesize
			){
		//紧跟着的第一个方法会被分页,如果其它的方法也要分页，需要在其它方法的上面再写一个startpage（）
		PageHelper.startPage(pagenow, pagesize);
		List<Dept> list=deptbiz.findAll();
		//用PageInfo对结果进行包装
		 PageInfo<Dept> page=new PageInfo<Dept>(list); 
		//System.out.println("&&&&"+list.size());
		request.setAttribute("list",list);
		request.setAttribute("page",page);
		request.setAttribute("pagenow",pagenow);
		request.setAttribute("pagesize",pagesize);
		request.setAttribute("count",page.getTotal());
		return "showdept";
	}
	
	@RequestMapping(value="/adddept.do")
	public String save(Dept d){
		deptbiz.save(d);
		return "redirect:/showdept.do";
	}
	@RequestMapping(value="/deletedept.do")
	public String delete(int deptno){
		deptbiz.delete(deptno);
		return "redirect:/showdept.do";
	}
	@RequestMapping(value="/preupdatedept.do")
	public String preupdate(int deptno,HttpServletRequest request){
		Dept d=deptbiz.findById(deptno);
		request.setAttribute("d",d);
		return "preupdatedept";
	}
	@RequestMapping(value="updatedept.do")
	public String update(Dept d){
		deptbiz.merge(d);
		return "redirect:/showdept.do";
	}
}
