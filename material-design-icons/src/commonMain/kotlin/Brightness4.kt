package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Brightness4: ImageVector
    get() {
        if (_Brightness4 != null) {
            return _Brightness4!!
        }
        _Brightness4 = ImageVector.Builder(
            name = "Brightness4",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 18f)
                curveTo(11.11f, 18f, 10.26f, 17.8f, 9.5f, 17.45f)
                curveTo(11.56f, 16.5f, 13f, 14.42f, 13f, 12f)
                curveTo(13f, 9.58f, 11.56f, 7.5f, 9.5f, 6.55f)
                curveTo(10.26f, 6.2f, 11.11f, 6f, 12f, 6f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 12f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 18f)
                moveTo(20f, 8.69f)
                verticalLineTo(4f)
                horizontalLineTo(15.31f)
                lineTo(12f, 0.69f)
                lineTo(8.69f, 4f)
                horizontalLineTo(4f)
                verticalLineTo(8.69f)
                lineTo(0.69f, 12f)
                lineTo(4f, 15.31f)
                verticalLineTo(20f)
                horizontalLineTo(8.69f)
                lineTo(12f, 23.31f)
                lineTo(15.31f, 20f)
                horizontalLineTo(20f)
                verticalLineTo(15.31f)
                lineTo(23.31f, 12f)
                lineTo(20f, 8.69f)
                close()
            }
        }.build()

        return _Brightness4!!
    }

@Suppress("ObjectPropertyName")
private var _Brightness4: ImageVector? = null
