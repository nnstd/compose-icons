package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Ring: ImageVector
    get() {
        if (_Ring != null) {
            return _Ring!!
        }
        _Ring = ImageVector.Builder(
            name = "Ring",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 10f)
                lineTo(8f, 4.4f)
                lineTo(9.6f, 2f)
                horizontalLineTo(14.4f)
                lineTo(16f, 4.4f)
                lineTo(12f, 10f)
                moveTo(15.5f, 6.8f)
                lineTo(14.3f, 8.5f)
                curveTo(16.5f, 9.4f, 18f, 11.5f, 18f, 14f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 14f)
                curveTo(6f, 11.5f, 7.5f, 9.4f, 9.7f, 8.5f)
                lineTo(8.5f, 6.8f)
                curveTo(5.8f, 8.1f, 4f, 10.8f, 4f, 14f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 14f)
                curveTo(20f, 10.8f, 18.2f, 8.1f, 15.5f, 6.8f)
                close()
            }
        }.build()

        return _Ring!!
    }

@Suppress("ObjectPropertyName")
private var _Ring: ImageVector? = null
