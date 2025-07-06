package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SpiderThread: ImageVector
    get() {
        if (_SpiderThread != null) {
            return _SpiderThread!!
        }
        _SpiderThread = ImageVector.Builder(
            name = "SpiderThread",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 2f)
                verticalLineTo(7.08f)
                arcTo(5.47f, 5.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 7f)
                arcTo(5.47f, 5.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 7.08f)
                verticalLineTo(2f)
                moveTo(16.9f, 15f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.73f, 15.55f)
                lineTo(20f, 17.42f)
                verticalLineTo(22f)
                horizontalLineTo(18f)
                verticalLineTo(18.58f)
                lineTo(15.74f, 17.29f)
                arcTo(4.94f, 4.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.26f, 17.29f)
                lineTo(6f, 18.58f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                verticalLineTo(17.42f)
                lineTo(7.27f, 15.55f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.1f, 15f)
                horizontalLineTo(5.3f)
                lineTo(2.55f, 16.83f)
                lineTo(1.45f, 15.17f)
                lineTo(4.7f, 13f)
                horizontalLineTo(7.1f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.37f, 12.12f)
                lineTo(5.81f, 11.12f)
                lineTo(2.24f, 12f)
                lineTo(1.76f, 10f)
                lineTo(6.19f, 8.92f)
                lineTo(8.5f, 10.45f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 10.45f)
                lineTo(17.77f, 8.92f)
                lineTo(22.24f, 10f)
                lineTo(21.76f, 12f)
                lineTo(18.19f, 11.11f)
                lineTo(16.63f, 12.11f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.9f, 13f)
                horizontalLineTo(19.3f)
                lineTo(22.55f, 15.16f)
                lineTo(21.45f, 16.82f)
                lineTo(18.7f, 15f)
                moveTo(11f, 14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 10f, 15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 14f)
                moveTo(15f, 14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14f, 15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 14f)
                close()
            }
        }.build()

        return _SpiderThread!!
    }

@Suppress("ObjectPropertyName")
private var _SpiderThread: ImageVector? = null
