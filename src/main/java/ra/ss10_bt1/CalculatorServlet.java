package ra.ss10_bt1;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "CalculatorServlet",value = "/calculatorServlet")
public class CalculatorServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/index.jsp"); // Chuyển hướng đến trang index.jsp nếu người dùng truy cập bằng phương thức GET
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        double number1 = Double.parseDouble(req.getParameter("number1"));
        double number2 = Double.parseDouble(req.getParameter("number2"));
        String operator = req.getParameter("operator");

        double result = 0.0;
        String message = "";
        try {
            switch (operator) {
                case "add" :
                    result = number1 + number2;
                    break;
                case "subtract" :
                    result = number1 - number2;
                    break;
                case "multiply" :
                    result = number1 * number2;
                    break;
                case "divide" :
                    if (number1 == 0){
                        message = "Division by zero";
                    }else {
                        result = number1/ number2;
                    }
                    break;
                default:
                    message = "Operator not recognized";
            }

        }catch ( Exception e ) {
            message = "Error: " + e.getMessage();
        }
        req.setAttribute("number1", number1);
        req.setAttribute("number2", number2);
        req.setAttribute("result", result);
        req.setAttribute("operator", operator);
        req.setAttribute("message", message);
        req.getRequestDispatcher("/result.jsp").forward(req, resp);

    }
}
