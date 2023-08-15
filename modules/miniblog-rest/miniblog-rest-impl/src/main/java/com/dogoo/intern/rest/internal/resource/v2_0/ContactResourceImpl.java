package com.dogoo.intern.rest.internal.resource.v2_0;

import com.dogoo.intern.rest.dto.v2_0.Contact;
import com.dogoo.intern.rest.internal.service.ContactService;
import com.dogoo.intern.rest.resource.v2_0.ContactResource;

import com.liferay.portal.vulcan.pagination.Page;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author duynd
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v2_0/contact.properties",
	scope = ServiceScope.PROTOTYPE, service = ContactResource.class
)
public class ContactResourceImpl extends BaseContactResourceImpl {

	public Page<Contact> getContacts(){

		return contactService.getContacts();
	}

	public Contact addContact(Contact contact){

		return contactService.addContact(contact);
	}

	@Reference
	private ContactService contactService;
}