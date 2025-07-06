package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalendarFilterOutline: ImageVector
    get() {
        if (_CalendarFilterOutline != null) {
            return _CalendarFilterOutline!!
        }
        _CalendarFilterOutline = ImageVector.Builder(
            name = "CalendarFilterOutline",
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
                horizontalLineTo(4.75f)
                curveTo(4.31f, 3.07f, 3.9f, 3.27f, 3.58f, 3.58f)
                curveTo(3.27f, 3.9f, 3.07f, 4.31f, 3f, 4.75f)
                verticalLineTo(19.25f)
                curveTo(3.07f, 19.69f, 3.27f, 20.1f, 3.58f, 20.42f)
                curveTo(3.9f, 20.73f, 4.31f, 20.93f, 4.75f, 21f)
                horizontalLineTo(15f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                curveTo(21f, 3.89f, 20.11f, 3f, 19f, 3f)
                moveTo(19f, 7f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                moveTo(17f, 21f)
                lineTo(18.8f, 22.77f)
                curveTo(19.3f, 23.27f, 20f, 22.87f, 20f, 22.28f)
                verticalLineTo(18f)
                lineTo(22.8f, 14.6f)
                curveTo(23.3f, 13.9f, 22.8f, 13f, 22f, 13f)
                horizontalLineTo(15f)
                curveTo(14.2f, 13f, 13.7f, 14f, 14.2f, 14.6f)
                lineTo(17f, 18f)
                verticalLineTo(21f)
            }
        }.build()

        return _CalendarFilterOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarFilterOutline: ImageVector? = null
