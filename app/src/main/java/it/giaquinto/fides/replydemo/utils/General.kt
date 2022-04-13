package it.giaquinto.fides.replydemo.utils

operator fun String.minus(value: String) = this.replace(value, "")