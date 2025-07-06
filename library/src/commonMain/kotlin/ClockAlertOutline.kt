package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClockAlertOutline: ImageVector
    get() {
        if (_ClockAlertOutline != null) {
            return _ClockAlertOutline!!
        }
        _ClockAlertOutline = ImageVector.Builder(
            name = "ClockAlertOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 7f)
                verticalLineTo(13f)
                lineTo(16.2f, 16.1f)
                lineTo(17f, 14.9f)
                lineTo(12.5f, 12.2f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                moveTo(20f, 12f)
                verticalLineTo(18f)
                horizontalLineTo(22f)
                verticalLineTo(12f)
                horizontalLineTo(20f)
                moveTo(20f, 20f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                moveTo(18f, 20f)
                curveTo(16.3f, 21.3f, 14.3f, 22f, 12f, 22f)
                curveTo(6.5f, 22f, 2f, 17.5f, 2f, 12f)
                reflectiveCurveTo(6.5f, 2f, 12f, 2f)
                curveTo(16.8f, 2f, 20.9f, 5.4f, 21.8f, 10f)
                horizontalLineTo(19.7f)
                curveTo(18.8f, 6.6f, 15.7f, 4f, 12f, 4f)
                curveTo(7.6f, 4f, 4f, 7.6f, 4f, 12f)
                reflectiveCurveTo(7.6f, 20f, 12f, 20f)
                curveTo(14.4f, 20f, 16.5f, 18.9f, 18f, 17.3f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _ClockAlertOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ClockAlertOutline: ImageVector? = null
