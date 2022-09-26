package ru.geekbrains.spring1.lesson1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(ProductServlet.class);
    private List<Product> list;


    @Override
    public void init() throws ServletException {
        list = new ArrayList<>();
        list.add(new Product(1l, "1", 10) );
        list.add(new Product(2l, "2", 10) );
        list.add(new Product(3l, "3", 10) );
        list.add(new Product(4l, "4", 10) );
        list.add(new Product(5l, "5", 10) );
        list.add(new Product(6l, "6", 10) );
        list.add(new Product(7l, "7", 10) );
        list.add(new Product(8l, "8", 10) );
        list.add(new Product(9l, "9", 10) );
        list.add(new Product(10l, "10", 10) );
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().printf("<html><body>");
        for (int i = 0; i < list.size(); i++) {
            resp.getWriter().printf("<h1>Product" + list.get(i) + "</h1>");
        }
        resp.getWriter().printf("</body></html>");
        resp.getWriter().close();
    }
}