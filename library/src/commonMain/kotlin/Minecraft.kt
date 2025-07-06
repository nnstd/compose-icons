package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Minecraft: ImageVector
    get() {
        if (_Minecraft != null) {
            return _Minecraft!!
        }
        _Minecraft = ImageVector.Builder(
            name = "Minecraft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 2f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 22f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 20f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 2f)
                moveTo(6f, 6f)
                verticalLineTo(10f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                verticalLineTo(18f)
                horizontalLineTo(10f)
                verticalLineTo(16f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _Minecraft!!
    }

@Suppress("ObjectPropertyName")
private var _Minecraft: ImageVector? = null
