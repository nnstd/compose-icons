package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TimerSettingsOutline: ImageVector
    get() {
        if (_TimerSettingsOutline != null) {
            return _TimerSettingsOutline!!
        }
        _TimerSettingsOutline = ImageVector.Builder(
            name = "TimerSettingsOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 19f)
                curveTo(8.1f, 19f, 5f, 15.9f, 5f, 12f)
                reflectiveCurveTo(8.1f, 5f, 12f, 5f)
                reflectiveCurveTo(19f, 8.1f, 19f, 12f)
                reflectiveCurveTo(15.9f, 19f, 12f, 19f)
                moveTo(19f, 6.4f)
                lineTo(20.5f, 5f)
                curveTo(20f, 4.5f, 19.5f, 4f, 19f, 3.6f)
                lineTo(17.6f, 5f)
                curveTo(16f, 3.7f, 14.1f, 3f, 12f, 3f)
                curveTo(7f, 3f, 3f, 7f, 3f, 12f)
                reflectiveCurveTo(7f, 21f, 12f, 21f)
                curveTo(17f, 21f, 21f, 17f, 21f, 12f)
                curveTo(21f, 9.9f, 20.3f, 7.9f, 19f, 6.4f)
                moveTo(11f, 13f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                moveTo(15f, 0f)
                horizontalLineTo(9f)
                verticalLineTo(2f)
                horizontalLineTo(15f)
                verticalLineTo(0f)
                moveTo(13f, 22f)
                horizontalLineTo(11f)
                verticalLineTo(24f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                moveTo(17f, 22f)
                horizontalLineTo(15f)
                verticalLineTo(24f)
                horizontalLineTo(17f)
                verticalLineTo(22f)
                moveTo(9f, 22f)
                horizontalLineTo(7f)
                verticalLineTo(24f)
                horizontalLineTo(9f)
                verticalLineTo(22f)
                close()
            }
        }.build()

        return _TimerSettingsOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TimerSettingsOutline: ImageVector? = null
