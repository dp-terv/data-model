package hu.bme.mit.v37zen.sm.jpa.repositories;

import hu.bme.mit.v37zen.sm.jpa.datamodel.Account;
import hu.bme.mit.v37zen.sm.jpa.datamodel.AccountContactAssociation;
import hu.bme.mit.v37zen.sm.jpa.datamodel.Contact;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountContactAssociationRepository extends JpaRepository<AccountContactAssociation, Long>{

	List<AccountContactAssociation> findById(Long id);
	
	List<AccountContactAssociation> findByStatus(String status);
	
	List<AccountContactAssociation> findByStartDate(String startDate);

	List<AccountContactAssociation> findByAccountMRID(String mRID);
	
	List<AccountContactAssociation> findByContactMRID(String mRID);
	
	List<AccountContactAssociation> findByAccount(Account account);
	
	List<AccountContactAssociation> findByContact(Contact contact);
}
