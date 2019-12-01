package jp.co.systena.tigerscave.granbluefantasy.service;

import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.stereotype.Service;
import jp.co.systena.tigerscave.granbluefantasy.model.Fighter;
import jp.co.systena.tigerscave.granbluefantasy.model.Job;
import jp.co.systena.tigerscave.granbluefantasy.model.Witch;

@Service
public class ListJob {

  public Map<String, Job> getJobList(){

    Job job1 = new Fighter("戦士");
    Job job2 = new Witch("魔法使い");


    Map<String, Job> jobListMap = new LinkedHashMap<String, Job>();

      jobListMap.put(job1.getName(), job1);
      jobListMap.put(job2.getName(), job2);

      return jobListMap;
  }

}
