package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Gift: ImageVector
    get() {
        if (_Gift != null) {
            return _Gift!!
        }
        _Gift = ImageVector.Builder(
            name = "Gift",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.06f, 1.93f)
                curveTo(7.17f, 1.92f, 5.33f, 3.74f, 6.17f, 6f)
                horizontalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 8f)
                verticalLineTo(10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 11f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(22f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 10f)
                verticalLineTo(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 6f)
                horizontalLineTo(17.83f)
                curveTo(19f, 2.73f, 14.6f, 0.42f, 12.57f, 3.24f)
                lineTo(12f, 4f)
                lineTo(11.43f, 3.22f)
                curveTo(10.8f, 2.33f, 9.93f, 1.94f, 9.06f, 1.93f)
                moveTo(9f, 4f)
                curveTo(9.89f, 4f, 10.34f, 5.08f, 9.71f, 5.71f)
                curveTo(9.08f, 6.34f, 8f, 5.89f, 8f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 4f)
                moveTo(15f, 4f)
                curveTo(15.89f, 4f, 16.34f, 5.08f, 15.71f, 5.71f)
                curveTo(15.08f, 6.34f, 14f, 5.89f, 14f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 4f)
                moveTo(2f, 12f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 22f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 20f)
                verticalLineTo(12f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                horizontalLineTo(2f)
                close()
            }
        }.build()

        return _Gift!!
    }

@Suppress("ObjectPropertyName")
private var _Gift: ImageVector? = null
