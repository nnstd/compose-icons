package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MonitorLock: ImageVector
    get() {
        if (_MonitorLock != null) {
            return _MonitorLock!!
        }
        _MonitorLock = ImageVector.Builder(
            name = "MonitorLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 13f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 15.5f)
                verticalLineTo(16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 17f)
                verticalLineTo(21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 22f)
                horizontalLineTo(18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 21f)
                verticalLineTo(17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 16f)
                verticalLineTo(15.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.5f, 13f)
                moveTo(20.5f, 14f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 15.5f)
                verticalLineTo(16f)
                horizontalLineTo(22f)
                verticalLineTo(15.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 14f)
                moveTo(20f, 4f)
                horizontalLineTo(2f)
                verticalLineTo(16f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                verticalLineTo(20f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                horizontalLineTo(2f)
                curveTo(0.89f, 18f, 0f, 17.1f, 0f, 16f)
                verticalLineTo(4f)
                curveTo(0f, 2.89f, 0.89f, 2f, 2f, 2f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 4f)
                verticalLineTo(11.53f)
                curveTo(21.41f, 11.19f, 20.73f, 11f, 20f, 11f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _MonitorLock!!
    }

@Suppress("ObjectPropertyName")
private var _MonitorLock: ImageVector? = null
