package com.gmsj.common.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Servlet Filter implementation class IndexFilter
 */
@WebFilter("/IndexFilter")
public class IndexFilter implements Filter {

    /**
     * Default constructor.
     */
    public IndexFilter() {
        // TODO Auto-generated constructor stub
    }

    // XSS处理Map
    private static Map<String, String> xssMap = new LinkedHashMap<String, String>();

    public void init(FilterConfig filterConfig) throws ServletException {
        // 含有脚本： script
        xssMap.put("[s|S][c|C][r|R][i|C][p|P][t|T]", "");
        // 含有脚本 javascript
        xssMap.put(
                "[\\\"\\\'][\\s]*[j|J][a|A][v|V][a|A][s|S][c|C][r|R][i|I][p|P][t|T]:(.*)[\\\"\\\']",
                "\"\"");
        // 含有函数： eval
        xssMap.put("[e|E][v|V][a|A][l|L]\\((.*)\\)", "");
        // 含有符号 <
        xssMap.put("<", "&lt;");
        // 含有符号 >
        xssMap.put(">", "&gt;");
        // 含有符号 (
        xssMap.put("\\(", "(");
        // 含有符号 )
        xssMap.put("\\)", ")");
        // 含有符号 '
        xssMap.put("'", "'");
        // 含有符号 "
        xssMap.put("\"", '"' + "");
    }

    /**
     * @see Filter#destroy()
     */
    public void destroy() {
        // TODO Auto-generated method stub
    }

    /**
     * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
     */
    public void doFilter(ServletRequest req, ServletResponse res,
                         FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;

        {
            int index = request.getRequestURL().toString().indexOf("//en.");
            String lang = "cn";
            if (index > 0) {
                lang = "en";
            }
            request.getSession().setAttribute("language", lang);
        }

        HttpRequestWrapper httpReqWarp = new HttpRequestWrapper(request, xssMap);
        Enumeration params = req.getParameterNames();
        String sql = "";
        while (params.hasMoreElements()) {
            // 得到参数名
            String name = params.nextElement().toString();
            // System.out.println("name===========================" + name +
            // "--");
            // 得到参数对应值
            String[] value = req.getParameterValues(name);
            for (int i = 0; i < value.length; i++) {
                sql = sql + value[i];
            }
        }
        if (sqlValidate(sql)) {
            //返回首页 如果被拦截则返回首页
            String url = request.getRequestURL().substring(0, request.getRequestURL().indexOf(request.getRequestURI())) + "/index";
            response.sendRedirect(url);
            return;
        } else
            chain.doFilter(httpReqWarp, res);

    }

    // 效验
    protected static boolean sqlValidate(String str) {
        str = str.toLowerCase();// 统一转为小写
        String badStr = "'|and|exec|execute|insert|select|delete|update|count|drop|*|%|chr|mid|master|truncate|"
                + "char|declare|sitename|net user|xp_cmdshell|;|or|-|+|,|like'|and|exec|execute|insert|create|drop|"
                + "table|from|grant|use|group_concat|column_name|"
                + "information_schema.columns|table_schema|union|where|select|delete|update|order|by|count|*|"
                + "chr|mid|master|truncate|char|declare|or|;|-|--|+|,|like|//|/|%|#";// 过滤掉的sql关键字，可以手动添加
        String[] badStrs = badStr.split("\\|");
        for (int i = 0; i < badStrs.length; i++) {
            if (str.indexOf(badStrs[i]) >= 0) {
                return true;
            }
        }
        return false;
    }

}
