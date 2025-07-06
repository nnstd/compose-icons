package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BlackMesa: ImageVector
    get() {
        if (_BlackMesa != null) {
            return _BlackMesa!!
        }
        _BlackMesa = ImageVector.Builder(
            name = "BlackMesa",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                moveTo(12f, 4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 12f)
                curveTo(4f, 14.39f, 5.05f, 16.53f, 6.71f, 18f)
                horizontalLineTo(9f)
                verticalLineTo(12f)
                horizontalLineTo(17f)
                lineTo(19.15f, 15.59f)
                curveTo(19.69f, 14.5f, 20f, 13.29f, 20f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                close()
            }
        }.build()

        return _BlackMesa!!
    }

@Suppress("ObjectPropertyName")
private var _BlackMesa: ImageVector? = null
