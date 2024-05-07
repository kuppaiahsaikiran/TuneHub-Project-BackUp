package com.kodnest.tunehub.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kodnest.tunehub.Entity.Song;
@Repository
public interface SongRepository  extends JpaRepository<Song, Integer>{

	Song findByName(String name);

}
