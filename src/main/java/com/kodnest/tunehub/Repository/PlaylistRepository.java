package com.kodnest.tunehub.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kodnest.tunehub.Entity.PlayList;
@Repository
public interface PlaylistRepository extends JpaRepository<PlayList, Integer> {

//	PlayList findByName(String name);
	PlayList findFirstByName(String name);

//	PlayList findByName(String name);








}
