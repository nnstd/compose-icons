package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClockMinus: ImageVector
    get() {
        if (_ClockMinus != null) {
            return _ClockMinus!!
        }
        _ClockMinus = ImageVector.Builder(
            name = "ClockMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.72f, 21.84f)
                curveTo(13.16f, 21.94f, 12.59f, 22f, 12f, 22f)
                curveTo(6.5f, 22f, 2f, 17.5f, 2f, 12f)
                reflectiveCurveTo(6.5f, 2f, 12f, 2f)
                reflectiveCurveTo(22f, 6.5f, 22f, 12f)
                curveTo(22f, 12.59f, 21.94f, 13.16f, 21.84f, 13.72f)
                curveTo(21f, 13.26f, 20.03f, 13f, 19f, 13f)
                curveTo(17.74f, 13f, 16.57f, 13.39f, 15.6f, 14.06f)
                lineTo(12.5f, 12.2f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                lineTo(14.43f, 15.11f)
                curveTo(13.54f, 16.16f, 13f, 17.5f, 13f, 19f)
                curveTo(13f, 20.03f, 13.26f, 21f, 13.72f, 21.84f)
                moveTo(15f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(23f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _ClockMinus!!
    }

@Suppress("ObjectPropertyName")
private var _ClockMinus: ImageVector? = null
