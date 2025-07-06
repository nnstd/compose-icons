package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowRightBoldCircle: ImageVector
    get() {
        if (_ArrowRightBoldCircle != null) {
            return _ArrowRightBoldCircle!!
        }
        _ArrowRightBoldCircle = ImageVector.Builder(
            name = "ArrowRightBoldCircle",
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
                moveTo(17f, 12f)
                lineTo(12f, 7f)
                verticalLineTo(10f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                horizontalLineTo(12f)
                verticalLineTo(17f)
                lineTo(17f, 12f)
                close()
            }
        }.build()

        return _ArrowRightBoldCircle!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRightBoldCircle: ImageVector? = null
