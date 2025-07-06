package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Windsock: ImageVector
    get() {
        if (_Windsock != null) {
            return _Windsock!!
        }
        _Windsock = ImageVector.Builder(
            name = "Windsock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 5f)
                verticalLineTo(13f)
                lineTo(22f, 11f)
                verticalLineTo(7f)
                lineTo(7f, 5f)
                moveTo(10f, 6.91f)
                lineTo(13f, 7.31f)
                verticalLineTo(10.69f)
                lineTo(10f, 11.09f)
                verticalLineTo(6.91f)
                moveTo(16f, 7.71f)
                lineTo(19f, 8.11f)
                verticalLineTo(9.89f)
                lineTo(16f, 10.29f)
                verticalLineTo(7.71f)
                moveTo(5f, 10f)
                verticalLineTo(11f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineTo(4f)
                curveTo(3f, 3.45f, 3.45f, 3f, 4f, 3f)
                reflectiveCurveTo(5f, 3.45f, 5f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                horizontalLineTo(5f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _Windsock!!
    }

@Suppress("ObjectPropertyName")
private var _Windsock: ImageVector? = null
