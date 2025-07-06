package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GoogleCirclesExtended: ImageVector
    get() {
        if (_GoogleCirclesExtended != null) {
            return _GoogleCirclesExtended!!
        }
        _GoogleCirclesExtended = ImageVector.Builder(
            name = "GoogleCirclesExtended",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 19f)
                curveTo(16.89f, 19f, 16f, 18.1f, 16f, 17f)
                curveTo(16f, 15.89f, 16.89f, 15f, 18f, 15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 19f)
                moveTo(18f, 13f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 17f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 21f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 17f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 13f)
                moveTo(12f, 11.1f)
                arcTo(1.9f, 1.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.1f, 13f)
                arcTo(1.9f, 1.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 14.9f)
                arcTo(1.9f, 1.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.9f, 13f)
                arcTo(1.9f, 1.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 11.1f)
                moveTo(6f, 19f)
                curveTo(4.89f, 19f, 4f, 18.1f, 4f, 17f)
                curveTo(4f, 15.89f, 4.89f, 15f, 6f, 15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 19f)
                moveTo(6f, 13f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 17f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 21f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 17f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 13f)
                moveTo(12f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 8f)
                curveTo(10.89f, 8f, 10f, 7.1f, 10f, 6f)
                curveTo(10f, 4.89f, 10.89f, 4f, 12f, 4f)
                moveTo(12f, 10f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 6f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 6f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10f)
                close()
            }
        }.build()

        return _GoogleCirclesExtended!!
    }

@Suppress("ObjectPropertyName")
private var _GoogleCirclesExtended: ImageVector? = null
