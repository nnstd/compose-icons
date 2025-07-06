package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TimerCog: ImageVector
    get() {
        if (_TimerCog != null) {
            return _TimerCog!!
        }
        _TimerCog = ImageVector.Builder(
            name = "TimerCog",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.8f, 19.4f)
                curveTo(22.9f, 19.4f, 22.9f, 19.5f, 22.8f, 19.6f)
                lineTo(21.8f, 21.3f)
                curveTo(21.7f, 21.4f, 21.6f, 21.4f, 21.5f, 21.4f)
                lineTo(20.3f, 21f)
                curveTo(20f, 21.2f, 19.8f, 21.3f, 19.5f, 21.5f)
                lineTo(19.3f, 22.8f)
                curveTo(19.3f, 22.9f, 19.2f, 23f, 19.1f, 23f)
                horizontalLineTo(17.1f)
                curveTo(17f, 23f, 16.9f, 22.9f, 16.8f, 22.8f)
                lineTo(16.6f, 21.5f)
                curveTo(16.3f, 21.4f, 16f, 21.2f, 15.8f, 21f)
                lineTo(14.6f, 21.5f)
                curveTo(14.5f, 21.5f, 14.4f, 21.5f, 14.3f, 21.4f)
                lineTo(13.3f, 19.7f)
                curveTo(13.2f, 19.6f, 13.3f, 19.5f, 13.4f, 19.4f)
                lineTo(14.5f, 18.6f)
                verticalLineTo(17.6f)
                lineTo(13.4f, 16.8f)
                curveTo(13.3f, 16.7f, 13.3f, 16.6f, 13.3f, 16.5f)
                lineTo(14.3f, 14.8f)
                curveTo(14.4f, 14.7f, 14.5f, 14.7f, 14.6f, 14.7f)
                lineTo(15.8f, 15.2f)
                curveTo(16.1f, 15f, 16.3f, 14.9f, 16.6f, 14.7f)
                lineTo(16.8f, 13.4f)
                curveTo(16.8f, 13.3f, 16.9f, 13.2f, 17.1f, 13.2f)
                horizontalLineTo(19.1f)
                curveTo(19.2f, 13.2f, 19.3f, 13.3f, 19.3f, 13.4f)
                lineTo(19.5f, 14.7f)
                curveTo(19.8f, 14.8f, 20.1f, 15f, 20.4f, 15.2f)
                lineTo(21.6f, 14.7f)
                curveTo(21.7f, 14.7f, 21.9f, 14.7f, 21.9f, 14.8f)
                lineTo(22.9f, 16.5f)
                curveTo(23f, 16.6f, 22.9f, 16.7f, 22.8f, 16.8f)
                lineTo(21.7f, 17.6f)
                verticalLineTo(18.6f)
                lineTo(22.8f, 19.4f)
                moveTo(19.5f, 18f)
                curveTo(19.5f, 17.2f, 18.8f, 16.5f, 18f, 16.5f)
                reflectiveCurveTo(16.5f, 17.2f, 16.5f, 18f)
                reflectiveCurveTo(17.2f, 19.5f, 18f, 19.5f)
                reflectiveCurveTo(19.5f, 18.8f, 19.5f, 18f)
                moveTo(11f, 18f)
                curveTo(11f, 16.5f, 11.5f, 15.1f, 12.3f, 14f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                verticalLineTo(13.1f)
                curveTo(14.3f, 11.8f, 16f, 11f, 18f, 11f)
                curveTo(19f, 11f, 20f, 11.2f, 20.9f, 11.6f)
                curveTo(20.6f, 10f, 20f, 8.6f, 19f, 7.4f)
                lineTo(20.5f, 6f)
                curveTo(20f, 5.5f, 19.5f, 5f, 19f, 4.6f)
                lineTo(17.6f, 6f)
                curveTo(16.1f, 4.7f, 14.1f, 4f, 12f, 4f)
                curveTo(7f, 4f, 3f, 8f, 3f, 13f)
                reflectiveCurveTo(7f, 22f, 12f, 22f)
                horizontalLineTo(12.3f)
                curveTo(11.5f, 20.9f, 11f, 19.5f, 11f, 18f)
                moveTo(15f, 1f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                horizontalLineTo(15f)
                verticalLineTo(1f)
                close()
            }
        }.build()

        return _TimerCog!!
    }

@Suppress("ObjectPropertyName")
private var _TimerCog: ImageVector? = null
