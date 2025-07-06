package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CheckboxMarkedCircleOutline: ImageVector
    get() {
        if (_CheckboxMarkedCircleOutline != null) {
            return _CheckboxMarkedCircleOutline!!
        }
        _CheckboxMarkedCircleOutline = ImageVector.Builder(
            name = "CheckboxMarkedCircleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 4f)
                curveTo(12.76f, 4f, 13.5f, 4.11f, 14.2f, 4.31f)
                lineTo(15.77f, 2.74f)
                curveTo(14.61f, 2.26f, 13.34f, 2f, 12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                moveTo(7.91f, 10.08f)
                lineTo(6.5f, 11.5f)
                lineTo(11f, 16f)
                lineTo(21f, 6f)
                lineTo(19.59f, 4.58f)
                lineTo(11f, 13.17f)
                lineTo(7.91f, 10.08f)
                close()
            }
        }.build()

        return _CheckboxMarkedCircleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CheckboxMarkedCircleOutline: ImageVector? = null
