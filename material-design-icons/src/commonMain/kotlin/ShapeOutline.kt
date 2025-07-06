package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShapeOutline: ImageVector
    get() {
        if (_ShapeOutline != null) {
            return _ShapeOutline!!
        }
        _ShapeOutline = ImageVector.Builder(
            name = "ShapeOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 13.5f)
                verticalLineTo(21.5f)
                horizontalLineTo(3f)
                verticalLineTo(13.5f)
                horizontalLineTo(11f)
                moveTo(9f, 15.5f)
                horizontalLineTo(5f)
                verticalLineTo(19.5f)
                horizontalLineTo(9f)
                verticalLineTo(15.5f)
                moveTo(12f, 2f)
                lineTo(17.5f, 11f)
                horizontalLineTo(6.5f)
                lineTo(12f, 2f)
                moveTo(12f, 5.86f)
                lineTo(10.08f, 9f)
                horizontalLineTo(13.92f)
                lineTo(12f, 5.86f)
                moveTo(17.5f, 13f)
                curveTo(20f, 13f, 22f, 15f, 22f, 17.5f)
                curveTo(22f, 20f, 20f, 22f, 17.5f, 22f)
                curveTo(15f, 22f, 13f, 20f, 13f, 17.5f)
                curveTo(13f, 15f, 15f, 13f, 17.5f, 13f)
                moveTo(17.5f, 15f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 17.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 20f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 17.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 15f)
                close()
            }
        }.build()

        return _ShapeOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ShapeOutline: ImageVector? = null
