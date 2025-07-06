package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowRightDropCircle: ImageVector
    get() {
        if (_ArrowRightDropCircle != null) {
            return _ArrowRightDropCircle!!
        }
        _ArrowRightDropCircle = ImageVector.Builder(
            name = "ArrowRightDropCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                moveTo(10f, 17f)
                lineTo(15f, 12f)
                lineTo(10f, 7f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _ArrowRightDropCircle!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRightDropCircle: ImageVector? = null
