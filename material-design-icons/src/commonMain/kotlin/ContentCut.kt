package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ContentCut: ImageVector
    get() {
        if (_ContentCut != null) {
            return _ContentCut!!
        }
        _ContentCut = ImageVector.Builder(
            name = "ContentCut",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                lineTo(13f, 9f)
                lineTo(15f, 11f)
                lineTo(22f, 4f)
                verticalLineTo(3f)
                moveTo(12f, 12.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.5f, 12f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 11.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.5f, 12f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 12.5f)
                moveTo(6f, 20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 18f)
                curveTo(4f, 16.89f, 4.9f, 16f, 6f, 16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 18f)
                curveTo(8f, 19.11f, 7.1f, 20f, 6f, 20f)
                moveTo(6f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 6f)
                curveTo(4f, 4.89f, 4.9f, 4f, 6f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 6f)
                curveTo(8f, 7.11f, 7.1f, 8f, 6f, 8f)
                moveTo(9.64f, 7.64f)
                curveTo(9.87f, 7.14f, 10f, 6.59f, 10f, 6f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 2f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 6f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 10f)
                curveTo(6.59f, 10f, 7.14f, 9.87f, 7.64f, 9.64f)
                lineTo(10f, 12f)
                lineTo(7.64f, 14.36f)
                curveTo(7.14f, 14.13f, 6.59f, 14f, 6f, 14f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 18f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 22f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 18f)
                curveTo(10f, 17.41f, 9.87f, 16.86f, 9.64f, 16.36f)
                lineTo(12f, 14f)
                lineTo(19f, 21f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                lineTo(9.64f, 7.64f)
                close()
            }
        }.build()

        return _ContentCut!!
    }

@Suppress("ObjectPropertyName")
private var _ContentCut: ImageVector? = null
