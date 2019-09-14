package exceprion;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Component
public class MyException implements HandlerExceptionResolver {
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView modelAndView = new ModelAndView();
        if(ex instanceof MaxUploadSizeExceededException){
            modelAndView.setViewName("exception");
            modelAndView.addObject("msg","图片太大了a");
        }else {
            modelAndView.setViewName("ex");
            modelAndView.addObject("msg","出错误了...");
        }
        return modelAndView;
    }
}
