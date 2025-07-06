package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RunFast: ImageVector
    get() {
        if (_RunFast != null) {
            return _RunFast!!
        }
        _RunFast = ImageVector.Builder(
            name = "RunFast",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 5.5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 3.5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 1.5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 3.5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 5.5f)
                moveTo(12.9f, 19.4f)
                lineTo(13.9f, 15f)
                lineTo(16f, 17f)
                verticalLineTo(23f)
                horizontalLineTo(18f)
                verticalLineTo(15.5f)
                lineTo(15.9f, 13.5f)
                lineTo(16.5f, 10.5f)
                curveTo(17.89f, 12.09f, 19.89f, 13f, 22f, 13f)
                verticalLineTo(11f)
                curveTo(20.24f, 11.03f, 18.6f, 10.11f, 17.7f, 8.6f)
                lineTo(16.7f, 7f)
                curveTo(16.34f, 6.4f, 15.7f, 6f, 15f, 6f)
                curveTo(14.7f, 6f, 14.5f, 6.1f, 14.2f, 6.1f)
                lineTo(9f, 8.3f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(9.6f)
                lineTo(12.8f, 8.9f)
                lineTo(11.2f, 17f)
                lineTo(6.3f, 16f)
                lineTo(5.9f, 18f)
                lineTo(12.9f, 19.4f)
                moveTo(4f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 7f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                moveTo(5f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                moveTo(3f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 11f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                close()
            }
        }.build()

        return _RunFast!!
    }

@Suppress("ObjectPropertyName")
private var _RunFast: ImageVector? = null
