package im.action;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p></p>
 *
 * @author dengzq19913
 * @version $Id: HomeController.java  2017-01-04  11:06 dengzaiqiang $
 */
public class HomeController implements Controller{
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("hello");
    }
}
