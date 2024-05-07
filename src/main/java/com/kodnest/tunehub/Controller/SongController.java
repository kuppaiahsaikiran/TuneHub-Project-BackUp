package com.kodnest.tunehub.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kodnest.tunehub.Entity.Song;
import com.kodnest.tunehub.Service.SongService;
@Controller
public class SongController {

	@Autowired
	SongService songService;

	@PostMapping("/addsong")

	public String addSong( @ModelAttribute Song song) {

		//			Checking Song is present or not
		boolean songExists = songService.songExists(song);

		if(songExists==false) {
			songService.saveSong(song);

			System.out.println("Song added successfully");
		}

		else {

			System.out.println("Duplicate Song");

		}
		return "adminhome";

	}


	@GetMapping("/playsongs")
	public String playsongs(Model model ) {
		boolean premium=true;
		if(premium) {
			List<Song> songslist= songService.fetchAllSongs();

			model.addAttribute("songs", songslist);

			System.out.println(songslist);

			return "viewsongs";


		}
		else {
			return "pay";
		}




	}

	@GetMapping("/viewsongs")
	public String viewsongs(Model model ) {
			List<Song> songslist= songService.fetchAllSongs();

			model.addAttribute("songs", songslist);

			System.out.println(songslist);

			return "viewsongs";


		}
		




	}

	



