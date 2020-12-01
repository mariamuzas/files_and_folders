package com.codeclan.example.files_folders;

import com.codeclan.example.files_folders.models.File;
import com.codeclan.example.files_folders.models.Folder;
import com.codeclan.example.files_folders.models.User;
import com.codeclan.example.files_folders.repositories.FileRepository;
import com.codeclan.example.files_folders.repositories.FolderRepository;
import com.codeclan.example.files_folders.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class FilesFoldersApplicationTests {

	@Autowired
	FileRepository fileRepository;
	@Autowired
	FolderRepository folderRepository;
	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createFileAndFolderSave(){
		User user = new User("Maria");
		userRepository.save(user);
		Folder folder = new Folder("CodeClan", user);
		folderRepository.save(folder);
		File file = new File("Notes", "doc", "23mb", folder );
		fileRepository.save(file);
	}

}
