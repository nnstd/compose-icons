package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BedClock: ImageVector
    get() {
        if (_BedClock != null) {
            return _BedClock!!
        }
        _BedClock = ImageVector.Builder(
            name = "BedClock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.2f, 9.5f)
                lineTo(16f, 7.7f)
                verticalLineTo(4f)
                horizontalLineTo(17.5f)
                verticalLineTo(6.8f)
                lineTo(19.9f, 8.2f)
                lineTo(19.2f, 9.5f)
                moveTo(22.2f, 11.7f)
                curveTo(22.7f, 12.4f, 23f, 13.2f, 23f, 14f)
                verticalLineTo(23f)
                horizontalLineTo(21f)
                verticalLineTo(20f)
                horizontalLineTo(3f)
                verticalLineTo(23f)
                horizontalLineTo(1f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(10.6f)
                curveTo(10.4f, 9.5f, 10f, 8.3f, 10f, 7f)
                curveTo(10f, 3.1f, 13.1f, 0f, 17f, 0f)
                reflectiveCurveTo(24f, 3.1f, 24f, 7f)
                curveTo(24f, 8.8f, 23.3f, 10.4f, 22.2f, 11.7f)
                moveTo(12f, 7f)
                curveTo(12f, 9.8f, 14.2f, 12f, 17f, 12f)
                reflectiveCurveTo(22f, 9.8f, 22f, 7f)
                reflectiveCurveTo(19.8f, 2f, 17f, 2f)
                reflectiveCurveTo(12f, 4.2f, 12f, 7f)
                moveTo(7f, 16f)
                curveTo(8.7f, 16f, 10f, 14.7f, 10f, 13f)
                reflectiveCurveTo(8.7f, 10f, 7f, 10f)
                reflectiveCurveTo(4f, 11.3f, 4f, 13f)
                reflectiveCurveTo(5.3f, 16f, 7f, 16f)
                close()
            }
        }.build()

        return _BedClock!!
    }

@Suppress("ObjectPropertyName")
private var _BedClock: ImageVector? = null
