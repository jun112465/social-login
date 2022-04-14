package jun.practice.sociallogin;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;
import java.io.IOException;

@Controller
public class MainController {

    static class DataVo{
        private String id;
        private String name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    @PostMapping ("/kakao")
    @ResponseBody
    public DataVo rootController(@RequestBody DataVo data){
        System.out.println(data);
        return data;
    }

//    @RequestMapping("/kakao")
//    public void requestParamV1(HttpServletRequest req, HttpServletResponse res) throws IOException {
//        String name = req.getParameter("name");
////        Integer age = Integer.parseInt(req.getParameter("age"));
////        log.info("username={}, age={}",name, age);
//        res.getWriter().write("ok");
//    }
}
