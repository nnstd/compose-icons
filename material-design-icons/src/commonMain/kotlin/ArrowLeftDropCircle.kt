package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowLeftDropCircle: ImageVector
    get() {
        if (_ArrowLeftDropCircle != null) {
            return _ArrowLeftDropCircle!!
        }
        _ArrowLeftDropCircle = ImageVector.Builder(
            name = "ArrowLeftDropCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                moveTo(14f, 7f)
                lineTo(9f, 12f)
                lineTo(14f, 17f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _ArrowLeftDropCircle!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLeftDropCircle: ImageVector? = null
