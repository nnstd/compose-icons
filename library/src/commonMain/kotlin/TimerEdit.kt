package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TimerEdit: ImageVector
    get() {
        if (_TimerEdit != null) {
            return _TimerEdit!!
        }
        _TimerEdit = ImageVector.Builder(
            name = "TimerEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 3f)
                horizontalLineTo(9f)
                verticalLineTo(1f)
                horizontalLineTo(15f)
                verticalLineTo(3f)
                moveTo(19.39f, 10.74f)
                lineTo(11f, 19.13f)
                verticalLineTo(21.94f)
                curveTo(6.5f, 21.44f, 3f, 17.63f, 3f, 13f)
                curveTo(3f, 8.03f, 7.03f, 4f, 12f, 4f)
                curveTo(14.12f, 4f, 16.07f, 4.74f, 17.62f, 6f)
                lineTo(19.04f, 4.56f)
                curveTo(19.55f, 5f, 20f, 5.46f, 20.45f, 5.97f)
                lineTo(19.03f, 7.39f)
                curveTo(19.67f, 8.19f, 20.17f, 9.11f, 20.5f, 10.1f)
                curveTo(20.1f, 10.21f, 19.71f, 10.42f, 19.39f, 10.74f)
                moveTo(13f, 7f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                moveTo(13f, 19.96f)
                verticalLineTo(22f)
                horizontalLineTo(15.04f)
                lineTo(21.17f, 15.88f)
                lineTo(19.13f, 13.83f)
                lineTo(13f, 19.96f)
                moveTo(22.85f, 13.47f)
                lineTo(21.53f, 12.15f)
                curveTo(21.33f, 11.95f, 21f, 11.95f, 20.81f, 12.15f)
                lineTo(19.83f, 13.13f)
                lineTo(21.87f, 15.17f)
                lineTo(22.85f, 14.19f)
                curveTo(23.05f, 14f, 23.05f, 13.67f, 22.85f, 13.47f)
                close()
            }
        }.build()

        return _TimerEdit!!
    }

@Suppress("ObjectPropertyName")
private var _TimerEdit: ImageVector? = null
