package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalendarSyncOutline: ImageVector
    get() {
        if (_CalendarSyncOutline != null) {
            return _CalendarSyncOutline!!
        }
        _CalendarSyncOutline = ImageVector.Builder(
            name = "CalendarSyncOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 11f)
                verticalLineTo(12.5f)
                curveTo(21.19f, 12.5f, 23.09f, 16.05f, 21.33f, 18.71f)
                lineTo(20.24f, 17.62f)
                curveTo(21.06f, 15.96f, 19.85f, 14f, 18f, 14f)
                verticalLineTo(15.5f)
                lineTo(15.75f, 13.25f)
                lineTo(18f, 11f)
                moveTo(18f, 22f)
                verticalLineTo(20.5f)
                curveTo(14.81f, 20.5f, 12.91f, 16.95f, 14.67f, 14.29f)
                lineTo(15.76f, 15.38f)
                curveTo(14.94f, 17.04f, 16.15f, 19f, 18f, 19f)
                verticalLineTo(17.5f)
                lineTo(20.25f, 19.75f)
                lineTo(18f, 22f)
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
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(14f)
                curveTo(13.36f, 20.45f, 12.86f, 19.77f, 12.5f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                verticalLineTo(10.59f)
                curveTo(19.71f, 10.7f, 20.39f, 10.94f, 21f, 11.31f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 3f)
                moveTo(19f, 7f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
            }
        }.build()

        return _CalendarSyncOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarSyncOutline: ImageVector? = null
