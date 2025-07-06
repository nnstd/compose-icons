package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DesktopTower: ImageVector
    get() {
        if (_DesktopTower != null) {
            return _DesktopTower!!
        }
        _DesktopTower = ImageVector.Builder(
            name = "DesktopTower",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 2f)
                horizontalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 22f)
                horizontalLineTo(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 20f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 2f)
                moveTo(8f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(16f)
                verticalLineTo(4f)
                horizontalLineTo(8f)
                moveTo(16f, 8f)
                horizontalLineTo(8f)
                verticalLineTo(10f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                moveTo(16f, 18f)
                horizontalLineTo(14f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _DesktopTower!!
    }

@Suppress("ObjectPropertyName")
private var _DesktopTower: ImageVector? = null
