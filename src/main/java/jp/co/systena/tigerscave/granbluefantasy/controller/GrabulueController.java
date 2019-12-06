package jp.co.systena.tigerscave.granbluefantasy.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
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

  
  @RequestMapping(value="/mypage", method = RequestMethod.GET)          // URLとのマッピング
  public ModelAndView index(ModelAndView mav) {
    // Viewに渡すデータを設定
    // セッション情報から保存したデータを取得してメッセージを生成
    JobForm JobForm = (JobForm) session.getAttribute("form");
    session.removeAttribute("form");
    if (JobForm != null) {
      mav.addObject("message", JobForm.getUsername()+"を保存しました");
    }
    mav.addObject("JobForm", new JobForm());  // 新規クラスを設定

    

    BindingResult bindingResult = (BindingResult) session.getAttribute("result");
    if (bindingResult != null) {
      mav.addObject("bindingResult", bindingResult);
    }
    // Viewのテンプレート名を設定
    mav.setViewName("GameView");
    return mav;
  }
  

  //ここにあたらしいPOSTメソッドを書く

  @RequestMapping(value = "/mypage", method = RequestMethod.POST) // URLとのマッピング
  public ModelAndView command(ModelAndView mav) {

    // 変数式
    // ・コントローラーからテンプレートに値を渡す
    // ・変数「msg」に値を設定
    mav.addObject("message", JobForm.getUsername());

    // 使用するビューを設定
    mav.setViewName("Command"); // (3)

    return mav;
  }
/*  
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
 */

}
