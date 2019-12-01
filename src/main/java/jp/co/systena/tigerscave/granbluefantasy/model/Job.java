package jp.co.systena.tigerscave.granbluefantasy.model;

public abstract class Job {
  
  abstract void fight();

  

  /** 職業名 */
  private String name;

  public Job(String name) {
    // TODO 自動生成されたコンストラクター・スタブ
    this.name = name;
  }
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
    
  }
 
 

}
