package it.giaquinto.fides.replydemo.model

interface EqualContent<T> {
    fun equalContent(other: T): Boolean
}
