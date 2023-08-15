package com.dogoo.intern.rest.internal.service;

import com.dogoo.intern.rest.dto.v2_0.Contact;
import com.dogoo.intern.rest.internal.mapper.ContactMapper;
import com.dogoo.intern.service.mapper.model.DGContactEntryMapper;
import com.dogoo.intern.service.model.DGContactEntry;
import com.dogoo.intern.service.service.DGContactEntryLocalService;
import com.liferay.portal.vulcan.pagination.Page;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.ArrayList;
import java.util.List;

@Component(
        immediate = true,
        service = ContactService.class
)
public class ContactService {

    public Page<Contact> getContacts(){

        List<DGContactEntry> dgContactEntries = contactEntryLocalService.getAllContact();

        List<Contact> contacts = new ArrayList<>();
        for (DGContactEntry contactEntry: dgContactEntries) {
            contacts.add(contactMapper.apply(contactEntry));
        }

        return Page.of(contacts);
    }

    public Contact addContact(Contact contact){

        DGContactEntryMapper dgContactEntryMapper = contactMapper.mapContactEntryMapperfromContact(contact);
        DGContactEntry dgContactEntry = contactEntryLocalService.addContact(dgContactEntryMapper);

        Contact newContact = contactMapper.apply(dgContactEntry);

        return newContact;
    }

    @Reference
    private DGContactEntryLocalService contactEntryLocalService;

    @Reference
    private ContactMapper contactMapper;
}
