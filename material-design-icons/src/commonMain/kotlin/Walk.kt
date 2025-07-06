package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Walk: ImageVector
    get() {
        if (_Walk != null) {
            return _Walk!!
        }
        _Walk = ImageVector.Builder(
            name = "Walk",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.12f, 10f)
                horizontalLineTo(19f)
                verticalLineTo(8.2f)
                horizontalLineTo(15.38f)
                lineTo(13.38f, 4.87f)
                curveTo(13.08f, 4.37f, 12.54f, 4.03f, 11.92f, 4.03f)
                curveTo(11.74f, 4.03f, 11.58f, 4.06f, 11.42f, 4.11f)
                lineTo(6f, 5.8f)
                verticalLineTo(11f)
                horizontalLineTo(7.8f)
                verticalLineTo(7.33f)
                lineTo(9.91f, 6.67f)
                lineTo(6f, 22f)
                horizontalLineTo(7.8f)
                lineTo(10.67f, 13.89f)
                lineTo(13f, 17f)
                verticalLineTo(22f)
                horizontalLineTo(14.8f)
                verticalLineTo(15.59f)
                lineTo(12.31f, 11.05f)
                lineTo(13.04f, 8.18f)
                moveTo(14f, 3.8f)
                curveTo(15f, 3.8f, 15.8f, 3f, 15.8f, 2f)
                curveTo(15.8f, 1f, 15f, 0.2f, 14f, 0.2f)
                curveTo(13f, 0.2f, 12.2f, 1f, 12.2f, 2f)
                curveTo(12.2f, 3f, 13f, 3.8f, 14f, 3.8f)
                close()
            }
        }.build()

        return _Walk!!
    }

@Suppress("ObjectPropertyName")
private var _Walk: ImageVector? = null
