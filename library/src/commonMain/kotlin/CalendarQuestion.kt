package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalendarQuestion: ImageVector
    get() {
        if (_CalendarQuestion != null) {
            return _CalendarQuestion!!
        }
        _CalendarQuestion = ImageVector.Builder(
            name = "CalendarQuestion",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 1f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                curveTo(3.89f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 3f)
                horizontalLineTo(18f)
                verticalLineTo(1f)
                horizontalLineTo(16f)
                verticalLineTo(3f)
                horizontalLineTo(8f)
                verticalLineTo(1f)
                horizontalLineTo(6f)
                moveTo(5f, 8f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                moveTo(12.19f, 9f)
                curveTo(11.32f, 9f, 10.62f, 9.2f, 10.08f, 9.59f)
                curveTo(9.56f, 10f, 9.3f, 10.57f, 9.31f, 11.36f)
                lineTo(9.32f, 11.39f)
                horizontalLineTo(11.25f)
                curveTo(11.26f, 11.09f, 11.35f, 10.86f, 11.53f, 10.7f)
                curveTo(11.71f, 10.55f, 11.93f, 10.47f, 12.19f, 10.47f)
                curveTo(12.5f, 10.47f, 12.76f, 10.57f, 12.94f, 10.75f)
                curveTo(13.12f, 10.94f, 13.2f, 11.2f, 13.2f, 11.5f)
                curveTo(13.2f, 11.82f, 13.13f, 12.09f, 12.97f, 12.32f)
                curveTo(12.83f, 12.55f, 12.62f, 12.75f, 12.36f, 12.91f)
                curveTo(11.85f, 13.25f, 11.5f, 13.55f, 11.31f, 13.82f)
                curveTo(11.11f, 14.08f, 11f, 14.5f, 11f, 15f)
                horizontalLineTo(13f)
                curveTo(13f, 14.69f, 13.04f, 14.44f, 13.13f, 14.26f)
                curveTo(13.22f, 14.08f, 13.39f, 13.9f, 13.64f, 13.74f)
                curveTo(14.09f, 13.5f, 14.46f, 13.21f, 14.75f, 12.81f)
                curveTo(15.04f, 12.41f, 15.19f, 12f, 15.19f, 11.5f)
                curveTo(15.19f, 10.74f, 14.92f, 10.13f, 14.38f, 9.68f)
                curveTo(13.85f, 9.23f, 13.12f, 9f, 12.19f, 9f)
                moveTo(11f, 16f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _CalendarQuestion!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarQuestion: ImageVector? = null
