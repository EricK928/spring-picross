package com.eckirch.picross.puzzle;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class UserPuzzles 
{
	  @Id
	  @Column(name="dataID")
	  private Integer dataID;
	  
	  @GeneratedValue(strategy=GenerationType.AUTO)

	  private String puzzleName;
	  
	  private String timesCompleted;
	  
	  private String puzzleCodes;
	  
	  
	  /**
	   * Getter method for reading the value of puzzleID
	   * @return The global variable puzzleID, an Integer
	   */
	  public Integer getId()
	  {
		  return dataID;
	  }
	  
	  /**
	   * Setter method for the global variable puzzleID
	   * @param num: The integer that puzzleID will be set to
	   */
	  public void setId(Integer num)
	  {
		  dataID = num;
	  }
	  
	  public String getPuzzleName()
	  {
		  return puzzleName;
	  }
	  
	  public void setPuzzleName(String num)
	  {
		  puzzleName = num;
	  }
	  
	  public String getTimesCompleted()
	  {
		  return timesCompleted;
	  }
	  
	  public void setTimesCompleted(String num)
	  {
		  timesCompleted = num;
	  }
	  
	  public String getPuzzleCodes()
	  {
		  return puzzleCodes;
	  }
	  
	  public void setPuzzleCodes(String num)
	  {
		  puzzleCodes = num;
	  }

}
