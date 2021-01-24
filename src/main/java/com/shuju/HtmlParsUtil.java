package com.shuju;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HtmlParsUtil {
    public HtmlParsUtil() {
    }

    public static void main(String[] args) throws Exception {
        List<beanContext> list = (new HtmlParsUtil()).parseJD("vue");
        Iterator var2 = list.iterator();

        while(var2.hasNext()) {
            Object o = var2.next();
            System.out.println(o+"\n");
        }

    }

    public List<beanContext> parseJD(String keywords) throws Exception {
        String url = "https://search.jd.com/Search?keyword=" + keywords;
        Document document = Jsoup.parse(new URL(url), 2000);
        Element element = document.getElementById("J_goodsList");
        Elements li = element.getElementsByTag("li");
        ArrayList<beanContext> list = new ArrayList();
        Iterator var7 = li.iterator();

        while(var7.hasNext()) {
            Element el = (Element)var7.next();
            String img = el.getElementsByTag("img").eq(0).attr("data-lazy-img");
            String price = el.getElementsByClass("p-price").eq(0).text();
            String title = el.getElementsByClass("p-name").eq(0).text();
            beanContext beanContext = new beanContext(title, price, img);
            list.add(beanContext);
        }

        return list;
    }
}