package com.example.quranapp.Models.AyatModel;

import com.google.gson.annotations.SerializedName;

public class Filters{

	@SerializedName("chapter_number")
	private String chapterNumber;

	@SerializedName("chapter_numberr")
	private String chapterNumberr;

	public String getChapterNumber(){
		return chapterNumber;
	}

	public String getChapterNumberr(){
		return chapterNumberr;
	}

	@Override
 	public String toString(){
		return 
			"Filters{" + 
			"chapter_number = '" + chapterNumber + '\'' +
					"chapter_numberr = '" + chapterNumberr + '\'' +
					"}";
		}
}