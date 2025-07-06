package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClockTimeSixOutline: ImageVector
    get() {
        if (_ClockTimeSixOutline != null) {
            return _ClockTimeSixOutline!!
        }
        _ClockTimeSixOutline = ImageVector.Builder(
            name = "ClockTimeSixOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 20f)
                curveTo(16.4f, 20f, 20f, 16.4f, 20f, 12f)
                reflectiveCurveTo(16.4f, 4f, 12f, 4f)
                reflectiveCurveTo(4f, 7.6f, 4f, 12f)
                reflectiveCurveTo(7.6f, 20f, 12f, 20f)
                moveTo(12f, 2f)
                curveTo(17.5f, 2f, 22f, 6.5f, 22f, 12f)
                reflectiveCurveTo(17.5f, 22f, 12f, 22f)
                curveTo(6.5f, 22f, 2f, 17.5f, 2f, 12f)
                curveTo(2f, 6.5f, 6.5f, 2f, 12f, 2f)
                moveTo(12.5f, 7f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineTo(12.5f)
                close()
            }
        }.build()

        return _ClockTimeSixOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ClockTimeSixOutline: ImageVector? = null
