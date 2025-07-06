package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CalendarQuestionOutline: ImageVector
    get() {
        if (_CalendarQuestionOutline != null) {
            return _CalendarQuestionOutline!!
        }
        _CalendarQuestionOutline = ImageVector.Builder(
            name = "CalendarQuestionOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.95f, 10f)
                curveTo(11.21f, 10f, 10.61f, 10.18f, 10.15f, 10.5f)
                curveTo(9.71f, 10.89f, 9.5f, 11.4f, 9.5f, 12.1f)
                lineTo(9.5f, 12.12f)
                horizontalLineTo(11.15f)
                curveTo(11.16f, 11.86f, 11.24f, 11.65f, 11.39f, 11.5f)
                curveTo(11.54f, 11.38f, 11.73f, 11.31f, 11.95f, 11.31f)
                curveTo(12.21f, 11.31f, 12.43f, 11.4f, 12.59f, 11.56f)
                curveTo(12.74f, 11.73f, 12.81f, 11.96f, 12.81f, 12.22f)
                curveTo(12.81f, 12.5f, 12.75f, 12.75f, 12.61f, 12.95f)
                curveTo(12.5f, 13.16f, 12.31f, 13.33f, 12.09f, 13.5f)
                curveTo(11.66f, 13.78f, 11.36f, 14.05f, 11.2f, 14.29f)
                curveTo(11.03f, 14.5f, 10.94f, 14.89f, 10.94f, 15.33f)
                horizontalLineTo(12.64f)
                curveTo(12.64f, 15.06f, 12.67f, 14.84f, 12.75f, 14.68f)
                curveTo(12.83f, 14.5f, 12.97f, 14.36f, 13.18f, 14.21f)
                curveTo(13.57f, 14f, 13.88f, 13.74f, 14.13f, 13.39f)
                curveTo(14.37f, 13.03f, 14.5f, 12.67f, 14.5f, 12.22f)
                curveTo(14.5f, 11.55f, 14.27f, 11f, 13.81f, 10.61f)
                curveTo(13.36f, 10.2f, 12.74f, 10f, 11.95f, 10f)
                moveTo(10.94f, 16.22f)
                verticalLineTo(18f)
                horizontalLineTo(12.64f)
                verticalLineTo(16.22f)
                horizontalLineTo(10.94f)
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
                curveTo(3.89f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.11f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.11f, 21f, 21f, 20.11f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.11f, 3f, 19f, 3f)
                moveTo(19f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                moveTo(5f, 19f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _CalendarQuestionOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarQuestionOutline: ImageVector? = null
