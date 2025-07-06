package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DesktopTowerMonitor: ImageVector
    get() {
        if (_DesktopTowerMonitor != null) {
            return _DesktopTowerMonitor!!
        }
        _DesktopTowerMonitor = ImageVector.Builder(
            name = "DesktopTowerMonitor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 18f)
                horizontalLineTo(17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 17f)
                verticalLineTo(7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 6f)
                horizontalLineTo(22f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 7f)
                verticalLineTo(17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 18f)
                moveTo(22f, 8f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                horizontalLineTo(22f)
                verticalLineTo(8f)
                moveTo(22f, 10f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                horizontalLineTo(22f)
                verticalLineTo(10f)
                moveTo(9f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                verticalLineTo(18f)
                horizontalLineTo(5f)
                verticalLineTo(17f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                horizontalLineTo(2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 14f)
                verticalLineTo(7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 6f)
                horizontalLineTo(13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 7f)
                verticalLineTo(14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 15f)
                horizontalLineTo(9f)
                moveTo(12f, 8f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                horizontalLineTo(12f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _DesktopTowerMonitor!!
    }

@Suppress("ObjectPropertyName")
private var _DesktopTowerMonitor: ImageVector? = null
