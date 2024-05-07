package com.kodnest.tunehub.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.tunehub.Entity.Song;
import com.kodnest.tunehub.Repository.SongRepository;
import com.kodnest.tunehub.Service.SongService;
@Service
public class SongServiceImpl implements SongService{
	
	@Autowired
	SongRepository songRepository;

	@Override
	public void saveSong(Song song) {
		songRepository.save(song);
		
	}

	@Override
	public boolean songExists(Song song) {
		Song existingsong =songRepository.findByName(song.getName());
		if(existingsong!=null) {
			System.out.println("Song Present");
			return true;
		}
		else {
			System.out.println("Song Absent");
			return false;
			
		}

		
	}

	@Override
	public List<Song> fetchAllSongs() {

		List<Song> songs = songRepository.findAll();
		
		return songs;
	}

	@Override
	public void updateSong(Song song) {

		songRepository.save(song);
	}

	
	
}
