package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Bulldozer: ImageVector
    get() {
        if (_Bulldozer != null) {
            return _Bulldozer!!
        }
        _Bulldozer = ImageVector.Builder(
            name = "Bulldozer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5f)
                verticalLineTo(10f)
                curveTo(2.54f, 10f, 2.14f, 10.31f, 2.03f, 10.76f)
                verticalLineTo(13.97f)
                horizontalLineTo(2.29f)
                curveTo(2.65f, 13.37f, 3.3f, 13f, 4f, 13f)
                horizontalLineTo(13f)
                curveTo(13.7f, 13f, 14.35f, 13.37f, 14.71f, 13.97f)
                horizontalLineTo(16.03f)
                lineTo(16f, 11f)
                verticalLineTo(11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 10f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 8f)
                verticalLineTo(10f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 4f)
                horizontalLineTo(4f)
                moveTo(5f, 6f)
                horizontalLineTo(7f)
                verticalLineTo(10f)
                lineTo(7f, 11f)
                horizontalLineTo(5f)
                verticalLineTo(6f)
                moveTo(17f, 11f)
                verticalLineTo(19f)
                horizontalLineTo(22f)
                verticalLineTo(18f)
                lineTo(19f, 17f)
                lineTo(18f, 11f)
                horizontalLineTo(17f)
                moveTo(4f, 15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 19f)
                horizontalLineTo(13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 15f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return _Bulldozer!!
    }

@Suppress("ObjectPropertyName")
private var _Bulldozer: ImageVector? = null
