package com.kapps.objectmanagement.data.repository

import com.kapps.objectmanagement.data.mapper.toPerson
import com.kapps.objectmanagement.data.mapper.toPersonDto
import com.kapps.objectmanagement.data.service.PersonService
import com.kapps.objectmanagement.domain.FilterPersonsUseCase
import com.kapps.objectmanagement.domain.model.Person

class PersonRepository(
   private val personService: PersonService = PersonService(),
   private val filterPersonsUseCase: FilterPersonsUseCase
){
    suspend fun getPersons(): List<Person> {
        return filterPersonsUseCase(
                personService.getPersonDtos().map {
                it.toPerson()
            }
        )
    }

    suspend fun insertPersons(personList:List<Person>){
        personService.insertNewPersons(
            personList.map {
                it.toPersonDto()
            }
        )
    }
}