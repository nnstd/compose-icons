package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SortCalendarDescending: ImageVector
    get() {
        if (_SortCalendarDescending != null) {
            return _SortCalendarDescending!!
        }
        _SortCalendarDescending = ImageVector.Builder(
            name = "SortCalendarDescending",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 7f)
                horizontalLineTo(16f)
                lineTo(20f, 3f)
                lineTo(24f, 7f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                moveTo(8f, 16f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                moveTo(13f, 5f)
                horizontalLineTo(12f)
                verticalLineTo(3f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                horizontalLineTo(6f)
                verticalLineTo(3f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                curveTo(1.89f, 5f, 1f, 5.89f, 1f, 7f)
                verticalLineTo(18f)
                curveTo(1f, 19.11f, 1.89f, 20f, 3f, 20f)
                horizontalLineTo(13f)
                curveTo(14.11f, 20f, 15f, 19.11f, 15f, 18f)
                verticalLineTo(7f)
                curveTo(15f, 5.89f, 14.11f, 5f, 13f, 5f)
                moveTo(3f, 18f)
                lineTo(3f, 11f)
                horizontalLineTo(13f)
                lineTo(13f, 18f)
                lineTo(3f, 18f)
                close()
            }
        }.build()

        return _SortCalendarDescending!!
    }

@Suppress("ObjectPropertyName")
private var _SortCalendarDescending: ImageVector? = null
