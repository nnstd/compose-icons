package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CameraTimer: ImageVector
    get() {
        if (_CameraTimer != null) {
            return _CameraTimer!!
        }
        _CameraTimer = ImageVector.Builder(
            name = "CameraTimer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.94f, 6.35f)
                curveTo(4.55f, 5.96f, 4.55f, 5.32f, 4.94f, 4.93f)
                curveTo(5.33f, 4.54f, 5.96f, 4.54f, 6.35f, 4.93f)
                lineTo(13.07f, 10.31f)
                lineTo(13.42f, 10.59f)
                curveTo(14.2f, 11.37f, 14.2f, 12.64f, 13.42f, 13.42f)
                curveTo(12.64f, 14.2f, 11.37f, 14.2f, 10.59f, 13.42f)
                lineTo(10.31f, 13.07f)
                lineTo(4.94f, 6.35f)
                moveTo(12f, 20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 12f)
                curveTo(20f, 9.79f, 19.1f, 7.79f, 17.66f, 6.34f)
                lineTo(19.07f, 4.93f)
                curveTo(20.88f, 6.74f, 22f, 9.24f, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                horizontalLineTo(4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 20f)
                moveTo(12f, 1f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 1f)
                close()
            }
        }.build()

        return _CameraTimer!!
    }

@Suppress("ObjectPropertyName")
private var _CameraTimer: ImageVector? = null
