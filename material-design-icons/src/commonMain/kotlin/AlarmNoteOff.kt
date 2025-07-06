package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlarmNoteOff: ImageVector
    get() {
        if (_AlarmNoteOff != null) {
            return _AlarmNoteOff!!
        }
        _AlarmNoteOff = ImageVector.Builder(
            name = "AlarmNoteOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 13f)
                verticalLineTo(15.8f)
                lineTo(20f, 16.8f)
                verticalLineTo(15f)
                horizontalLineTo(23f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                moveTo(2.38f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(3f, 4.88f)
                lineTo(2f, 5.71f)
                lineTo(3.29f, 7.24f)
                lineTo(4.41f, 6.3f)
                lineTo(5.21f, 7.1f)
                curveTo(1.95f, 10.85f, 2.35f, 16.54f, 6.11f, 19.8f)
                curveTo(7.74f, 21.22f, 9.83f, 22f, 12f, 22f)
                curveTo(12.33f, 22f, 12.67f, 22f, 13f, 21.94f)
                verticalLineTo(19.94f)
                curveTo(12.67f, 20f, 12.33f, 20f, 12f, 20f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 13f)
                curveTo(5f, 11.36f, 5.57f, 9.77f, 6.63f, 8.5f)
                lineTo(11.41f, 13.3f)
                lineTo(7.5f, 15.62f)
                lineTo(8.25f, 16.85f)
                lineTo(12.44f, 14.33f)
                lineTo(16.38f, 18.27f)
                curveTo(15.14f, 18.88f, 14.64f, 20.38f, 15.25f, 21.62f)
                curveTo(15.86f, 22.86f, 17.36f, 23.36f, 18.6f, 22.75f)
                curveTo(19.09f, 22.5f, 19.5f, 22.11f, 19.73f, 21.62f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.38f, 1.73f)
                moveTo(12f, 6f)
                curveTo(15.1f, 6f, 17.83f, 8.03f, 18.71f, 11f)
                horizontalLineTo(20.78f)
                curveTo(19.85f, 6.9f, 16.2f, 4f, 12f, 4f)
                curveTo(10.65f, 4f, 9.31f, 4.3f, 8.1f, 4.9f)
                lineTo(9.62f, 6.42f)
                curveTo(10.38f, 6.14f, 11.19f, 6f, 12f, 6f)
                moveTo(11.5f, 8.3f)
                lineTo(13f, 9.8f)
                verticalLineTo(8f)
                horizontalLineTo(11.5f)
                verticalLineTo(8.3f)
                moveTo(7.88f, 3.39f)
                lineTo(6.6f, 1.86f)
                lineTo(5.76f, 2.56f)
                lineTo(7.18f, 4f)
                lineTo(7.88f, 3.39f)
                moveTo(17.4f, 1.86f)
                lineTo(16.11f, 3.39f)
                lineTo(20.71f, 7.25f)
                lineTo(22f, 5.72f)
                lineTo(17.4f, 1.86f)
                close()
            }
        }.build()

        return _AlarmNoteOff!!
    }

@Suppress("ObjectPropertyName")
private var _AlarmNoteOff: ImageVector? = null
