package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HarddiskRemove: ImageVector
    get() {
        if (_HarddiskRemove != null) {
            return _HarddiskRemove!!
        }
        _HarddiskRemove = ImageVector.Builder(
            name = "HarddiskRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 13f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9f)
                moveTo(12f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 13f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9f)
                moveTo(18f, 2f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                verticalLineTo(13.09f)
                arcTo(5.47f, 5.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 13f)
                arcTo(5.71f, 5.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 13.36f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = true, 15.71f, 14.69f)
                lineTo(13.79f, 12.27f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.42f, 11.9f)
                lineTo(11.56f, 12.4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.19f, 13.77f)
                lineTo(12.1f, 16f)
                arcTo(6.12f, 6.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 15.62f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.19f, 22f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 20f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 2f)
                moveTo(14.58f, 19.58f)
                lineTo(12.09f, 13.27f)
                lineTo(12.95f, 12.77f)
                lineTo(17.17f, 18.08f)
                moveTo(12f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 11f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 11f)
                moveTo(7.12f, 22.54f)
                lineTo(5f, 20.41f)
                lineTo(2.88f, 22.54f)
                lineTo(1.46f, 21.12f)
                lineTo(3.59f, 19f)
                lineTo(1.46f, 16.88f)
                lineTo(2.88f, 15.46f)
                lineTo(5f, 17.59f)
                lineTo(7.12f, 15.46f)
                lineTo(8.54f, 16.88f)
                lineTo(6.41f, 19f)
                lineTo(8.54f, 21.12f)
                close()
            }
        }.build()

        return _HarddiskRemove!!
    }

@Suppress("ObjectPropertyName")
private var _HarddiskRemove: ImageVector? = null
