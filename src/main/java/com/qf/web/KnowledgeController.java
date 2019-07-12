package com.qf.web;

import com.github.pagehelper.PageInfo;
import com.qf.bean.Classes;
import com.qf.bean.Knowledge;
import com.qf.service.KnowledgeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

/**
 * 2019/7/10
 * Administrator
 * ssm0710
 * 面向对象面向君  不负代码不负卿
 */
@Controller
public class KnowledgeController {
    @Resource
    private KnowledgeService knowledgeService;

    @RequestMapping("/getknows")
    public String getknows(String title, @RequestParam(defaultValue = "1") int index, ModelMap map){
        PageInfo<Knowledge> findknow = knowledgeService.findknow(title, index, 4);
        map.addAttribute("pi",findknow);
        map.put("tit",title);
        return "show";
    }
    //查询分类列表
    @RequestMapping("getclasses")
    public String getclasses(ModelMap map){
        List<Classes> classes = knowledgeService.findclasses();
        map.addAttribute("clist",classes);
        return "add";
    }
    //添加书籍
    @RequestMapping("addknow")
    public void addknow(Knowledge knowledge, HttpServletResponse response){
        knowledge.setLastmodified(new Date());
        int i = knowledgeService.insertKnowledge(knowledge);
        try {
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out = response.getWriter();
            if(i>0){
                out.print("<script>alert('新增成功');location.href='getknows'</script>");
            }else{
                out.print("<script>alert('新增失败');location.href='getclasses'</script>");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/findbyid")
    public String findbyid(int id,ModelMap map){
        Knowledge knowledge = knowledgeService.findbyid(id);
        List<Classes> classesList = knowledgeService.findclasses();
        map.put("know",knowledge);
        map.put("clist",classesList);
        return "update";
    }

    @RequestMapping("/update")
    public void update(Knowledge knowledge,HttpServletResponse response){
        knowledge.setLastmodified(new Date());
        int i = knowledgeService.updateKnowledge(knowledge);
        try {
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out = response.getWriter();
            if(i>0){
                out.print("<script>alert('修改成功');location.href='getknows'</script>");
            }else{
                out.print("<script>alert('修改失败');location.href='findbyid?id="+knowledge.getId()+"'</script>");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @RequestMapping("/delete")
    public void delete(int id,HttpServletResponse response){
        int i = knowledgeService.deleteknow(id);
        try {
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out = response.getWriter();
            if(i>0){
                out.print("<script>alert('删除成功');location.href='getknows'</script>");
            }else{
                out.print("<script>alert('删除失败');location.href='getknows'</script>");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
