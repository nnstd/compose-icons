package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ForestOutline: ImageVector
    get() {
        if (_ForestOutline != null) {
            return _ForestOutline!!
        }
        _ForestOutline = ImageVector.Builder(
            name = "ForestOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.19f, 18f)
                horizontalLineTo(24f)
                lineTo(20.14f, 12f)
                horizontalLineTo(22f)
                lineTo(15f, 2f)
                lineTo(12.61f, 5.41f)
                lineTo(17.92f, 13f)
                horizontalLineTo(15.97f)
                lineTo(19.19f, 18f)
                moveTo(16f, 12f)
                lineTo(9f, 2f)
                lineTo(2f, 12f)
                horizontalLineTo(3.86f)
                lineTo(0f, 18f)
                horizontalLineTo(7f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                horizontalLineTo(18f)
                lineTo(14.14f, 12f)
                horizontalLineTo(16f)
                moveTo(12.16f, 10f)
                horizontalLineTo(10.5f)
                lineTo(14.34f, 16f)
                horizontalLineTo(3.67f)
                lineTo(7.53f, 10f)
                horizontalLineTo(5.84f)
                lineTo(9f, 5.5f)
                lineTo(12.16f, 10f)
                moveTo(13f, 19f)
                verticalLineTo(22f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _ForestOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ForestOutline: ImageVector? = null
