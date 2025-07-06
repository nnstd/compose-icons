package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MathNormBox: ImageVector
    get() {
        if (_MathNormBox != null) {
            return _MathNormBox!!
        }
        _MathNormBox = ImageVector.Builder(
            name = "MathNormBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.1f, 21f, 21f, 20.1f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                moveTo(10f, 18f)
                horizontalLineTo(8f)
                verticalLineTo(6f)
                horizontalLineTo(10f)
                verticalLineTo(18f)
                moveTo(16f, 18f)
                horizontalLineTo(14f)
                verticalLineTo(6f)
                horizontalLineTo(16f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _MathNormBox!!
    }

@Suppress("ObjectPropertyName")
private var _MathNormBox: ImageVector? = null
