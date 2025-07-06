package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VectorTriangle: ImageVector
    get() {
        if (_VectorTriangle != null) {
            return _VectorTriangle!!
        }
        _VectorTriangle = ImageVector.Builder(
            name = "VectorTriangle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 3f)
                verticalLineTo(9f)
                horizontalLineTo(9.73f)
                lineTo(5.79f, 16f)
                horizontalLineTo(2f)
                verticalLineTo(22f)
                horizontalLineTo(8f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                verticalLineTo(16f)
                horizontalLineTo(18.21f)
                lineTo(14.27f, 9f)
                horizontalLineTo(15f)
                verticalLineTo(3f)
                moveTo(11f, 5f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                moveTo(12f, 9.04f)
                lineTo(16f, 16.15f)
                verticalLineTo(18f)
                horizontalLineTo(8f)
                verticalLineTo(16.15f)
                moveTo(4f, 18f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                moveTo(18f, 18f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
            }
        }.build()

        return _VectorTriangle!!
    }

@Suppress("ObjectPropertyName")
private var _VectorTriangle: ImageVector? = null
