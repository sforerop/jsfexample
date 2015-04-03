///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package edu.uniandes.ecos.herokujsf;
//
//import java.io.File;
//import java.io.IOException;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// *
// * @author Usuario
// */
//public class App extends HttpServlet {
//
//    public static void main(String[] arg) throws Exception {
//        String port = System.getenv("PORT");
//        GlassFishProperties gfProps = new GlassFishProperties();
//        if(port !=null){
//            gfProps.setPort("http-listener", Integer.parseInt(port));
//        }else{
//            gfProps.setPort("http-listener", 8080);
//        }        
//        GlassFish glassfish = GlassFishRuntime.bootstrap().newGlassFish(gfProps);
//        glassfish.start();
//        Deployer deployer = glassfish.getDeployer();
//        File file = new File("C:/NetBeanProyect/ejemplojsf/herokujsf/target/herokujsf-1.0-SNAPSHOT.war");
//        deployer.deploy(file);
//    }
//
//    @Override
//    public void doPost(HttpServletRequest req, HttpServletResponse resp)
//            throws ServletException, IOException {
//    }
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
//            throws ServletException, IOException {
//    }
//}
