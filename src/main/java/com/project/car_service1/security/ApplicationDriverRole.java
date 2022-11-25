//package com.project.car_service1.security;
//
//import org.thymeleaf.expression.Sets;
//import com.google.common.collect.Sets;
//import java.util.Set;
//
//import static com.project.car_service1.security.ApplicationDriverPermission.*;
//
//public enum ApplicationDriverRole {
//    DRIVER(Sets.newHashSet()),
//    ADMIN(Sets.newHashSet(COURSE_READ,COURSE_WRITE,STUDENT_READ,STUDENT_WRITE));
//
//    private final Set<ApplicationDriverPermission> permessions;
//
//    ApplicationDriverRole(Set<ApplicationDriverPermission> permessions) {
//        this.permessions = permessions;
//    }
//
//    public Set<ApplicationDriverPermission> getPermessions() {
//        return permessions;
//    }
//}
