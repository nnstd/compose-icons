package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowRightBoldCircleOutline: ImageVector
    get() {
        if (_ArrowRightBoldCircleOutline != null) {
            return _ArrowRightBoldCircleOutline!!
        }
        _ArrowRightBoldCircleOutline = ImageVector.Builder(
            name = "ArrowRightBoldCircleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 12f)
                lineTo(12f, 17f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                verticalLineTo(10f)
                horizontalLineTo(12f)
                verticalLineTo(7f)
                lineTo(17f, 12f)
                moveTo(2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                moveTo(4f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 12f)
                close()
            }
        }.build()

        return _ArrowRightBoldCircleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRightBoldCircleOutline: ImageVector? = null
