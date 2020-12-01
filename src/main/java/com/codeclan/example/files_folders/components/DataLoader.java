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

        User user2 = new User("Gabriel");
        userRepository.save(user2);

        Folder folder = new Folder("CodeClan", user);
        folderRepository.save(folder);

        Folder folder2 = new Folder("Work", user2);
        folderRepository.save(folder2);

        File fileWork = new File("CV", "pdf", "30kB", folder2 );
        fileRepository.save(fileWork);

        File fileWork2 = new File("Expenses", "xls", "40kB", folder2 );
        fileRepository.save(fileWork2);

        File fileWork3 = new File("Cover_Letter", "doc", "40kB", folder2 );
        fileRepository.save(fileWork3);

        File file = new File("Notes", "doc", "23kB", folder );
        fileRepository.save(file);

        File file2 = new File("python_code", "py", "40kB", folder );
        fileRepository.save(file2);

        File file3 = new File("JS_code", "js", "48kB", folder );
        fileRepository.save(file3);
    }
}
