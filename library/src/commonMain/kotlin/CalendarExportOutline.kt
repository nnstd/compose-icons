package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalendarExportOutline: ImageVector
    get() {
        if (_CalendarExportOutline != null) {
            return _CalendarExportOutline!!
        }
        _CalendarExportOutline = ImageVector.Builder(
            name = "CalendarExportOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(18f)
                verticalLineTo(1f)
                horizontalLineTo(16f)
                verticalLineTo(3f)
                horizontalLineTo(8f)
                verticalLineTo(1f)
                horizontalLineTo(6f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(8f)
                lineTo(6f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(18f)
                lineTo(16f, 21f)
                horizontalLineTo(19f)
                curveTo(20.1f, 21f, 21f, 20.1f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                moveTo(5f, 7f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                horizontalLineTo(5f)
                moveTo(13f, 18f)
                verticalLineTo(12f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                horizontalLineTo(8f)
                lineTo(12f, 22f)
                lineTo(16f, 18f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _CalendarExportOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarExportOutline: ImageVector? = null
