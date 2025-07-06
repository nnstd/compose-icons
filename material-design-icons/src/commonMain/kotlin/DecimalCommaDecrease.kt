package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DecimalCommaDecrease: ImageVector
    get() {
        if (_DecimalCommaDecrease != null) {
            return _DecimalCommaDecrease!!
        }
        _DecimalCommaDecrease = ImageVector.Builder(
            name = "DecimalCommaDecrease",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 13f)
                verticalLineTo(16f)
                horizontalLineTo(4f)
                lineTo(3f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 13f)
                moveTo(15f, 16f)
                verticalLineTo(14f)
                lineTo(12f, 17f)
                lineTo(15f, 20f)
                verticalLineTo(18f)
                horizontalLineTo(21f)
                verticalLineTo(16f)
                moveTo(12f, 11f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 11f)
                verticalLineTo(8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 8f)
                moveTo(10f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                verticalLineTo(11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 11f)
                close()
            }
        }.build()

        return _DecimalCommaDecrease!!
    }

@Suppress("ObjectPropertyName")
private var _DecimalCommaDecrease: ImageVector? = null
