package ra.ss10_bt1;

import model.DataProduct;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "AddProductServlet" ,value = "/dddProductServlet")
public class AddProductServlet extends HttpServlet {
   public static List<DataProduct> products = new ArrayList<>();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        String image = req.getParameter("image");
        String priceStr = req.getParameter("price");
        String stockStr = req.getParameter("stock");
        double price = 0.0;
        int stock = 0;
        // Kiểm tra và chuyển đổi giá trị price
        if (priceStr != null && !priceStr.trim().isEmpty()) {
            try {
                price = Double.parseDouble(priceStr.trim());
            } catch (NumberFormatException e) {
                price = 0.0;

            }
        }

        // Kiểm tra và chuyển đổi giá trị stock
        if (stockStr != null && !stockStr.trim().isEmpty()) {
            try {
                stock = Integer.parseInt(stockStr.trim());
            } catch (NumberFormatException e) {

                stock = 0;

            }
        }

        // Tạo đối tượng DataProduct và thêm vào danh sách
        DataProduct product = new DataProduct(name, image, price, stock);
        products.add(product);

        // Đặt danh sách sản phẩm vào request attribute
        req.setAttribute("newProducts", products);

        // Chuyển hướng đến trang kết quả
        req.getRequestDispatcher("/resultProduct.jsp").forward(req, resp);
    }
}
