package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalendarCollapseHorizontal: ImageVector
    get() {
        if (_CalendarCollapseHorizontal != null) {
            return _CalendarCollapseHorizontal!!
        }
        _CalendarCollapseHorizontal = ImageVector.Builder(
            name = "CalendarCollapseHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                moveTo(16f, 1f)
                verticalLineTo(3f)
                horizontalLineTo(8f)
                verticalLineTo(1f)
                horizontalLineTo(6f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.1f, 21f, 21f, 20.1f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                horizontalLineTo(18f)
                verticalLineTo(1f)
                moveTo(11f, 14f)
                lineTo(8f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                lineTo(11f, 14f)
                moveTo(18f, 13f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                lineTo(13f, 14f)
                lineTo(16f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _CalendarCollapseHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarCollapseHorizontal: ImageVector? = null
