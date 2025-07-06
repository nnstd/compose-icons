package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Leek: ImageVector
    get() {
        if (_Leek != null) {
            return _Leek!!
        }
        _Leek = ImageVector.Builder(
            name = "Leek",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 2f)
                verticalLineTo(5.55f)
                lineTo(12f, 7.55f)
                lineTo(14f, 5.55f)
                verticalLineTo(2f)
                horizontalLineTo(10f)
                moveTo(6.34f, 4f)
                lineTo(3.87f, 6.5f)
                lineTo(15f, 17.62f)
                verticalLineTo(12.67f)
                lineTo(6.34f, 4f)
                moveTo(17.66f, 4f)
                lineTo(13.06f, 8.61f)
                lineTo(15.54f, 11.09f)
                lineTo(20.13f, 6.5f)
                lineTo(17.66f, 4f)
                moveTo(9f, 13.74f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 22f)
                horizontalLineTo(13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 20f)
                verticalLineTo(19.74f)
                lineTo(13f, 17.74f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                verticalLineTo(15.74f)
                lineTo(9f, 13.74f)
                close()
            }
        }.build()

        return _Leek!!
    }

@Suppress("ObjectPropertyName")
private var _Leek: ImageVector? = null
