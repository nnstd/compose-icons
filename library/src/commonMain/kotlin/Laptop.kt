package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Laptop: ImageVector
    get() {
        if (_Laptop != null) {
            return _Laptop!!
        }
        _Laptop = ImageVector.Builder(
            name = "Laptop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 6f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
                horizontalLineTo(4f)
                moveTo(20f, 18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 16f)
                verticalLineTo(6f)
                curveTo(22f, 4.89f, 21.1f, 4f, 20f, 4f)
                horizontalLineTo(4f)
                curveTo(2.89f, 4f, 2f, 4.89f, 2f, 6f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 18f)
                horizontalLineTo(0f)
                verticalLineTo(20f)
                horizontalLineTo(24f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _Laptop!!
    }

@Suppress("ObjectPropertyName")
private var _Laptop: ImageVector? = null
