

package com.example.demo.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.demo.entity.userlogin;

	public interface userloginRepo extends JpaRepository<userlogin, Integer>
	{
		@Query("from userlogin where userName=?1 and password=?2")
		public userlogin findByUsernamePassword(String userName, String password);
}
