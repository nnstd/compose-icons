package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Compare: ImageVector
    get() {
        if (_Compare != null) {
            return _Compare!!
        }
        _Compare = ImageVector.Builder(
            name = "Compare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(18f)
                lineTo(14f, 12f)
                verticalLineTo(21f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.89f, 20.1f, 3f, 19f, 3f)
                moveTo(10f, 18f)
                horizontalLineTo(5f)
                lineTo(10f, 12f)
                moveTo(10f, 3f)
                horizontalLineTo(5f)
                curveTo(3.89f, 3f, 3f, 3.89f, 3f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(10f)
                verticalLineTo(23f)
                horizontalLineTo(12f)
                verticalLineTo(1f)
                horizontalLineTo(10f)
                verticalLineTo(3f)
                close()
            }
        }.build()

        return _Compare!!
    }

@Suppress("ObjectPropertyName")
private var _Compare: ImageVector? = null
