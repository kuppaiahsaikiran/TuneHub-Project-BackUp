package com.kodnest.tunehub.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kodnest.tunehub.Entity.Song;
@Service
public interface SongService {

	public void saveSong(Song song);


	public boolean songExists(Song song);


	public List<Song> fetchAllSongs();


	public void updateSong(Song song);

}
