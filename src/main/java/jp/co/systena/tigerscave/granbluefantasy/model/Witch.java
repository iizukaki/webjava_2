package jp.co.systena.tigerscave.granbluefantasy.model;

public class Witch extends Job {

  /** 職業名 */
  private String name;

  public Witch(String name) {
    // TODO 自動生成されたコンストラクター・スタブ
    super(name);
  } 

  @Override
  void fight() {
    // TODO 自動生成されたメソッド・スタブ
    System.out.println("｛名前｝はまほうで攻撃した！");
  }
  
  /** */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
