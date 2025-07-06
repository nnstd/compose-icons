package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SortClockDescendingOutline: ImageVector
    get() {
        if (_SortClockDescendingOutline != null) {
            return _SortClockDescendingOutline!!
        }
        _SortClockDescendingOutline = ImageVector.Builder(
            name = "SortClockDescendingOutline",
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
                moveTo(8f, 7.15f)
                curveTo(10.67f, 7.15f, 12.85f, 9.32f, 12.85f, 12f)
                curveTo(12.85f, 14.68f, 10.68f, 16.85f, 8f, 16.85f)
                curveTo(5.32f, 16.85f, 3.15f, 14.68f, 3.15f, 12f)
                curveTo(3.15f, 9.32f, 5.32f, 7.15f, 8f, 7.15f)
                moveTo(7f, 9f)
                verticalLineTo(12.69f)
                lineTo(10.19f, 14.53f)
                lineTo(10.94f, 13.23f)
                lineTo(8.5f, 11.82f)
                verticalLineTo(9f)
            }
        }.build()

        return _SortClockDescendingOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SortClockDescendingOutline: ImageVector? = null
