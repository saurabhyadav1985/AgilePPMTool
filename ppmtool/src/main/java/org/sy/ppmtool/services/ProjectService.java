package org.sy.ppmtool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sy.ppmtool.domain.Project;
import org.sy.ppmtool.repositories.ProjectRepository;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOfUpdateProject(Project project){
        //logic
        return projectRepository.save(project);
    }
}
