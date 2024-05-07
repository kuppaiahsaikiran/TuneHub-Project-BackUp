package com.kodnest.tunehub.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kodnest.tunehub.Entity.PlayList;
import com.kodnest.tunehub.Entity.Song;
import com.kodnest.tunehub.Service.PlaylistService;
import com.kodnest.tunehub.Service.SongService;


@Controller
public class PlaylistController {

	@Autowired
	PlaylistService playlistService;
	
	
	
	@Autowired
	SongService songService;
	
	@GetMapping("/createplaylists")
	public String createPlaylist(Model model) {
		List<Song> songList = songService.fetchAllSongs();
		model.addAttribute("songs", songList);
		return "createplaylist";
	}
	
//	@PostMapping("/addplaylist")
//	public String addplaylist(@ModelAttribute PlayList playlist) {
//		playlistService.addPlaylist(playlist);
//		
//		//updating the song_playlists table
//		
//
//		List<Song> songs = playlist.getSongs();
//		for(Song song : songs) {
//			 song.getPlaylist().add(playlist);
//			 songService.updateSong(song);
//		}
//			
//		return "adminhome";
//	}
	
	
	
	@PostMapping("/addplaylist")

	public String addPlaylist( @ModelAttribute PlayList playList) {

		//			Checking Song is present or not
		boolean playlistExists = playlistService.playlistExists(playList);

		if(playlistExists==false) {
			playlistService.savePlaylist(playList);

			System.out.println("Playlist added successfully");
		}

		else {

			System.out.println("Duplicate Playlist");

		}
		return "adminhome";

	}

	
	@GetMapping("/viewplaylists")
	public String viewPlaylists(Model model) {
	    List<PlayList> playlists = playlistService.fetchAllPlaylists(); // Update method name
	    model.addAttribute("playlists", playlists);
	    return "viewplaylists";
	}

	
	
//	@GetMapping("/viewplaylists")
//	public String viewsongs(Model model ) {
//		boolean premium=true;
//		if(premium) {
//			List<PlayList> playlist= playlistService.fetchAllSongs();
//			
//			model.addAttribute("playlists", playlist);
//			
//			System.out.println(playlist);
//			
//			return "viewplaylists";

			
//		}
//		else {
//			return "pay";
//		}
		
		


//	}

}

	
	