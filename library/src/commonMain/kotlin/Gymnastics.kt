package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Gymnastics: ImageVector
    get() {
        if (_Gymnastics != null) {
            return _Gymnastics!!
        }
        _Gymnastics = ImageVector.Builder(
            name = "Gymnastics",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 6f)
                curveTo(4f, 4.9f, 4.9f, 4f, 6f, 4f)
                reflectiveCurveTo(8f, 4.9f, 8f, 6f)
                reflectiveCurveTo(7.1f, 8f, 6f, 8f)
                reflectiveCurveTo(4f, 7.1f, 4f, 6f)
                moveTo(1f, 9f)
                horizontalLineTo(7f)
                lineTo(14f, 4f)
                lineTo(15.31f, 5.5f)
                lineTo(11.14f, 8.5f)
                horizontalLineTo(14f)
                lineTo(21.8f, 4f)
                lineTo(23f, 5.4f)
                lineTo(14.5f, 12f)
                lineTo(14f, 22f)
                horizontalLineTo(12f)
                lineTo(11.5f, 12f)
                lineTo(8f, 11f)
                horizontalLineTo(1f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _Gymnastics!!
    }

@Suppress("ObjectPropertyName")
private var _Gymnastics: ImageVector? = null
