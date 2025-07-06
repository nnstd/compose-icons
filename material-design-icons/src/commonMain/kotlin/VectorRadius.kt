package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VectorRadius: ImageVector
    get() {
        if (_VectorRadius != null) {
            return _VectorRadius!!
        }
        _VectorRadius = ImageVector.Builder(
            name = "VectorRadius",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 4f)
                horizontalLineTo(4f)
                verticalLineTo(2f)
                horizontalLineTo(10f)
                verticalLineTo(4f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 14f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                verticalLineTo(22f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                horizontalLineTo(18f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineTo(2f)
                verticalLineTo(4f)
                moveTo(18f, 16f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
                horizontalLineTo(18f)
                moveTo(6f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _VectorRadius!!
    }

@Suppress("ObjectPropertyName")
private var _VectorRadius: ImageVector? = null
