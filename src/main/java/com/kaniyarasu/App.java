package com.kaniyarasu;

import com.kaniyarasu.stock.Stock;
import com.kaniyarasu.util.HibernateUtil;
import org.hibernate.Session;

/**
 * Created by IntelliJ IDEA.
 * User: kaniyarasu
 * Date: 4/3/13
 * Time: 5:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        Stock stock = new Stock();

        stock.setStockId(1);
        stock.setStockCode("TestCode");
        stock.setStockName("TestName");

        session.save(stock);
        session.getTransaction().commit();
    }
}
