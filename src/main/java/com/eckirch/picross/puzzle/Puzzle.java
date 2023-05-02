package com.eckirch.picross.puzzle;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;
/**
 * @author Eric Kirch
 * The Puzzle entity, used for creating the puzzles table via Hibernate, contains methods to get and modify puzzle data
 */

@Entity // This tells Hibernate to make a table out of this class
@Table(name="puzzles")//Tells Hibernate what the name of the table will be
public class Puzzle 
{
	
	  /**
	   *A Random Number, The unique key for each puzzle
	   */
	  @Id
	  @Column(name="puzzleID")
	  private Integer puzzleID;
	  
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  
	  /**
	   *The UserID of the user who has created the puzzle
	   */
	  //@OneToOne(targetEntity=User.class)
	  //@JoinColumn(name="user_id")	 
	  private Integer creatorID;
	  
	  /**
	   *User input, the name of the puzzle
	   */
	  private String puzzleName;
	  
	  /**
	   *Size of the puzzle
	   */
	  private Integer puzzleWidth;
	  
	  private Integer puzzleHeight;
	  
	  /**
	   * The amount of times the puzzle has been completed
	   */
	  private Integer timesCompleted;
	  
	  /**
	   * The URL as to where the image for the puzzle is stored in the database
	   */
	  private String puzzleData;
	  
	  
	  /**
	   * Getter method for reading the value of puzzleID
	   * @return The global variable puzzleID, an Integer
	   */
	  public Integer getId()
	  {
		  return puzzleID;
	  }
	  
	  /**
	   * Setter method for the global variable puzzleID
	   * @param num: The integer that puzzleID will be set to
	   */
	  public void setId(Integer num)
	  {
		  puzzleID = num;
	  }

	  /**
	   * Getter method for reading the value of CreatorID
	   * @return The global variable CreatorID, an Integer
	   */
	  public Integer getCreatorId()
	  {
		  return creatorID;
	  }
	  
	  /**
	   * Setter method for the global variable CreatorID
	   * @param num: The integer that CreatorID will be set to
	   */
	  public void setCreatorId(Integer num)
	  {
		  creatorID = num;
	  }
	  
	  /**
	   * Getter method for reading the value of puzzleName
	   * @return The global variable puzzleName, a String
	   */
	  public String getPuzzleName()
	  {
		  return puzzleName;
	  }
	  
	  /**
	   * Setter method for the global variable PuzzleName
	   * @param name: The String that PuzzleName will be set to
	   */
	  public void setPuzzleName(String name)
	  {
		  puzzleName = name;
	  }
	  
	  
	  /**
	   * Getter method for reading the value of TimesCompleted
	   * @return The global variable TimesCompleted, an Integer
	   */
	  public Integer getTimesCompleted()
	  {
		  return timesCompleted;
	  }
	  
	  public void setTimesCompleted(Integer num)
	  {
		  timesCompleted = num;
	  }
	  
	  public Integer getPuzzleWidth()
	  {
		  return puzzleWidth;
	  }
	  
	  public void setPuzzleWidth(Integer num)
	  {
		  puzzleWidth = num;
	  }
	  
	  public Integer getPuzzleHeight()
	  {
		  return puzzleHeight;
	  }
	  
	  public void setPuzzleHeight(Integer num)
	  {
		  puzzleHeight = num;
	  }
	  /**
	   * Getter method for reading the value of PuzzleData
	   * @return The global variable PuzzleData, a String
	   */
	  public String getPuzzleData()
	  {
		  return puzzleData;
	  }
	  
	  /**
	   * Setter method for the global variable PuzzleData
	   * @param name: The String that PuzzleData will be set to
	   */
	  public void setPuzzleData(String puz)
	  {
		  puzzleData=puz;
	  }
}
