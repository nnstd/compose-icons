package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PhoneClock: ImageVector
    get() {
        if (_PhoneClock != null) {
            return _PhoneClock!!
        }
        _PhoneClock = ImageVector.Builder(
            name = "PhoneClock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.9f, 1f)
                curveTo(12.1f, 1.1f, 9f, 4.2f, 9f, 8f)
                curveTo(9f, 11.9f, 12.1f, 15f, 16f, 15f)
                reflectiveCurveTo(23f, 11.9f, 23f, 8f)
                reflectiveCurveTo(19.9f, 1f, 15.9f, 1f)
                curveTo(16f, 1f, 15.9f, 1f, 15.9f, 1f)
                moveTo(16f, 3f)
                curveTo(18.8f, 3f, 21f, 5.2f, 21f, 8f)
                reflectiveCurveTo(18.8f, 13f, 16f, 13f)
                reflectiveCurveTo(11f, 10.8f, 11f, 8f)
                reflectiveCurveTo(13.2f, 3f, 16f, 3f)
                moveTo(15f, 4f)
                verticalLineTo(9f)
                lineTo(18.6f, 11.2f)
                lineTo(19.4f, 10f)
                lineTo(16.5f, 8.3f)
                verticalLineTo(4f)
                horizontalLineTo(15f)
                moveTo(4.6f, 12.8f)
                curveTo(6f, 15.6f, 8.4f, 18f, 11.2f, 19.4f)
                lineTo(13.4f, 17.2f)
                curveTo(13.7f, 16.9f, 14.1f, 16.8f, 14.4f, 17f)
                curveTo(15.5f, 17.4f, 16.7f, 17.6f, 18f, 17.6f)
                curveTo(18.5f, 17.6f, 19f, 18.1f, 19f, 18.6f)
                verticalLineTo(22f)
                curveTo(19f, 22.5f, 18.5f, 23f, 18f, 23f)
                curveTo(8.6f, 23f, 1f, 15.4f, 1f, 6f)
                curveTo(1f, 5.4f, 1.5f, 5f, 2f, 5f)
                horizontalLineTo(5.5f)
                curveTo(6.1f, 5f, 6.5f, 5.4f, 6.5f, 6f)
                curveTo(6.5f, 7.2f, 6.7f, 8.4f, 7.1f, 9.6f)
                curveTo(7.2f, 10f, 7.1f, 10.3f, 6.9f, 10.6f)
                lineTo(4.6f, 12.8f)
            }
        }.build()

        return _PhoneClock!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneClock: ImageVector? = null
