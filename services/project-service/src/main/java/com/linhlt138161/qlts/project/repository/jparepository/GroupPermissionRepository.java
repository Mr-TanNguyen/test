package com.linhlt138161.qlts.project.repository.jparepository;

import com.linhlt138161.qlts.project.entity.GroupPermissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupPermissionRepository extends JpaRepository<GroupPermissionEntity, Long> {
}
