package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LockClock: ImageVector
    get() {
        if (_LockClock != null) {
            return _LockClock!!
        }
        _LockClock = ImageVector.Builder(
            name = "LockClock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 2f)
                curveTo(6f, 2f, 4f, 4f, 4f, 6.5f)
                verticalLineTo(7f)
                curveTo(2.89f, 7f, 2f, 7.89f, 2f, 9f)
                verticalLineTo(18f)
                curveTo(2f, 19.11f, 2.89f, 20f, 4f, 20f)
                horizontalLineTo(8.72f)
                curveTo(10.18f, 21.29f, 12.06f, 22f, 14f, 22f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 14f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 6f)
                curveTo(13.66f, 6f, 13.32f, 6.03f, 13f, 6.08f)
                curveTo(12.76f, 3.77f, 10.82f, 2f, 8.5f, 2f)
                moveTo(8.5f, 4f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 6.5f)
                verticalLineTo(7f)
                horizontalLineTo(6f)
                verticalLineTo(6.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 4f)
                moveTo(14f, 8f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 14f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 20f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 14f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 8f)
                moveTo(13f, 10f)
                verticalLineTo(15f)
                lineTo(16.64f, 17.19f)
                lineTo(17.42f, 15.9f)
                lineTo(14.5f, 14.15f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _LockClock!!
    }

@Suppress("ObjectPropertyName")
private var _LockClock: ImageVector? = null
