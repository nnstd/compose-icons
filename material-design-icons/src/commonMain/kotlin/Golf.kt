package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Golf: ImageVector
    get() {
        if (_Golf != null) {
            return _Golf!!
        }
        _Golf = ImageVector.Builder(
            name = "Golf",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 18f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 19.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 21f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 19.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 18f)
                moveTo(17f, 5.92f)
                lineTo(11f, 9f)
                verticalLineTo(18.03f)
                curveTo(13.84f, 18.19f, 16f, 19f, 16f, 20f)
                curveTo(16f, 21.1f, 13.31f, 22f, 10f, 22f)
                curveTo(6.69f, 22f, 4f, 21.1f, 4f, 20f)
                curveTo(4f, 19.26f, 5.21f, 18.62f, 7f, 18.27f)
                verticalLineTo(20f)
                horizontalLineTo(9f)
                verticalLineTo(2f)
                lineTo(17f, 5.92f)
                close()
            }
        }.build()

        return _Golf!!
    }

@Suppress("ObjectPropertyName")
private var _Golf: ImageVector? = null
