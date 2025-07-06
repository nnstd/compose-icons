package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowDownDropCircle: ImageVector
    get() {
        if (_ArrowDownDropCircle != null) {
            return _ArrowDownDropCircle!!
        }
        _ArrowDownDropCircle = ImageVector.Builder(
            name = "ArrowDownDropCircle",
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
                moveTo(7f, 10f)
                lineTo(12f, 15f)
                lineTo(17f, 10f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _ArrowDownDropCircle!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownDropCircle: ImageVector? = null
