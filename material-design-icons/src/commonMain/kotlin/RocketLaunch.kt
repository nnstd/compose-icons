package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RocketLaunch: ImageVector
    get() {
        if (_RocketLaunch != null) {
            return _RocketLaunch!!
        }
        _RocketLaunch = ImageVector.Builder(
            name = "RocketLaunch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.13f, 22.19f)
                lineTo(11.5f, 18.36f)
                curveTo(13.07f, 17.78f, 14.54f, 17f, 15.9f, 16.09f)
                lineTo(13.13f, 22.19f)
                moveTo(5.64f, 12.5f)
                lineTo(1.81f, 10.87f)
                lineTo(7.91f, 8.1f)
                curveTo(7f, 9.46f, 6.22f, 10.93f, 5.64f, 12.5f)
                moveTo(21.61f, 2.39f)
                curveTo(21.61f, 2.39f, 16.66f, 0.269f, 11f, 5.93f)
                curveTo(8.81f, 8.12f, 7.5f, 10.53f, 6.65f, 12.64f)
                curveTo(6.37f, 13.39f, 6.56f, 14.21f, 7.11f, 14.77f)
                lineTo(9.24f, 16.89f)
                curveTo(9.79f, 17.45f, 10.61f, 17.63f, 11.36f, 17.35f)
                curveTo(13.5f, 16.53f, 15.88f, 15.19f, 18.07f, 13f)
                curveTo(23.73f, 7.34f, 21.61f, 2.39f, 21.61f, 2.39f)
                moveTo(14.54f, 9.46f)
                curveTo(13.76f, 8.68f, 13.76f, 7.41f, 14.54f, 6.63f)
                reflectiveCurveTo(16.59f, 5.85f, 17.37f, 6.63f)
                curveTo(18.14f, 7.41f, 18.15f, 8.68f, 17.37f, 9.46f)
                curveTo(16.59f, 10.24f, 15.32f, 10.24f, 14.54f, 9.46f)
                moveTo(8.88f, 16.53f)
                lineTo(7.47f, 15.12f)
                lineTo(8.88f, 16.53f)
                moveTo(6.24f, 22f)
                lineTo(9.88f, 18.36f)
                curveTo(9.54f, 18.27f, 9.21f, 18.12f, 8.91f, 17.91f)
                lineTo(4.83f, 22f)
                horizontalLineTo(6.24f)
                moveTo(2f, 22f)
                horizontalLineTo(3.41f)
                lineTo(8.18f, 17.24f)
                lineTo(6.76f, 15.83f)
                lineTo(2f, 20.59f)
                verticalLineTo(22f)
                moveTo(2f, 19.17f)
                lineTo(6.09f, 15.09f)
                curveTo(5.88f, 14.79f, 5.73f, 14.47f, 5.64f, 14.12f)
                lineTo(2f, 17.76f)
                verticalLineTo(19.17f)
                close()
            }
        }.build()

        return _RocketLaunch!!
    }

@Suppress("ObjectPropertyName")
private var _RocketLaunch: ImageVector? = null
