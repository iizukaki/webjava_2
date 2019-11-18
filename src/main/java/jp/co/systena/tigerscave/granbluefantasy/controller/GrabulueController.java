package jp.co.systena.tigerscave.granbluefantasy.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import jp.co.systena.tigerscave.granbluefantasy.model.Fighter;
import jp.co.systena.tigerscave.granbluefantasy.service.ListHuman;

@Controller // Viewあり。Viewを返却するアノテーション
public class GrabulueController {
  
  @Autowired
  HttpSession session;
  
  @Autowired
  ListHuman listhuman;
  
  
  @RequestMapping(value = "/mypage", method = RequestMethod.GET)
  public ModelAndView mypage(ModelAndView mav) {

     Fighter fighter = new Fighter();
     
      mav.addObject("humanlist", fighter); // (2)

      // 使用するビューを設定
      mav.setViewName("GameView"); // (3)

      return mav;
  }

}
