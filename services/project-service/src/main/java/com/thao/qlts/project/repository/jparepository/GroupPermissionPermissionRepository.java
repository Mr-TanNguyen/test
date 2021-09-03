package com.thao.qlts.project.repository.jparepository;

import com.thao.qlts.project.entity.GroupPermissionPermissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupPermissionPermissionRepository extends JpaRepository<GroupPermissionPermissionEntity, Long> {
}
