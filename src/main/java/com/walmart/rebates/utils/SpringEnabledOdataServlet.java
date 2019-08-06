package com.walmart.rebates.utils;


import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.olingo.odata2.api.ODataServiceFactory;  
import org.apache.olingo.odata2.core.servlet.ODataServlet;
import org.apache.olingo.odata2.core.servlet.RestUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SpringEnabledOdataServlet extends ODataServlet {
    private static final long serialVersionUID = -2082253378482260378L;
    public static String Str ;
    private final ApplicationContext applicationContext;

    public SpringEnabledOdataServlet(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        ODataServiceFactory oDataServiceFactory = applicationContext.getBean(ODataServiceFactory.class);
        req.setAttribute(ODataServiceFactory.FACTORY_INSTANCE_LABEL, oDataServiceFactory);
        Map<String, List<String>> list =  RestUtil.extractAllQueryParameters(req.getQueryString());
        
        int len , len2 ;
         len =   list.values().toArray().toString().length() ;
         len2 = len - 10 ;
         String str1[] = list.values().toString().split(" ") ;
         if (str1.length == 13 )  {
             Str = str1[7] ; }
        super.service(req, resp);
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }

}
