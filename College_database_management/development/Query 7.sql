select instructor.first_name, fax.fax_number from instructor join fax on fax.address = instructor.address join module on module.module_head = instructor.instructor_id where lower(module.module_name) = 'database';