package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChevronDownCircleOutline: ImageVector
    get() {
        if (_ChevronDownCircleOutline != null) {
            return _ChevronDownCircleOutline!!
        }
        _ChevronDownCircleOutline = ImageVector.Builder(
            name = "ChevronDownCircleOutline",
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
                moveTo(20f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 12f)
                moveTo(6f, 10f)
                lineTo(12f, 16f)
                lineTo(18f, 10f)
                lineTo(16.6f, 8.6f)
                lineTo(12f, 13.2f)
                lineTo(7.4f, 8.6f)
                lineTo(6f, 10f)
                close()
            }
        }.build()

        return _ChevronDownCircleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronDownCircleOutline: ImageVector? = null
