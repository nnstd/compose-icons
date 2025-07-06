package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowDownCircleOutline: ImageVector
    get() {
        if (_ArrowDownCircleOutline != null) {
            return _ArrowDownCircleOutline!!
        }
        _ArrowDownCircleOutline = ImageVector.Builder(
            name = "ArrowDownCircleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 6f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                lineTo(16.5f, 10.5f)
                lineTo(17.92f, 11.92f)
                lineTo(12f, 17.84f)
                lineTo(6.08f, 11.92f)
                lineTo(7.5f, 10.5f)
                lineTo(11f, 14f)
                verticalLineTo(6f)
                moveTo(12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                moveTo(12f, 20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 20f)
                close()
            }
        }.build()

        return _ArrowDownCircleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownCircleOutline: ImageVector? = null
