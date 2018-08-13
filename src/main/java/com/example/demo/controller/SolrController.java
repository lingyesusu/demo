package com.example.demo.controller;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.client.solrj.response.UpdateResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Created by SCPC03 on 2018/8/9.
 */
@Controller
@RequestMapping("solr")
public class SolrController {
    @Autowired
    private SolrClient client;

    /**
     * 新增/修改 索引
     * 当 id 存在的时候, 此方法是修改(当然, 我这里用的 uuid, 不会存在的), 如果 id 不存在, 则是新增
     * @return
     */
    @ResponseBody
    @RequestMapping("/add")
    public String add() {
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        try {
            SolrInputDocument doc = new SolrInputDocument();
            doc.setField("id", uuid);
            doc.setField("cName", "我是中国人, 我爱中国");
            doc.setField("cLeadername", "我是中国人, 我爱中国");
            /* 如果spring.data.solr.host 里面配置到 core了, 那么这里就不需要传 corename 这个参数
             * 下面都是一样的
             */
            client.add("corename",doc);
            client.commit("corename");

//            client.commit();
            return uuid;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "error";
    }

    /**
     * 根据id删除索引
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping("/delete")
    public String delete(String id)  {
        try {
            client.deleteById("corename",id);
            client.commit("corename");
            return id;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "error";
    }

    /**
     * 删除所有的索引
     * @return
     */
    @ResponseBody
    @RequestMapping("/deleteAll")
    public String deleteAll(){
        try {
            client.deleteByQuery("corename","*:*");
            client.commit("corename");
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "error";
    }

    /**
     * 根据id查询索引
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping("/getById")
    public String getById() throws Exception {
        SolrDocument document = client.getById("corename", "d8ce51efde31446bb45317903a3c89d6");
        System.out.println(document);
        return document.toString();
    }

    /**
     * 综合查询: 在综合查询中, 有按条件查询, 条件过滤, 排序, 分页, 高亮显示, 获取部分域信息
     * @return
     */
    @ResponseBody
    @RequestMapping("/search")
    public Map<String, Map<String, List<String>>> search(){

        try {
            SolrQuery params = new SolrQuery();

            //排序
            params.addSort("id", SolrQuery.ORDER.asc);

            //分页
            params.setStart(0);
            params.setRows(20);

            params.set("q", "563817d2e01");

            //只查询指定域
            params.set("fl", "id,cName,cLeadername");

            //默认域
            params.set("df", "id");

            //高亮
            //打开开关
            params.setHighlight(true);
            //指定高亮域
            params.addHighlightField("id");
            //设置前缀
            params.setHighlightSimplePre("<span style='color:red'>");
            //设置后缀
            params.setHighlightSimplePost("</span>");

            QueryResponse queryResponse = client.query(params);

            SolrDocumentList results = queryResponse.getResults();

            long numFound = results.getNumFound();

            System.out.println(numFound);

            //获取高亮显示的结果, 高亮显示的结果和查询结果是分开放的
            Map<String, Map<String, List<String>>> highlight = queryResponse.getHighlighting();

            for (SolrDocument result : results) {
                System.out.println(result.get("id"));
                System.out.println(result.get("cName"));
                System.out.println(result.get("cLeadername"));

                Map<String, List<String>> map = highlight.get(result.get("id"));
                List<String> list = map.get("cName");
                System.out.println(list.get(0));

                System.out.println("------------------");
                System.out.println();
            }
            return highlight;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}