package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PanVertical: ImageVector
    get() {
        if (_PanVertical != null) {
            return _PanVertical!!
        }
        _PanVertical = ImageVector.Builder(
            name = "PanVertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2.5f)
                lineTo(8f, 7f)
                horizontalLineTo(16f)
                lineTo(12f, 2.5f)
                moveTo(12f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10f)
                moveTo(8f, 17f)
                lineTo(12f, 21.5f)
                lineTo(16f, 17f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _PanVertical!!
    }

@Suppress("ObjectPropertyName")
private var _PanVertical: ImageVector? = null
