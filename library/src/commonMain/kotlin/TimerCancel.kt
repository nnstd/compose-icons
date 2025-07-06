package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TimerCancel: ImageVector
    get() {
        if (_TimerCancel != null) {
            return _TimerCancel!!
        }
        _TimerCancel = ImageVector.Builder(
            name = "TimerCancel",
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
                moveTo(12f, 18.5f)
                curveTo(12f, 19.77f, 12.37f, 20.94f, 13f, 21.94f)
                curveTo(12.67f, 22f, 12.34f, 22f, 12f, 22f)
                curveTo(7.03f, 22f, 3f, 17.97f, 3f, 13f)
                reflectiveCurveTo(7.03f, 4f, 12f, 4f)
                curveTo(14.12f, 4f, 16.07f, 4.74f, 17.62f, 6f)
                lineTo(19.04f, 4.56f)
                curveTo(19.55f, 5f, 20f, 5.46f, 20.45f, 5.97f)
                lineTo(19.03f, 7.39f)
                curveTo(20.16f, 8.81f, 20.87f, 10.57f, 21f, 12.5f)
                curveTo(20.22f, 12.18f, 19.38f, 12f, 18.5f, 12f)
                curveTo(14.91f, 12f, 12f, 14.91f, 12f, 18.5f)
                moveTo(13f, 7f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                moveTo(23f, 18.5f)
                curveTo(23f, 21f, 21f, 23f, 18.5f, 23f)
                reflectiveCurveTo(14f, 21f, 14f, 18.5f)
                reflectiveCurveTo(16f, 14f, 18.5f, 14f)
                reflectiveCurveTo(23f, 16f, 23f, 18.5f)
                moveTo(20f, 21.08f)
                lineTo(15.92f, 17f)
                curveTo(15.65f, 17.42f, 15.5f, 17.94f, 15.5f, 18.5f)
                curveTo(15.5f, 20.16f, 16.84f, 21.5f, 18.5f, 21.5f)
                curveTo(19.06f, 21.5f, 19.58f, 21.35f, 20f, 21.08f)
                moveTo(21.5f, 18.5f)
                curveTo(21.5f, 16.84f, 20.16f, 15.5f, 18.5f, 15.5f)
                curveTo(17.94f, 15.5f, 17.42f, 15.65f, 17f, 15.92f)
                lineTo(21.08f, 20f)
                curveTo(21.35f, 19.58f, 21.5f, 19.06f, 21.5f, 18.5f)
                close()
            }
        }.build()

        return _TimerCancel!!
    }

@Suppress("ObjectPropertyName")
private var _TimerCancel: ImageVector? = null
