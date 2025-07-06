package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AnimationPlay: ImageVector
    get() {
        if (_AnimationPlay != null) {
            return _AnimationPlay!!
        }
        _AnimationPlay = ImageVector.Builder(
            name = "AnimationPlay",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 2f)
                horizontalLineTo(14f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                verticalLineTo(14f)
                horizontalLineTo(2f)
                verticalLineTo(4f)
                curveTo(2f, 2.89f, 2.89f, 2f, 4f, 2f)
                moveTo(8f, 6f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                horizontalLineTo(8f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                verticalLineTo(8f)
                curveTo(6f, 6.89f, 6.89f, 6f, 8f, 6f)
                moveTo(12f, 10f)
                horizontalLineTo(20f)
                curveTo(21.11f, 10f, 22f, 10.89f, 22f, 12f)
                verticalLineTo(20f)
                curveTo(22f, 21.11f, 21.11f, 22f, 20f, 22f)
                horizontalLineTo(12f)
                curveTo(10.89f, 22f, 10f, 21.11f, 10f, 20f)
                verticalLineTo(12f)
                curveTo(10f, 10.89f, 10.89f, 10f, 12f, 10f)
                moveTo(14f, 12f)
                verticalLineTo(20f)
                lineTo(20f, 16f)
                lineTo(14f, 12f)
                close()
            }
        }.build()

        return _AnimationPlay!!
    }

@Suppress("ObjectPropertyName")
private var _AnimationPlay: ImageVector? = null
