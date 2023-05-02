package com.eckirch.picross.puzzle;

import javax.persistence.*;


public class GameData 
{
	  @Id
	  @Column(name="gameID")
	  private Integer gameID;
	 
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  
	  private String hintsLeft;
	  
	  private String difficulty;
	  
	  public Integer getId()
	  {
		  return gameID;
	  }
	  
	  public void setId(Integer num)
	  {
		  gameID = num;
	  }
	  
	  public String getHintsLeft()
	  {
		  return hintsLeft;
	  }
	  
	  public void setHintsLeft(String num)
	  {
		  hintsLeft = num;
	  }
	  
	  public String getDifficulty()
	  {
		  return difficulty;
	  }
	  
	  public void setDifficulty(String num)
	  {
		  difficulty = num;
	  }
}
