package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClockCheck: ImageVector
    get() {
        if (_ClockCheck != null) {
            return _ClockCheck!!
        }
        _ClockCheck = ImageVector.Builder(
            name = "ClockCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.5f, 17f)
                lineTo(18.5f, 22f)
                lineTo(15f, 18.5f)
                lineTo(16.5f, 17f)
                lineTo(18.5f, 19f)
                lineTo(22f, 15.5f)
                lineTo(23.5f, 17f)
                moveTo(13f, 19f)
                curveTo(13f, 17.5f, 13.5f, 16.2f, 14.4f, 15.1f)
                lineTo(11f, 13f)
                verticalLineTo(7f)
                horizontalLineTo(12.5f)
                verticalLineTo(12.2f)
                lineTo(15.6f, 14.1f)
                curveTo(16.6f, 13.4f, 17.7f, 13f, 19f, 13f)
                curveTo(20f, 13f, 21f, 13.3f, 21.8f, 13.7f)
                curveTo(21.9f, 13.1f, 22f, 12.6f, 22f, 12f)
                curveTo(22f, 6.5f, 17.5f, 2f, 12f, 2f)
                reflectiveCurveTo(2f, 6.5f, 2f, 12f)
                reflectiveCurveTo(6.5f, 22f, 12f, 22f)
                curveTo(12.6f, 22f, 13.2f, 21.9f, 13.7f, 21.8f)
                curveTo(13.3f, 21f, 13f, 20f, 13f, 19f)
                close()
            }
        }.build()

        return _ClockCheck!!
    }

@Suppress("ObjectPropertyName")
private var _ClockCheck: ImageVector? = null
