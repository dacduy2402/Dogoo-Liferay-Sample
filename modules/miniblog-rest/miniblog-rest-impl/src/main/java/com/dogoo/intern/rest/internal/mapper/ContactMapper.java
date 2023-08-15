package com.dogoo.intern.rest.internal.mapper;

import com.dogoo.intern.rest.dto.v2_0.Contact;
import com.dogoo.intern.service.mapper.model.DGContactEntryMapper;
import com.dogoo.intern.service.model.DGContactEntry;
import org.osgi.service.component.annotations.Component;

import java.util.function.Function;

@Component(
        immediate = true,
        service = ContactMapper.class
)
public class ContactMapper implements Function<DGContactEntry, Contact> {
    @Override
    public Contact apply(DGContactEntry dgContactEntry) {

        Contact contact = new Contact();
        contact.setName(dgContactEntry.getName());
        contact.setEmail(dgContactEntry.getEmail());
        contact.setMessage(dgContactEntry.getMessage());

        return contact;
    }

    public DGContactEntryMapper mapContactEntryMapperfromContact (Contact from){

        DGContactEntryMapper to = new DGContactEntryMapper();
        to.setName(from.getName());
        to.setEmail(from.getEmail());
        to.setMessage(from.getMessage());

        return to;
    }
}
