package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TimerAlert: ImageVector
    get() {
        if (_TimerAlert != null) {
            return _TimerAlert!!
        }
        _TimerAlert = ImageVector.Builder(
            name = "TimerAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.45f, 5.97f)
                curveTo(18f, 5.46f, 17.55f, 5f, 17.04f, 4.56f)
                lineTo(15.62f, 6f)
                curveTo(14.07f, 4.74f, 12.12f, 4f, 10f, 4f)
                curveTo(5.03f, 4f, 1f, 8.03f, 1f, 13f)
                reflectiveCurveTo(5.03f, 22f, 10f, 22f)
                curveTo(15f, 22f, 19f, 17.97f, 19f, 13f)
                curveTo(19f, 10.88f, 18.26f, 8.93f, 17.03f, 7.39f)
                lineTo(18.45f, 5.97f)
                moveTo(11f, 14f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                moveTo(13f, 3f)
                horizontalLineTo(7f)
                verticalLineTo(1f)
                horizontalLineTo(13f)
                verticalLineTo(3f)
                moveTo(23f, 7f)
                verticalLineTo(13f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                horizontalLineTo(23f)
                moveTo(21f, 15f)
                horizontalLineTo(23f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _TimerAlert!!
    }

@Suppress("ObjectPropertyName")
private var _TimerAlert: ImageVector? = null
