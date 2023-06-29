package com.example.climacompose.di

import com.example.climacompose.data.location.DefaultLocationTracker
import com.example.climacompose.domain.location.LocationTracker
import com.example.climacompose.domain.repository.WeatherRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Provides
    @Singleton
    abstract fun bindRepository(
        weatherRepository: WeatherRepository
    ): WeatherRepository
}