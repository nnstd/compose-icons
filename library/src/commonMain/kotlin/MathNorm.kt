package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MathNorm: ImageVector
    get() {
        if (_MathNorm != null) {
            return _MathNorm!!
        }
        _MathNorm = ImageVector.Builder(
            name = "MathNorm",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 21f)
                verticalLineTo(3f)
                horizontalLineTo(16f)
                verticalLineTo(21f)
                horizontalLineTo(14f)
                moveTo(8f, 21f)
                verticalLineTo(3f)
                horizontalLineTo(10f)
                verticalLineTo(21f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _MathNorm!!
    }

@Suppress("ObjectPropertyName")
private var _MathNorm: ImageVector? = null
