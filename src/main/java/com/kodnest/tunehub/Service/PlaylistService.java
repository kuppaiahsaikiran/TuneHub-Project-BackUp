package com.kodnest.tunehub.Service;

import java.util.List;

import com.kodnest.tunehub.Entity.PlayList;

public interface PlaylistService {

//	public void addPlaylist(PlayList playlist);

//	public List<PlayList> fetchAllSongs();

	public boolean playlistExists(PlayList playList);

	public void savePlaylist(PlayList playList);

	public List<PlayList> fetchAllPlaylists();





	




	

}
