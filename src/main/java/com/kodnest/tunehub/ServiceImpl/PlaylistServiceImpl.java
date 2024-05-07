package com.kodnest.tunehub.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.tunehub.Entity.PlayList;
import com.kodnest.tunehub.Repository.PlaylistRepository;
import com.kodnest.tunehub.Service.PlaylistService;

@Service
public class PlaylistServiceImpl implements PlaylistService {

	@Autowired
	PlaylistRepository playlistRepository;
//	@Override
//	public void addPlaylist(PlayList playlist) {
//		PlayList existingPlaylist= playlistRepository.findByName(playlist.getName());
//		if(existingPlaylist==null) {
//			playlistRepository.save(playlist);
//
//		}
//		else {
//			System.out.println("Playlist Already Existed");
//		}
//	}
	
	
	
	


	@Override
	public boolean playlistExists(PlayList playList) {
		PlayList existingplaylist =playlistRepository.findFirstByName(playList.getName());
		if(existingplaylist!=null) {
			System.out.println("Playlist Present");
			return true;
		}
		else {
			System.out.println("Playlist Absent");
			return false;
			
		}
	}



	@Override
	public void savePlaylist(PlayList playList) {

		playlistRepository.save(playList);
	}
	
	
//	@Override
//	public List<PlayList> fetchAllSongs() {
//
//		List<PlayList> songs = playlistRepository.findAll();
//
//		return songs;
//	}

	
	
	@Override
	public List<PlayList> fetchAllPlaylists() {

		List<PlayList> songs = playlistRepository.findAll();

		return songs;
	}

}



















