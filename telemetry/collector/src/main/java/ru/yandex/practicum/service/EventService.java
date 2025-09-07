package ru.yandex.practicum.service;

import ru.yandex.practicum.model.HubEvent;
import ru.yandex.practicum.model.hub.sensor.SensorEvent;

public interface EventService {
    void sendSensorEvent (SensorEvent ev);
    void sendHubEvent (HubEvent ev);
}