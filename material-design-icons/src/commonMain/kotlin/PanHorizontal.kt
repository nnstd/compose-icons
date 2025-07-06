package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PanHorizontal: ImageVector
    get() {
        if (_PanHorizontal != null) {
            return _PanHorizontal!!
        }
        _PanHorizontal = ImageVector.Builder(
            name = "PanHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 8f)
                lineTo(2.5f, 12f)
                lineTo(7f, 16f)
                verticalLineTo(8f)
                moveTo(17f, 8f)
                verticalLineTo(16f)
                lineTo(21.5f, 12f)
                lineTo(17f, 8f)
                moveTo(12f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10f)
                close()
            }
        }.build()

        return _PanHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _PanHorizontal: ImageVector? = null
