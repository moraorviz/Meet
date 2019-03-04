package moraorviz.meetgathering.domain.service

import org.springframework.data.mongodb.core.ReactiveMongoTemplate
import org.springframework.data.mongodb.core.query.Criteria.where
import org.springframework.data.mongodb.core.query.Query
import org.springframework.data.mongodb.core.query.Query.query

class GroupRepository(val template: ReactiveMongoTemplate) {

    fun save(group: Group) = template.save(group)

}