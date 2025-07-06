package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TimerOffOutline: ImageVector
    get() {
        if (_TimerOffOutline != null) {
            return _TimerOffOutline!!
        }
        _TimerOffOutline = ImageVector.Builder(
            name = "TimerOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 20f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 13f)
                curveTo(5f, 11.72f, 5.35f, 10.5f, 5.95f, 9.5f)
                lineTo(15.5f, 19.04f)
                curveTo(14.5f, 19.65f, 13.28f, 20f, 12f, 20f)
                moveTo(3f, 4f)
                lineTo(1.75f, 5.27f)
                lineTo(4.5f, 8.03f)
                curveTo(3.55f, 9.45f, 3f, 11.16f, 3f, 13f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                curveTo(13.84f, 22f, 15.55f, 21.45f, 17f, 20.5f)
                lineTo(19.5f, 23f)
                lineTo(20.75f, 21.73f)
                lineTo(13.04f, 14f)
                lineTo(3f, 4f)
                moveTo(11f, 9.44f)
                lineTo(13f, 11.44f)
                verticalLineTo(8f)
                horizontalLineTo(11f)
                moveTo(15f, 1f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                horizontalLineTo(15f)
                moveTo(19.04f, 4.55f)
                lineTo(17.62f, 5.97f)
                curveTo(16.07f, 4.74f, 14.12f, 4f, 12f, 4f)
                curveTo(10.17f, 4f, 8.47f, 4.55f, 7.05f, 5.5f)
                lineTo(8.5f, 6.94f)
                curveTo(9.53f, 6.35f, 10.73f, 6f, 12f, 6f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 13f)
                curveTo(19f, 14.27f, 18.65f, 15.47f, 18.06f, 16.5f)
                lineTo(19.5f, 17.94f)
                curveTo(20.45f, 16.53f, 21f, 14.83f, 21f, 13f)
                curveTo(21f, 10.88f, 20.26f, 8.93f, 19.03f, 7.39f)
                lineTo(20.45f, 5.97f)
                lineTo(19.04f, 4.55f)
                close()
            }
        }.build()

        return _TimerOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TimerOffOutline: ImageVector? = null
