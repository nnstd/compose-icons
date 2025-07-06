package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FuseBlade: ImageVector
    get() {
        if (_FuseBlade != null) {
            return _FuseBlade!!
        }
        _FuseBlade = ImageVector.Builder(
            name = "FuseBlade",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 21f)
                horizontalLineTo(8f)
                lineTo(6f, 19f)
                verticalLineTo(16f)
                horizontalLineTo(10f)
                verticalLineTo(21f)
                moveTo(18f, 16f)
                horizontalLineTo(14f)
                verticalLineTo(21f)
                horizontalLineTo(16f)
                lineTo(18f, 19f)
                verticalLineTo(16f)
                moveTo(3f, 3f)
                verticalLineTo(4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 5f)
                verticalLineTo(14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 15f)
                horizontalLineTo(19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 14f)
                verticalLineTo(5f)
                horizontalLineTo(20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 4f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                moveTo(11.83f, 13f)
                verticalLineTo(9.73f)
                horizontalLineTo(10f)
                lineTo(12.61f, 4.66f)
                verticalLineTo(7.93f)
                horizontalLineTo(14.36f)
                lineTo(11.83f, 13f)
                close()
            }
        }.build()

        return _FuseBlade!!
    }

@Suppress("ObjectPropertyName")
private var _FuseBlade: ImageVector? = null
