package jp.co.systena.tigerscave.granbluefantasy.model;

public class Fighter extends Job {

  public Fighter(String name) {
    super(name);
    // TODO 自動生成されたコンストラクター・スタブ
  }

  /** 職業名 */
  private String name;


  

  @Override
  void fight() {
    // TODO 自動生成されたメソッド・スタブ
    System.out.println("｛名前｝は剣で攻撃した！");
  }

}
