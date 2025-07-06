package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MiniSd: ImageVector
    get() {
        if (_MiniSd != null) {
            return _MiniSd!!
        }
        _MiniSd = ImageVector.Builder(
            name = "MiniSd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 20f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 18f)
                verticalLineTo(12f)
                lineTo(18f, 10f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 4f)
                horizontalLineTo(6f)
                moveTo(7f, 6f)
                horizontalLineTo(9f)
                verticalLineTo(10f)
                horizontalLineTo(7f)
                verticalLineTo(6f)
                moveTo(10f, 6f)
                horizontalLineTo(12f)
                verticalLineTo(10f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                moveTo(13f, 6f)
                horizontalLineTo(15f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _MiniSd!!
    }

@Suppress("ObjectPropertyName")
private var _MiniSd: ImageVector? = null
