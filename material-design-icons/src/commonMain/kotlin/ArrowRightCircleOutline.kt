package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowRightCircleOutline: ImageVector
    get() {
        if (_ArrowRightCircleOutline != null) {
            return _ArrowRightCircleOutline!!
        }
        _ArrowRightCircleOutline = ImageVector.Builder(
            name = "ArrowRightCircleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(14f)
                lineTo(10.5f, 7.5f)
                lineTo(11.92f, 6.08f)
                lineTo(17.84f, 12f)
                lineTo(11.92f, 17.92f)
                lineTo(10.5f, 16.5f)
                lineTo(14f, 13f)
                horizontalLineTo(6f)
                moveTo(22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                moveTo(20f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 12f)
                close()
            }
        }.build()

        return _ArrowRightCircleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRightCircleOutline: ImageVector? = null
