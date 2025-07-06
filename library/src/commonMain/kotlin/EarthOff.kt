package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EarthOff: ImageVector
    get() {
        if (_EarthOff != null) {
            return _EarthOff!!
        }
        _EarthOff = ImageVector.Builder(
            name = "EarthOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 5.27f)
                lineTo(20.5f, 6.75f)
                curveTo(21.46f, 8.28f, 22f, 10.07f, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                curveTo(10.08f, 22f, 8.28f, 21.46f, 6.75f, 20.5f)
                lineTo(5.27f, 22f)
                lineTo(4f, 20.72f)
                lineTo(20.72f, 4f)
                lineTo(22f, 5.27f)
                moveTo(17.9f, 17.39f)
                curveTo(19.2f, 15.97f, 20f, 14.08f, 20f, 12f)
                curveTo(20f, 10.63f, 19.66f, 9.34f, 19.05f, 8.22f)
                lineTo(14.83f, 12.44f)
                curveTo(14.94f, 12.6f, 15f, 12.79f, 15f, 13f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                curveTo(16.89f, 16f, 17.64f, 16.59f, 17.9f, 17.39f)
                moveTo(11f, 19.93f)
                verticalLineTo(18f)
                curveTo(10.5f, 18f, 10.07f, 17.83f, 9.73f, 17.54f)
                lineTo(8.22f, 19.05f)
                curveTo(9.07f, 19.5f, 10f, 19.8f, 11f, 19.93f)
                moveTo(15f, 4.59f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 7f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 10f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                horizontalLineTo(10.18f)
                lineTo(8.09f, 14.09f)
                lineTo(4.21f, 10.21f)
                curveTo(4.08f, 10.78f, 4f, 11.38f, 4f, 12f)
                curveTo(4f, 13.74f, 4.56f, 15.36f, 5.5f, 16.67f)
                lineTo(4.08f, 18.1f)
                curveTo(2.77f, 16.41f, 2f, 14.3f, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                curveTo(14.3f, 2f, 16.41f, 2.77f, 18.1f, 4.08f)
                lineTo(16.67f, 5.5f)
                curveTo(16.16f, 5.14f, 15.6f, 4.83f, 15f, 4.59f)
                close()
            }
        }.build()

        return _EarthOff!!
    }

@Suppress("ObjectPropertyName")
private var _EarthOff: ImageVector? = null
