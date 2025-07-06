package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowLeftCircleOutline: ImageVector
    get() {
        if (_ArrowLeftCircleOutline != null) {
            return _ArrowLeftCircleOutline!!
        }
        _ArrowLeftCircleOutline = ImageVector.Builder(
            name = "ArrowLeftCircleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(10f)
                lineTo(13.5f, 16.5f)
                lineTo(12.08f, 17.92f)
                lineTo(6.16f, 12f)
                lineTo(12.08f, 6.08f)
                lineTo(13.5f, 7.5f)
                lineTo(10f, 11f)
                horizontalLineTo(18f)
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

        return _ArrowLeftCircleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLeftCircleOutline: ImageVector? = null
