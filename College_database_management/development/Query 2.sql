select marks.module, module.module_name from marks join module on marks.module = module.module_id group by marks.module,module.module_name having count(module) > 1;