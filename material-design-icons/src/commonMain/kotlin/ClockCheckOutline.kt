package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClockCheckOutline: ImageVector
    get() {
        if (_ClockCheckOutline != null) {
            return _ClockCheckOutline!!
        }
        _ClockCheckOutline = ImageVector.Builder(
            name = "ClockCheckOutline",
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
                moveTo(13.1f, 19.9f)
                curveTo(12.7f, 20f, 12.4f, 20f, 12f, 20f)
                curveTo(7.6f, 20f, 4f, 16.4f, 4f, 12f)
                reflectiveCurveTo(7.6f, 4f, 12f, 4f)
                reflectiveCurveTo(20f, 7.6f, 20f, 12f)
                curveTo(20f, 12.4f, 20f, 12.7f, 19.9f, 13.1f)
                curveTo(20.6f, 13.2f, 21.2f, 13.4f, 21.8f, 13.7f)
                curveTo(21.9f, 13.1f, 22f, 12.6f, 22f, 12f)
                curveTo(22f, 6.5f, 17.5f, 2f, 12f, 2f)
                reflectiveCurveTo(2f, 6.5f, 2f, 12f)
                curveTo(2f, 17.5f, 6.5f, 22f, 12f, 22f)
                curveTo(12.6f, 22f, 13.2f, 21.9f, 13.7f, 21.8f)
                curveTo(13.4f, 21.3f, 13.2f, 20.6f, 13.1f, 19.9f)
                moveTo(15.6f, 14.1f)
                lineTo(12.5f, 12.3f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                lineTo(14.5f, 15.1f)
                curveTo(14.8f, 14.7f, 15.2f, 14.4f, 15.6f, 14.1f)
                close()
            }
        }.build()

        return _ClockCheckOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ClockCheckOutline: ImageVector? = null
