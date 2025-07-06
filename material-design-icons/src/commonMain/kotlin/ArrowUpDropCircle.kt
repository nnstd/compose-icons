package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowUpDropCircle: ImageVector
    get() {
        if (_ArrowUpDropCircle != null) {
            return _ArrowUpDropCircle!!
        }
        _ArrowUpDropCircle = ImageVector.Builder(
            name = "ArrowUpDropCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                moveTo(17f, 14f)
                lineTo(12f, 9f)
                lineTo(7f, 14f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _ArrowUpDropCircle!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpDropCircle: ImageVector? = null
