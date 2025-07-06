package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClockTimeTwoOutline: ImageVector
    get() {
        if (_ClockTimeTwoOutline != null) {
            return _ClockTimeTwoOutline!!
        }
        _ClockTimeTwoOutline = ImageVector.Builder(
            name = "ClockTimeTwoOutline",
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
                moveTo(12.5f, 13f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineTo(12.5f)
                verticalLineTo(11.26f)
                lineTo(16.2f, 9.13f)
                lineTo(16.95f, 10.43f)
                lineTo(12.5f, 13f)
                close()
            }
        }.build()

        return _ClockTimeTwoOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ClockTimeTwoOutline: ImageVector? = null
