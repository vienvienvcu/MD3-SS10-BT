package ra.ss10_bt1;

import model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/productServlet")
public class ProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"bim bim","https://lh4.googleusercontent.com/proxy/F4BdVu8_AMTCz5x3RzYIt_QgU44xqVFsE94sxMz-wKrEU_BUgkpMjKM5vI82n_r70aq3q5JMizpb1M7lZWxkjFd_6pNeXIfX9g507uU583OuiVYErhE",1200,12));
        products.add(new Product(2,"colo cola","https://file.hstatic.net/1000304337/file/coca1-min_30a4999362c740389cba6a09fbb7164b_1024x1024.jpg",1500,5));
        products.add(new Product(3,"khoai tay","https://cdn2.fptshop.com.vn/unsafe/1920x0/filters:quality(60)/2024_1_18_638411958438078614_cach-lam-khoai-tay-chien-bo-thumb.jpg",2000,9));
        req.setAttribute("productList", products);
        req.getRequestDispatcher("product.jsp").forward(req, resp);
    }
}
