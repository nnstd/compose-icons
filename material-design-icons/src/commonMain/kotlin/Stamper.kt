package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Stamper: ImageVector
    get() {
        if (_Stamper != null) {
            return _Stamper!!
        }
        _Stamper = ImageVector.Builder(
            name = "Stamper",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 6f)
                curveTo(9f, 9f, 14f, 13f, 6f, 13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 13f)
                curveTo(10f, 13f, 15f, 9f, 15f, 6f)
                curveTo(15f, 4f, 13.66f, 3f, 12f, 3f)
                moveTo(6f, 19f)
                verticalLineTo(21f)
                horizontalLineTo(18f)
                verticalLineTo(19f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _Stamper!!
    }

@Suppress("ObjectPropertyName")
private var _Stamper: ImageVector? = null
