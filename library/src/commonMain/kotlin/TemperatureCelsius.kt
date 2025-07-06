package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TemperatureCelsius: ImageVector
    get() {
        if (_TemperatureCelsius != null) {
            return _TemperatureCelsius!!
        }
        _TemperatureCelsius = ImageVector.Builder(
            name = "TemperatureCelsius",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 5f)
                curveTo(18.05f, 5f, 19.5f, 5.47f, 20.69f, 6.28f)
                lineTo(19.53f, 9.17f)
                curveTo(18.73f, 8.44f, 17.67f, 8f, 16.5f, 8f)
                curveTo(14f, 8f, 12f, 10f, 12f, 12.5f)
                curveTo(12f, 15f, 14f, 17f, 16.5f, 17f)
                curveTo(17.53f, 17f, 18.47f, 16.66f, 19.23f, 16.08f)
                lineTo(20.37f, 18.93f)
                curveTo(19.24f, 19.61f, 17.92f, 20f, 16.5f, 20f)
                arcTo(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 12.5f)
                arcTo(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 5f)
                moveTo(6f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 3f)
                moveTo(6f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 5f)
                close()
            }
        }.build()

        return _TemperatureCelsius!!
    }

@Suppress("ObjectPropertyName")
private var _TemperatureCelsius: ImageVector? = null
