package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Gmail: ImageVector
    get() {
        if (_Gmail != null) {
            return _Gmail!!
        }
        _Gmail = ImageVector.Builder(
            name = "Gmail",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 18f)
                horizontalLineTo(18f)
                verticalLineTo(9.25f)
                lineTo(12f, 13f)
                lineTo(6f, 9.25f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineTo(5.2f)
                lineTo(12f, 10.25f)
                lineTo(18.8f, 6f)
                horizontalLineTo(20f)
                moveTo(20f, 4f)
                horizontalLineTo(4f)
                curveTo(2.89f, 4f, 2f, 4.89f, 2f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 20f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 18f)
                verticalLineTo(6f)
                curveTo(22f, 4.89f, 21.1f, 4f, 20f, 4f)
                close()
            }
        }.build()

        return _Gmail!!
    }

@Suppress("ObjectPropertyName")
private var _Gmail: ImageVector? = null
