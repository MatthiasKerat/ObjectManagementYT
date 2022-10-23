package com.kapps.objectmanagement.domain

import com.kapps.objectmanagement.domain.model.Person

class FilterPersonsUseCase {

    operator fun invoke(personList:List<Person>):List<Person>{
        return personList.filter { person ->
            person.name.count() > 5
        }
    }

}