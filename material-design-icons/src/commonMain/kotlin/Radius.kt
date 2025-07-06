package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Radius: ImageVector
    get() {
        if (_Radius != null) {
            return _Radius!!
        }
        _Radius = ImageVector.Builder(
            name = "Radius",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                moveTo(17f, 15f)
                verticalLineTo(13f)
                horizontalLineTo(13.72f)
                curveTo(13.36f, 13.62f, 12.71f, 14f, 12f, 14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 10f)
                curveTo(12.71f, 10f, 13.36f, 10.38f, 13.72f, 11f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                lineTo(20f, 12f)
                lineTo(17f, 15f)
                close()
            }
        }.build()

        return _Radius!!
    }

@Suppress("ObjectPropertyName")
private var _Radius: ImageVector? = null
