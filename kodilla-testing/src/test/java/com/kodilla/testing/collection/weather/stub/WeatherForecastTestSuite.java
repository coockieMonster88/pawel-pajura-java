package com.kodilla.testing.collection.weather.stub;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.Assert;
import org.junit.Test;

    public class WeatherForecastTestSuite {
        @Test
        public void testCalculateForecastWithStub(){
            //Given
            Temperatures temperatures = new TemperaturesStub();
            WeatherForecast weatherForecast = new WeatherForecast(temperatures);

            //When
            int quantityOfSensors = weatherForecast.calculateForecast().size();

            //Then
            Assert.assertEquals(5, quantityOfSensors);
        }
}
