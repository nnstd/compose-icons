package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Diameter: ImageVector
    get() {
        if (_Diameter != null) {
            return _Diameter!!
        }
        _Diameter = ImageVector.Builder(
            name = "Diameter",
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
                horizontalLineTo(7f)
                verticalLineTo(15f)
                lineTo(4f, 12f)
                lineTo(7f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                lineTo(20f, 12f)
                lineTo(17f, 15f)
                close()
            }
        }.build()

        return _Diameter!!
    }

@Suppress("ObjectPropertyName")
private var _Diameter: ImageVector? = null
