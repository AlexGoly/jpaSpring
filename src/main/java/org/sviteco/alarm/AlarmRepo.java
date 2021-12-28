package org.sviteco.alarm;

import org.springframework.data.repository.CrudRepository;
import org.sviteco.alarm.entity.Alarm;

public interface AlarmRepo extends CrudRepository<Alarm,Long> {
}
