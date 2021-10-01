package com.empresa.wssbmongodb.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.wssbmongodb.domain.Post;
import com.empresa.wssbmongodb.repository.PostRepository;
import com.empresa.wssbmongodb.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;
	
	public Post findById(String id) {
		Optional<Post> obj = postRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
<<<<<<< HEAD
	
	public List<Post> findByTitle(String text){
		return postRepository.searchTitle(text);
	}
=======
>>>>>>> bda7931ed228055377fc377764685544c83cd874
}
