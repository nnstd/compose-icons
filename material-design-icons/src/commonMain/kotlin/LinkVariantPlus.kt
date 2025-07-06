package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LinkVariantPlus: ImageVector
    get() {
        if (_LinkVariantPlus != null) {
            return _LinkVariantPlus!!
        }
        _LinkVariantPlus = ImageVector.Builder(
            name = "LinkVariantPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.6f, 13.4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.2f, 14.8f)
                arcTo(4.8f, 4.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.2f, 7.8f)
                lineTo(12.7f, 4.2f)
                arcTo(5.1f, 5.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.8f, 4.2f)
                arcTo(5.1f, 5.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.8f, 11.3f)
                lineTo(18.3f, 12.8f)
                arcTo(6.4f, 6.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.9f, 10.4f)
                lineTo(18.4f, 9.9f)
                arcTo(3.2f, 3.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.4f, 5.6f)
                arcTo(3.2f, 3.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.1f, 5.6f)
                lineTo(10.6f, 9.2f)
                arcTo(2.9f, 2.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.6f, 13.4f)
                moveTo(23f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                verticalLineTo(23f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(18f)
                moveTo(16.2f, 13.7f)
                arcTo(4.8f, 4.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.8f, 9.2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.4f, 10.6f)
                arcTo(2.9f, 2.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.4f, 14.8f)
                lineTo(9.9f, 18.4f)
                arcTo(3.2f, 3.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.6f, 18.4f)
                arcTo(3.2f, 3.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.6f, 14.1f)
                lineTo(6.1f, 13.7f)
                arcTo(7.3f, 7.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.7f, 11.2f)
                lineTo(4.2f, 12.7f)
                arcTo(5.1f, 5.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.2f, 19.8f)
                arcTo(5.1f, 5.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.3f, 19.8f)
                lineTo(13.1f, 18f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.2f, 13.7f)
                close()
            }
        }.build()

        return _LinkVariantPlus!!
    }

@Suppress("ObjectPropertyName")
private var _LinkVariantPlus: ImageVector? = null
