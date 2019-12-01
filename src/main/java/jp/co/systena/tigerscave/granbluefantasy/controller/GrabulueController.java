package jp.co.systena.tigerscave.granbluefantasy.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import jp.co.systena.tigerscave.granbluefantasy.model.JobForm;
import jp.co.systena.tigerscave.granbluefantasy.service.ListJob;

@Controller // Viewあり。Viewを返却するアノテーション
public class GrabulueController {

  @Autowired
  HttpSession session;

  @Autowired
  ListJob listJob;


  @RequestMapping(value = "/mypage", method = RequestMethod.GET)//初期表示用のGET
  public ModelAndView mypage(ModelAndView mav) {

    mav.addObject("JobFome", new JobForm());// (2)
      // 使用するビューを設定
      mav.setViewName("GameView"); // (3)

      return mav;
  }
  //ここにあたらしいPOSTメソッドを書く

  @RequestMapping(value = "/mypage", method = RequestMethod.POST) // URLとのマッピング
  public ModelAndView command(ModelAndView mav) {

    // 変数式
    // ・コントローラーからテンプレートに値を渡す
    // ・変数「msg」に値を設定
    mav.addObject("msg", "コントローラーからテンプレートに値を渡す"); // (2)

    // 使用するビューを設定
    mav.setViewName("Command"); // (3)

    return mav;
  }
  
  //リザルト画面のGET
  @RequestMapping(value = "/result", method = RequestMethod.GET)//初期表示用のGET
  public ModelAndView result(ModelAndView mav) {

    // 変数式
    // ・コントローラーからテンプレートに値を渡す
    // ・変数「msg」に値を設定
    mav.addObject("msg", "コントローラーからテンプレートに値を渡す"); // (2)

    // 使用するビューを設定
    mav.setViewName("ResultView"); // (3)

    return mav;
  }
 

}
