package ra.ss10_bt1;

import model.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/customerServlet")

public class CustomerServlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Mai Văn Hoàn", "1983-08-20", "Hà Nội", "https://gcs.tripi.vn/public-tripi/tripi-feed/img/474097scO/4k-nature-wallpaper_104834870.jpg"));
        customers.add(new Customer("Nguyễn Văn Nam", "1983-08-21", "Bắc Giang", "https://cdn.vn.alongwalk.info/wp-content/uploads/2023/03/17164303/image-bst-300-hinh-anh-cay-xanh-thien-nhien-dep-nhat-lam-hinh-nen-167902098379800.jpg"));
        customers.add(new Customer("Nguyễn Thái Hòa", "1983-08-22", "Nam Định", "https://m.yodycdn.com/blog/hinh-nen-thien-nhien-4k-yody-vn-162.jpg"));
        customers.add(new Customer("Trần Đăng Khoa", "1983-08-17", "Hà Tây", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSwmH9TKYOMinL8APyXiVR9s2-NbCRXcrvqgQ&s"));
        customers.add(new Customer("Nguyễn Đình Thi", "1983-08-19", "Hà Nội", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRySvmoQ9liqn8_GWvRtShCUz_pm9YSAmGuTg&s"));
        req.setAttribute("customerList", customers);
        req.getRequestDispatcher("customer.jsp").forward(req, resp);
    }

}
