package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChevronRightCircleOutline: ImageVector
    get() {
        if (_ChevronRightCircleOutline != null) {
            return _ChevronRightCircleOutline!!
        }
        _ChevronRightCircleOutline = ImageVector.Builder(
            name = "ChevronRightCircleOutline",
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
                moveTo(8.6f, 16.6f)
                lineTo(13.2f, 12f)
                lineTo(8.6f, 7.4f)
                lineTo(10f, 6f)
                lineTo(16f, 12f)
                lineTo(10f, 18f)
                lineTo(8.6f, 16.6f)
                close()
            }
        }.build()

        return _ChevronRightCircleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronRightCircleOutline: ImageVector? = null
