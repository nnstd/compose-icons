package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClockTimeTwelveOutline: ImageVector
    get() {
        if (_ClockTimeTwelveOutline != null) {
            return _ClockTimeTwelveOutline!!
        }
        _ClockTimeTwelveOutline = ImageVector.Builder(
            name = "ClockTimeTwelveOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 20f)
                curveTo(16.42f, 20f, 20f, 16.42f, 20f, 12f)
                reflectiveCurveTo(16.42f, 4f, 12f, 4f)
                reflectiveCurveTo(4f, 7.58f, 4f, 12f)
                reflectiveCurveTo(7.58f, 20f, 12f, 20f)
                moveTo(12f, 2f)
                curveTo(17.5f, 2f, 22f, 6.5f, 22f, 12f)
                reflectiveCurveTo(17.5f, 22f, 12f, 22f)
                curveTo(6.47f, 22f, 2f, 17.5f, 2f, 12f)
                curveTo(2f, 6.5f, 6.5f, 2f, 12f, 2f)
                moveTo(12.5f, 13.03f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineTo(12.5f)
                verticalLineTo(13.03f)
                close()
            }
        }.build()

        return _ClockTimeTwelveOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ClockTimeTwelveOutline: ImageVector? = null
