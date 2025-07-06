package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MapClock: ImageVector
    get() {
        if (_MapClock != null) {
            return _MapClock!!
        }
        _MapClock = ImageVector.Builder(
            name = "MapClock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 12f)
                horizontalLineTo(16.5f)
                verticalLineTo(16.25f)
                lineTo(19.36f, 17.94f)
                lineTo(18.61f, 19.16f)
                lineTo(15f, 17f)
                verticalLineTo(12f)
                moveTo(23f, 16f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 23f)
                curveTo(13f, 23f, 10.4f, 21.08f, 9.42f, 18.4f)
                lineTo(8f, 17.9f)
                lineTo(2.66f, 19.97f)
                lineTo(2.5f, 20f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 19.5f)
                verticalLineTo(4.38f)
                curveTo(2f, 4.15f, 2.15f, 3.97f, 2.36f, 3.9f)
                lineTo(8f, 2f)
                lineTo(14f, 4.1f)
                lineTo(19.34f, 2f)
                horizontalLineTo(19.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 2.5f)
                verticalLineTo(10.25f)
                curveTo(21.81f, 11.5f, 23f, 13.62f, 23f, 16f)
                moveTo(9f, 16f)
                curveTo(9f, 12.83f, 11.11f, 10.15f, 14f, 9.29f)
                verticalLineTo(6.11f)
                lineTo(8f, 4f)
                verticalLineTo(15.89f)
                lineTo(9f, 16.24f)
                curveTo(9f, 16.16f, 9f, 16.08f, 9f, 16f)
                moveTo(16f, 11f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 16f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 21f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 16f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 11f)
                close()
            }
        }.build()

        return _MapClock!!
    }

@Suppress("ObjectPropertyName")
private var _MapClock: ImageVector? = null
