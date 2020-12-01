package com.codeclan.example.files_folders.components;

import com.codeclan.example.files_folders.models.File;
import com.codeclan.example.files_folders.models.Folder;
import com.codeclan.example.files_folders.models.User;
import com.codeclan.example.files_folders.repositories.FileRepository;
import com.codeclan.example.files_folders.repositories.FolderRepository;
import com.codeclan.example.files_folders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        User user = new User("Maria");
        userRepository.save(user);

        Folder folder = new Folder("CodeClan", user);
        folderRepository.save(folder);

        File file = new File("Notes", "doc", "23mb", folder );
        fileRepository.save(file);

        File file2 = new File("python_code", "py", "23mb", folder );
        fileRepository.save(file2);

        File file3 = new File("JS_code", "js", "40mb", folder );
        fileRepository.save(file3);
    }
}
