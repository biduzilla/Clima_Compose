package com.example.climacompose.di

import com.example.climacompose.data.location.DefaultLocationTracker
import com.example.climacompose.domain.location.LocationTracker
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class LocationModule {

    @Provides
    @Singleton
    abstract fun bindLocationTracker(defaultLocationTracker:DefaultLocationTracker):LocationTracker
}