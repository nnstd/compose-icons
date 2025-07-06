package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SortClockDescending: ImageVector
    get() {
        if (_SortClockDescending != null) {
            return _SortClockDescending!!
        }
        _SortClockDescending = ImageVector.Builder(
            name = "SortClockDescending",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 7f)
                horizontalLineTo(15f)
                lineTo(19f, 3f)
                lineTo(23f, 7f)
                horizontalLineTo(20f)
                verticalLineTo(21f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                moveTo(8f, 5f)
                curveTo(4.14f, 5f, 1f, 8.13f, 1f, 12f)
                curveTo(1f, 15.87f, 4.13f, 19f, 8f, 19f)
                curveTo(11.86f, 19f, 15f, 15.87f, 15f, 12f)
                curveTo(15f, 8.13f, 11.87f, 5f, 8f, 5f)
                moveTo(10.19f, 14.53f)
                lineTo(7f, 12.69f)
                verticalLineTo(9f)
                horizontalLineTo(8.5f)
                verticalLineTo(11.82f)
                lineTo(10.94f, 13.23f)
                lineTo(10.19f, 14.53f)
                close()
            }
        }.build()

        return _SortClockDescending!!
    }

@Suppress("ObjectPropertyName")
private var _SortClockDescending: ImageVector? = null
